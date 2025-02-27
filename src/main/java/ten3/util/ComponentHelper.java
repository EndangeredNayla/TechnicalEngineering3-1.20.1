package ten3.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import ten3.TConst;

@OnlyCore
public class ComponentHelper
{

    @OnlyCore
    public static String getKey(String s)
    {

        return TConst.modid + "." + s;

    }

    @OnlyCore
    public static String exceptMachineOrGiveCell(String s)
    {

        if(s.startsWith("cell")) {
            return "cell";
        }

        return s.replace("machine_", "");

    }

    public static MutableComponent translated(String... ss)
    {

        MutableComponent t1 = null;

        for(String s : ss) {
            if(t1 == null) {
                t1 = Component.translatable(s);
            }
            else {
                t1.append(Component.translatable(s));
            }
        }

        return t1;

    }

    public static MutableComponent make(String... ss)
    {

        MutableComponent t1 = null;

        for(String s : ss) {
            if(t1 == null) {
                t1 = Component.literal(s);
            }
            else {
                t1.append(Component.literal(s));
            }
        }

        return t1;

    }

    public static ChatFormatting GOLD = ChatFormatting.GOLD;
    public static ChatFormatting GREEN = ChatFormatting.GREEN;
    public static ChatFormatting RED = ChatFormatting.RED;

    public static MutableComponent translated(ChatFormatting color, String... ss)
    {

        return translated(ss).withStyle(color);

    }

    public static MutableComponent make(ChatFormatting color, String... ss)
    {

        return make(ss).withStyle(color);

    }

}
