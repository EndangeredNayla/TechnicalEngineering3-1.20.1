package ten3.core.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import ten3.core.block.mac.WateredMachine4;

public class Cell extends WateredMachine4
{

    public Cell(String name)
    {

        this(false, name);

    }

    public Cell(boolean solid, String name)
    {

        this(MapColor.METAL, SoundType.METAL, name, solid);

    }

    public Cell(MapColor m, SoundType s, String name, boolean solid)
    {

        super(m, s, name, solid);

    }

}
