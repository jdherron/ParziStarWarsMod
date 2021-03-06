package com.parzivail.pswm.models.vehicles;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTIE extends ModelBase
{
	// fields
	ModelRenderer Cockpit;
	ModelRenderer Wing_Section_1;
	ModelRenderer Wing_Section_2;
	ModelRenderer Body_Panel_1;
	ModelRenderer Body_Panel_2;
	ModelRenderer Body_Panel_3;
	ModelRenderer Wing_Section_3;
	ModelRenderer Wing_Section_4;
	ModelRenderer Wing_Section_5;
	ModelRenderer Wing_Section_6;
	ModelRenderer Wing_Section_7;
	ModelRenderer Wing_Section_8;
	ModelRenderer Wing_Section_9;
	ModelRenderer Wing_Section_10;
	ModelRenderer Wing_Section_11;
	ModelRenderer Wing_Section_12;
	ModelRenderer Body_Panel_4;
	ModelRenderer Laser_1;
	ModelRenderer Laser_2;
	ModelRenderer Body_Panel_5;
	ModelRenderer Body_Panel_6;
	ModelRenderer Body_Panel_7;
	ModelRenderer Body_Panel_8;
	ModelRenderer Body_Panel_9;
	ModelRenderer Wing_1;
	ModelRenderer Wing_2;
	ModelRenderer Wing_3;
	ModelRenderer Wing_4;
	ModelRenderer Wing_5;
	ModelRenderer Wing_6;
	ModelRenderer Wing_7;
	ModelRenderer Wing_8;
	ModelRenderer Wing_9;
	ModelRenderer Wing_10;
	ModelRenderer Wing_11;
	ModelRenderer Wing_12;
	ModelRenderer Wing_13;
	ModelRenderer Wing_14;
	ModelRenderer Wing_15;
	ModelRenderer Wing_16;
	ModelRenderer Wing_17;
	ModelRenderer Wing_18;

	public ModelTIE()
	{
		this.textureWidth = 512;
		this.textureHeight = 512;

		this.Cockpit = new ModelRenderer(this, 42, 42);
		this.Cockpit.addBox(-6F, -22F, -6F, 12, 12, 12);
		this.Cockpit.setRotationPoint(0F, 21F, 0F);
		this.Cockpit.setTextureSize(64, 32);
		this.Cockpit.mirror = true;
		this.setRotation(this.Cockpit, 0F, 0F, 0F);
		this.Wing_Section_1 = new ModelRenderer(this, 0, 33);
		this.Wing_Section_1.addBox(18F, -34F, -8F, 1, 36, 16);
		this.Wing_Section_1.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_1.setTextureSize(64, 32);
		this.Wing_Section_1.mirror = true;
		this.setRotation(this.Wing_Section_1, 0F, 0F, 0F);
		this.Wing_Section_2 = new ModelRenderer(this, 0, 92);
		this.Wing_Section_2.addBox(-19F, -34F, -8F, 1, 36, 16);
		this.Wing_Section_2.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_2.setTextureSize(64, 32);
		this.Wing_Section_2.mirror = true;
		this.setRotation(this.Wing_Section_2, 0F, 0F, 0F);
		this.Body_Panel_1 = new ModelRenderer(this, 0, 151);
		this.Body_Panel_1.addBox(-12F, -20F, -1.5F, 24, 8, 3);
		this.Body_Panel_1.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_1.setTextureSize(64, 32);
		this.Body_Panel_1.mirror = true;
		this.setRotation(this.Body_Panel_1, 0F, 0F, 0F);
		this.Body_Panel_2 = new ModelRenderer(this, 0, 168);
		this.Body_Panel_2.addBox(-10.5F, -18.5F, -2.5F, 21, 5, 5);
		this.Body_Panel_2.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_2.setTextureSize(64, 32);
		this.Body_Panel_2.mirror = true;
		this.setRotation(this.Body_Panel_2, 0F, 0F, 0F);
		this.Body_Panel_3 = new ModelRenderer(this, 0, 185);
		this.Body_Panel_3.addBox(-20F, -17.5F, -2F, 40, 3, 4);
		this.Body_Panel_3.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_3.setTextureSize(64, 32);
		this.Body_Panel_3.mirror = true;
		this.setRotation(this.Body_Panel_3, 0F, 0F, 0F);
		this.Wing_Section_3 = new ModelRenderer(this, 0, 199);
		this.Wing_Section_3.addBox(18F, -32F, -13.75F, 1, 18, 16);
		this.Wing_Section_3.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_3.setTextureSize(64, 32);
		this.Wing_Section_3.mirror = true;
		this.setRotation(this.Wing_Section_3, -0.1745329F, 0F, 0F);
		this.Wing_Section_4 = new ModelRenderer(this, 0, 241);
		this.Wing_Section_4.addBox(18F, -18F, -8.1F, 1, 18, 16);
		this.Wing_Section_4.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_4.setTextureSize(64, 32);
		this.Wing_Section_4.mirror = true;
		this.setRotation(this.Wing_Section_4, 0.1745329F, 0F, 0F);
		this.Wing_Section_5 = new ModelRenderer(this, 0, 283);
		this.Wing_Section_5.addBox(18F, -32F, -2.25F, 1, 18, 16);
		this.Wing_Section_5.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_5.setTextureSize(64, 32);
		this.Wing_Section_5.mirror = true;
		this.setRotation(this.Wing_Section_5, 0.1745329F, 0F, 0F);
		this.Wing_Section_6 = new ModelRenderer(this, 0, 326);
		this.Wing_Section_6.addBox(18F, -18F, -7.9F, 1, 18, 16);
		this.Wing_Section_6.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_6.setTextureSize(64, 32);
		this.Wing_Section_6.mirror = true;
		this.setRotation(this.Wing_Section_6, -0.1745329F, 0F, 0F);
		this.Wing_Section_7 = new ModelRenderer(this, 0, 367);
		this.Wing_Section_7.addBox(-19F, -32F, -13.8F, 1, 18, 16);
		this.Wing_Section_7.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_7.setTextureSize(64, 32);
		this.Wing_Section_7.mirror = true;
		this.setRotation(this.Wing_Section_7, -0.1745329F, 0F, 0F);
		this.Wing_Section_8 = new ModelRenderer(this, 0, 409);
		this.Wing_Section_8.addBox(-19F, -18F, -8.2F, 1, 18, 16);
		this.Wing_Section_8.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_8.setTextureSize(64, 32);
		this.Wing_Section_8.mirror = true;
		this.setRotation(this.Wing_Section_8, 0.1745329F, 0F, 0F);
		this.Wing_Section_9 = new ModelRenderer(this, 0, 451);
		this.Wing_Section_9.addBox(-19F, -32F, -2.1F, 1, 18, 16);
		this.Wing_Section_9.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_9.setTextureSize(64, 32);
		this.Wing_Section_9.mirror = true;
		this.setRotation(this.Wing_Section_9, 0.1745329F, 0F, 0F);
		this.Wing_Section_10 = new ModelRenderer(this, 42, 0);
		this.Wing_Section_10.addBox(-19F, -18F, -7.8F, 1, 18, 16);
		this.Wing_Section_10.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_10.setTextureSize(64, 32);
		this.Wing_Section_10.mirror = true;
		this.setRotation(this.Wing_Section_10, -0.1745329F, 0F, 0F);
		this.Wing_Section_11 = new ModelRenderer(this, 85, 0);
		this.Wing_Section_11.addBox(17F, -20F, -4F, 3, 8, 8);
		this.Wing_Section_11.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_11.setTextureSize(64, 32);
		this.Wing_Section_11.mirror = true;
		this.setRotation(this.Wing_Section_11, 0F, 0F, 0F);
		this.Wing_Section_12 = new ModelRenderer(this, 116, 0);
		this.Wing_Section_12.addBox(-20F, -20F, -4F, 3, 8, 8);
		this.Wing_Section_12.setRotationPoint(0F, 21F, 0F);
		this.Wing_Section_12.setTextureSize(64, 32);
		this.Wing_Section_12.mirror = true;
		this.setRotation(this.Wing_Section_12, 0F, 0F, 0F);
		this.Body_Panel_4 = new ModelRenderer(this, 147, 0);
		this.Body_Panel_4.addBox(-14F, -19F, -1F, 28, 6, 2);
		this.Body_Panel_4.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_4.setTextureSize(64, 32);
		this.Body_Panel_4.mirror = true;
		this.setRotation(this.Body_Panel_4, 0F, 0F, 0F);
		this.Laser_1 = new ModelRenderer(this, 216, 0);
		this.Laser_1.addBox(1.5F, -12F, -6.5F, 1, 1, 3);
		this.Laser_1.setRotationPoint(0F, 21F, 0F);
		this.Laser_1.setTextureSize(64, 32);
		this.Laser_1.mirror = true;
		this.setRotation(this.Laser_1, 0F, 0F, 0F);
		this.Laser_2 = new ModelRenderer(this, 234, 0);
		this.Laser_2.addBox(-2.5F, -12F, -6.5F, 1, 1, 3);
		this.Laser_2.setRotationPoint(0F, 21F, 0F);
		this.Laser_2.setTextureSize(64, 32);
		this.Laser_2.mirror = true;
		this.setRotation(this.Laser_2, 0F, 0F, 0F);
		this.Body_Panel_5 = new ModelRenderer(this, 42, 98);
		this.Body_Panel_5.addBox(5F, -21F, -5F, 2, 10, 10);
		this.Body_Panel_5.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_5.setTextureSize(64, 32);
		this.Body_Panel_5.mirror = true;
		this.setRotation(this.Body_Panel_5, 0F, 0F, 0F);
		this.Body_Panel_6 = new ModelRenderer(this, 42, 72);
		this.Body_Panel_6.addBox(-7F, -21F, -5F, 2, 10, 10);
		this.Body_Panel_6.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_6.setTextureSize(64, 32);
		this.Body_Panel_6.mirror = true;
		this.setRotation(this.Body_Panel_6, 0F, 0F, 0F);
		this.Body_Panel_7 = new ModelRenderer(this, 42, 126);
		this.Body_Panel_7.addBox(-5F, -23F, -5F, 10, 2, 10);
		this.Body_Panel_7.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_7.setTextureSize(64, 32);
		this.Body_Panel_7.mirror = true;
		this.setRotation(this.Body_Panel_7, 0F, 0F, 0F);
		this.Body_Panel_8 = new ModelRenderer(this, 100, 43);
		this.Body_Panel_8.addBox(-5F, -11F, -5F, 10, 2, 10);
		this.Body_Panel_8.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_8.setTextureSize(64, 32);
		this.Body_Panel_8.mirror = true;
		this.setRotation(this.Body_Panel_8, 0F, 0F, 0F);
		this.Body_Panel_9 = new ModelRenderer(this, 102, 63);
		this.Body_Panel_9.addBox(-5F, -21F, 5F, 10, 10, 2);
		this.Body_Panel_9.setRotationPoint(0F, 21F, 0F);
		this.Body_Panel_9.setTextureSize(64, 32);
		this.Body_Panel_9.mirror = true;
		this.setRotation(this.Body_Panel_9, 0F, 0F, 0F);
		this.Wing_1 = new ModelRenderer(this, 275, 0);
		this.Wing_1.addBox(-19.5F, 1F, -9F, 2, 2, 18);
		this.Wing_1.setRotationPoint(0F, 21F, 0F);
		this.Wing_1.setTextureSize(64, 32);
		this.Wing_1.mirror = true;
		this.setRotation(this.Wing_1, 0F, 0F, 0F);
		this.Wing_2 = new ModelRenderer(this, 275, 27);
		this.Wing_2.addBox(-19.5F, -32.8F, -15F, 2, 19, 2);
		this.Wing_2.setRotationPoint(0F, 21F, 0F);
		this.Wing_2.setTextureSize(64, 32);
		this.Wing_2.mirror = true;
		this.setRotation(this.Wing_2, -0.1745329F, 0F, 0F);
		this.Wing_3 = new ModelRenderer(this, 275, 56);
		this.Wing_3.addBox(-19.5F, -35F, -9F, 2, 2, 18);
		this.Wing_3.setRotationPoint(0F, 21F, 0F);
		this.Wing_3.setTextureSize(64, 32);
		this.Wing_3.mirror = true;
		this.setRotation(this.Wing_3, 0F, 0F, 0F);
		this.Wing_4 = new ModelRenderer(this, 275, 85);
		this.Wing_4.addBox(-19.5F, -32.8F, 13F, 2, 19, 2);
		this.Wing_4.setRotationPoint(0F, 21F, 0F);
		this.Wing_4.setTextureSize(64, 32);
		this.Wing_4.mirror = true;
		this.setRotation(this.Wing_4, 0.1745329F, 0F, 0F);
		this.Wing_5 = new ModelRenderer(this, 275, 113);
		this.Wing_5.addBox(-19.5F, -17F, -11F, 2, 2, 22);
		this.Wing_5.setRotationPoint(0F, 21F, 0F);
		this.Wing_5.setTextureSize(64, 32);
		this.Wing_5.mirror = true;
		this.setRotation(this.Wing_5, 0F, 0F, 0F);
		this.Wing_6 = new ModelRenderer(this, 275, 148);
		this.Wing_6.addBox(17.5F, 1F, -9F, 2, 2, 18);
		this.Wing_6.setRotationPoint(0F, 21F, 0F);
		this.Wing_6.setTextureSize(64, 32);
		this.Wing_6.mirror = true;
		this.setRotation(this.Wing_6, 0F, 0F, 0F);
		this.Wing_7 = new ModelRenderer(this, 275, 178);
		this.Wing_7.addBox(-19.5F, -18.6F, 7.3F, 2, 20, 2);
		this.Wing_7.setRotationPoint(0F, 21F, 0F);
		this.Wing_7.setTextureSize(64, 32);
		this.Wing_7.mirror = true;
		this.setRotation(this.Wing_7, -0.1745329F, 0F, 0F);
		this.Wing_8 = new ModelRenderer(this, 275, 209);
		this.Wing_8.addBox(17.5F, -32.8F, 13F, 2, 19, 2);
		this.Wing_8.setRotationPoint(0F, 21F, 0F);
		this.Wing_8.setTextureSize(64, 32);
		this.Wing_8.mirror = true;
		this.setRotation(this.Wing_8, 0.1745329F, 0F, 0F);
		this.Wing_9 = new ModelRenderer(this, 275, 240);
		this.Wing_9.addBox(-19.5F, -33.8F, 5F, 2, 39, 2);
		this.Wing_9.setRotationPoint(0F, 21F, 0F);
		this.Wing_9.setTextureSize(64, 32);
		this.Wing_9.mirror = true;
		this.setRotation(this.Wing_9, 0.3839724F, 0F, 0F);
		this.Wing_10 = new ModelRenderer(this, 275, 294);
		this.Wing_10.addBox(-19.5F, -18.6F, -9.3F, 2, 20, 2);
		this.Wing_10.setRotationPoint(0F, 21F, 0F);
		this.Wing_10.setTextureSize(64, 32);
		this.Wing_10.mirror = true;
		this.setRotation(this.Wing_10, 0.1745329F, 0F, 0F);
		this.Wing_11 = new ModelRenderer(this, 275, 324);
		this.Wing_11.addBox(17.5F, -18.6F, 7.3F, 2, 20, 2);
		this.Wing_11.setRotationPoint(0F, 21F, 0F);
		this.Wing_11.setTextureSize(64, 32);
		this.Wing_11.mirror = true;
		this.setRotation(this.Wing_11, -0.1745329F, 0F, 0F);
		this.Wing_12 = new ModelRenderer(this, 275, 357);
		this.Wing_12.addBox(17.5F, -18.6F, -9.3F, 2, 20, 2);
		this.Wing_12.setRotationPoint(0F, 21F, 0F);
		this.Wing_12.setTextureSize(64, 32);
		this.Wing_12.mirror = true;
		this.setRotation(this.Wing_12, 0.1745329F, 0F, 0F);
		this.Wing_13 = new ModelRenderer(this, 275, 390);
		this.Wing_13.addBox(17.5F, -35F, -9F, 2, 2, 18);
		this.Wing_13.setRotationPoint(0F, 21F, 0F);
		this.Wing_13.setTextureSize(64, 32);
		this.Wing_13.mirror = true;
		this.setRotation(this.Wing_13, 0F, 0F, 0F);
		this.Wing_14 = new ModelRenderer(this, 275, 420);
		this.Wing_14.addBox(17.5F, -32.8F, -15F, 2, 19, 2);
		this.Wing_14.setRotationPoint(0F, 21F, 0F);
		this.Wing_14.setTextureSize(64, 32);
		this.Wing_14.mirror = true;
		this.setRotation(this.Wing_14, -0.1745329F, 0F, 0F);
		this.Wing_15 = new ModelRenderer(this, 275, 449);
		this.Wing_15.addBox(-19.5F, -34.8F, -7F, 2, 39, 2);
		this.Wing_15.setRotationPoint(0F, 21F, 0F);
		this.Wing_15.setTextureSize(64, 32);
		this.Wing_15.mirror = true;
		this.setRotation(this.Wing_15, -0.3839724F, 0F, 0F);
		this.Wing_16 = new ModelRenderer(this, 345, 0);
		this.Wing_16.addBox(17.5F, -17F, -11F, 2, 2, 22);
		this.Wing_16.setRotationPoint(0F, 21F, 0F);
		this.Wing_16.setTextureSize(64, 32);
		this.Wing_16.mirror = true;
		this.setRotation(this.Wing_16, 0F, 0F, 0F);
		this.Wing_17 = new ModelRenderer(this, 345, 36);
		this.Wing_17.addBox(17.5F, -33.8F, 5F, 2, 39, 2);
		this.Wing_17.setRotationPoint(0F, 21F, 0F);
		this.Wing_17.setTextureSize(64, 32);
		this.Wing_17.mirror = true;
		this.setRotation(this.Wing_17, 0.3839724F, 0F, 0F);
		this.Wing_18 = new ModelRenderer(this, 345, 88);
		this.Wing_18.addBox(17.5F, -34.8F, -7F, 2, 39, 2);
		this.Wing_18.setRotationPoint(0F, 21F, 0F);
		this.Wing_18.setTextureSize(64, 32);
		this.Wing_18.mirror = true;
		this.setRotation(this.Wing_18, -0.3839724F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.Cockpit.render(f5);
		this.Wing_Section_1.render(f5);
		this.Wing_Section_2.render(f5);
		this.Body_Panel_1.render(f5);
		this.Body_Panel_2.render(f5);
		this.Body_Panel_3.render(f5);
		this.Wing_Section_3.render(f5);
		this.Wing_Section_4.render(f5);
		this.Wing_Section_5.render(f5);
		this.Wing_Section_6.render(f5);
		this.Wing_Section_7.render(f5);
		this.Wing_Section_8.render(f5);
		this.Wing_Section_9.render(f5);
		this.Wing_Section_10.render(f5);
		this.Wing_Section_11.render(f5);
		this.Wing_Section_12.render(f5);
		this.Body_Panel_4.render(f5);
		this.Laser_1.render(f5);
		this.Laser_2.render(f5);
		this.Body_Panel_5.render(f5);
		this.Body_Panel_6.render(f5);
		this.Body_Panel_7.render(f5);
		this.Body_Panel_8.render(f5);
		this.Body_Panel_9.render(f5);
		this.Wing_1.render(f5);
		this.Wing_2.render(f5);
		this.Wing_3.render(f5);
		this.Wing_4.render(f5);
		this.Wing_5.render(f5);
		this.Wing_6.render(f5);
		this.Wing_7.render(f5);
		this.Wing_8.render(f5);
		this.Wing_9.render(f5);
		this.Wing_10.render(f5);
		this.Wing_11.render(f5);
		this.Wing_12.render(f5);
		this.Wing_13.render(f5);
		this.Wing_14.render(f5);
		this.Wing_15.render(f5);
		this.Wing_16.render(f5);
		this.Wing_17.render(f5);
		this.Wing_18.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}