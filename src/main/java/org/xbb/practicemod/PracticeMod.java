package org.xbb.practicemod;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

//The main class of PRM.
@Mod(PracticeMod.modid)
public class PracticeMod {
    public static final String modid = "practicemod";
    @SuppressWarnings("unused")
    public static final String modShortName = "PRM";


    public PracticeMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,PRMconfig.prm_config);
    }

    static {
        System.out.println("############################################################");
        System.out.println(PRMconfig.numToSend.get());
        System.out.println(PRMconfig.messageToSend.get());
        System.out.println("############################################################");
    }
}
