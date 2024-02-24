package ten3.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import ten3.TConst;
import ten3.lib.recipe.CmSerializer;
import ten3.lib.recipe.FormsCombinedRecipeSerializer;
import ten3.lib.recipe.RecipeTypeCm;

import java.util.HashMap;
import java.util.Map;

public class RecipeInit
{

    static Map<String, RegistryObject<RecipeSerializer<?>>> regs = new HashMap<>();
    public static Map<String, RegistryObject<RecipeType<?>>> types = new HashMap<>();
    public static final DeferredRegister<RecipeSerializer<?>> RECIPES_SERIALS = DeferredRegister.create(Registries.RECIPE_SERIALIZER, TConst.modid);
    public static final DeferredRegister<RecipeType<?>> RECIPES_TYPES = DeferredRegister.create(Registries.RECIPE_TYPE, TConst.modid);

    public static void regAll()
    {

        regFormsCombined("pulverizer", 1, 4);
        regFormsCombined("compressor", 2, 1);
        regFormsCombined("psionicant", 2, 1);
        regFormsCombined("induction_furnace", 3, 1);
        regFormsCombined("refiner", 2, 2);
    }

    public static void regFormsCombined(String id, int i, int o)
    {
        regRcp((new FormsCombinedRecipeSerializer(id, i, o)));
    }

    public static void regRcp(CmSerializer<?> s)
    {

        //serializerType without modid
        String id = s.id().getPath();
        RegistryObject<RecipeSerializer<?>> reg = RECIPES_SERIALS.register(id, () -> s);//singleton
        regs.put(id, reg);

        RecipeTypeCm<?> type = new RecipeTypeCm<>(id);
        RegistryObject<RecipeType<?>> reg2 = RECIPES_TYPES.register(id, () -> type);//singleton
        types.put(id, reg2);

    }

    public static RecipeSerializer<?> getRcpSRL(String id)
    {

        var rcp = regs.get(id);
        return rcp.get();

    }

    public static RecipeType<?> getRcpType(String id)
    {

        var rcp = types.get(id);
        return rcp.get();

    }

}
