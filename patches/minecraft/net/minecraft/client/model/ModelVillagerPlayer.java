package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelVillagerPlayer extends ModelBase {

    public ModelRenderer villagerHead;
    public ModelRenderer villagerBody;
    public ModelRenderer villagerLeftArm;
    public ModelRenderer villagerRightArm;
    public ModelRenderer villagerLeftLeg;
    public ModelRenderer villagerRightLeg;

    public ModelVillagerPlayer() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        villagerHead = new ModelRenderer(this, 0, 0);
        villagerHead.addBox(-4F, -10F, -4F, 8, 10, 8);
        villagerHead.setRotationPoint(0F, 0F, 0F);

        villagerBody = new ModelRenderer(this, 16, 20);
        villagerBody.addBox(-4F, 0F, -3F, 8, 12, 6);
        villagerBody.setRotationPoint(0F, 0F, 0F);

        villagerLeftArm = new ModelRenderer(this, 44, 22);
        villagerLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
        villagerLeftArm.setRotationPoint(5F, 2F, 0F);

        villagerRightArm = new ModelRenderer(this, 44, 22);
        villagerRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
        villagerRightArm.setRotationPoint(-5F, 2F, 0F);

        villagerLeftLeg = new ModelRenderer(this, 0, 22);
        villagerLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        villagerLeftLeg.setRotationPoint(2F, 12F, 0F);

        villagerRightLeg = new ModelRenderer(this, 0, 22);
        villagerRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
        villagerRightLeg.setRotationPoint(-2F, 12F, 0F);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float age, float headYaw, float headPitch, float scale) {
        villagerHead.rotateAngleY = headYaw / 57.29578F;
        villagerHead.rotateAngleX = headPitch / 57.29578F;

        villagerLeftLeg.rotateAngleX = limbSwing * 1.5F * limbSwingAmount;
        villagerRightLeg.rotateAngleX = -limbSwing * 1.5F * limbSwingAmount;

        villagerLeftArm.rotateAngleX = -0.2F;
        villagerRightArm.rotateAngleX = -0.2F;

        villagerHead.render(scale);
        villagerBody.render(scale);
        villagerLeftArm.render(scale);
        villagerRightArm.render(scale);
        villagerLeftLeg.render(scale);
        villagerRightLeg.render(scale);
    }
}
