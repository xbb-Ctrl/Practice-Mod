package org.xbb.practicemod;

import net.minecraftforge.common.ForgeConfigSpec;

public class PRMconfig {
    public static final ForgeConfigSpec prm_config;

    public static ForgeConfigSpec.IntValue numToSend;
    public static ForgeConfigSpec.ConfigValue<String> messageToSend;

    static {
        var configBuilder = new ForgeConfigSpec.Builder();
        setupConfig(configBuilder);
        prm_config = configBuilder.build();
    }

    private static void setupConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("PRM settings");
        builder.push("general");
        builder.comment("The number you want to see.");
        numToSend = builder.defineInRange("Number",0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        builder.comment("The message you want to see.");
        messageToSend = builder.define("Message","Hello!");
        builder.pop();
    }
}
