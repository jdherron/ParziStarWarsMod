package com.parzivail.pswm.network;

import com.parzivail.pswm.utils.ForceUtils;
import com.parzivail.pswm.utils.ForceUtils.EntityCooldownEntry;
import com.parzivail.util.network.PMessage;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;

public class MessageAddEffectTo extends PMessage<MessageAddEffectTo>
{
	public EntityCooldownEntry entry;

	public MessageAddEffectTo()
	{
	}

	public MessageAddEffectTo(EntityCooldownEntry entry)
	{
		this.entry = entry;
	}

	@Override
	public IMessage handleMessage(MessageContext context)
	{
		ForceUtils.entitiesWithEffects.add(this.entry);
		return null;
	}
}
