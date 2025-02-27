package ten3.lib.client.element;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import ten3.util.RenderHelper;

public class ElementImage extends ElementBase
{

    public ElementImage(int x, int y, int width, int height, int xOff, int yOff, ResourceLocation resourceLocation)
    {

        super(x, y, width, height, xOff, yOff, resourceLocation);
    }

    @Override
    public void draw(GuiGraphics matrixStack)
    {

        RenderHelper.bindTexture(resourceLocation);
        RenderHelper.render(matrixStack, x, y, width, height, textureW, textureH, xOff, yOff, resourceLocation);

    }

}
