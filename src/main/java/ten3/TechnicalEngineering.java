package ten3;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ten3.core.world.OreFeatureGen;
import ten3.init.*;

@Mod(TConst.modid)
public class TechnicalEngineering
{

    public TechnicalEngineering()
    {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.regAll();
        BlockInit.BLOCKS.register(bus);

        FluidInit.regAll();
        FluidInit.FLUID_TYPES.register(bus);
        FluidInit.FLUIDS.register(bus);

        TileInit.regAll();
        TileInit.TILES.register(bus);

        ContInit.regAll();
        ContInit.CONS.register(bus);

        ItemInit.regAll();
        ItemInit.ITEMS.register(bus);

        RecipeInit.regAll();
        RecipeInit.RECIPES_SERIALS.register(bus);
        RecipeInit.RECIPES_TYPES.register(bus);

        TabInit.doRegistry();
        TabInit.TABS.register(bus);

        bus.register(new OreFeatureGen());
    }

}
