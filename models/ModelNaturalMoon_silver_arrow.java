// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class ModelNaturalMoon_silver_arrow extends EntityModel {
	private final ModelRenderer arrow;

	public ModelNaturalMoon_silver_arrow() {
		textureWidth = 32;
		textureHeight = 32;

		arrow = new ModelRenderer(this);
		arrow.setRotationPoint(0.0F, 18.5F, 0.0F);
		setRotationAngle(arrow, -1.5708F, 3.1416F, 0.0F);
		arrow.cubeList.add(new ModelBox(arrow, 0, 0, -0.5F, -0.5F, -13.0F, 1, 1, 10, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		arrow.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}