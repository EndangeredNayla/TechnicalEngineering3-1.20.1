package ten3.core.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import ten3.init.template.DefBlock;

public class OreBlock extends DefBlock
{

    public OreBlock(double hs)
    {

        super(build(hs, hs, MapColor.STONE, SoundType.STONE, 0, true));

    }

}
