package ten3.plugin.jei.impl;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.recipe.RecipeType;
import ten3.TConst;
import ten3.lib.client.element.ElementBurnLeft;
import ten3.lib.client.element.ElementProgress;
import ten3.lib.recipe.FormsCombinedRecipe;
import ten3.plugin.jei.JeiCmCategory;
import ten3.plugin.jei.TEJeiPlugins;

import static ten3.lib.tile.CmScreen.handler;

public class CategoryCompressor extends JeiCmCategory
{

    ElementBurnLeft energy;
    ElementProgress progress;
    ElementBurnLeft left;

    public CategoryCompressor(RecipeType<FormsCombinedRecipe> name)
    {
        super(name, 0, 102, 150, 58);
    }

    public void init(FormsCombinedRecipe recipe, IRecipeLayoutBuilder bd)
    {
        drawer.setHandler(TConst.jeiHandler1);
        drawer.add(progress = new ElementProgress(73, 22, 22, 16, 27, 0, handler));
        drawer.add(energy = new ElementBurnLeft(6, 5, 14, 46, 0, 0, handler));
        drawer.add(left = new ElementBurnLeft(42, 23, 13, 13, 14, 0, handler));
        input(40, 2, 0, recipe, bd);
        input(40, 38, 1, recipe, bd);
        output(112, 21, 0, recipe, bd);
    }

    public void updateInfo(FormsCombinedRecipe recipe)
    {
        dynamic3e(progress, energy, left);
    }

    public RecipeType<FormsCombinedRecipe> getRecipeType()
    {
        return TEJeiPlugins.compressor;
    }

}
