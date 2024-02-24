package ten3.core.machine.useenergy.compressor;

import ten3.init.TabInit;
import ten3.init.template.DefItem;

public class Mould extends DefItem
{

    public Mould()
    {
        super(build(1));
    }

    public void fillGroup()
    {
        TabInit.TOOLS.add(this::getDefaultInstance);
    }
}
