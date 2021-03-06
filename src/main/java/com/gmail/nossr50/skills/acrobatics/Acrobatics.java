package com.gmail.nossr50.skills.acrobatics;

import com.gmail.nossr50.config.AdvancedConfig;
import com.gmail.nossr50.config.Config;
import com.gmail.nossr50.config.experience.ExperienceConfig;

public final class Acrobatics {
    public static int    dodgeMaxBonusLevel  = AdvancedConfig.getInstance().getDodgeMaxBonusLevel();
    public static double dodgeDamageModifier = AdvancedConfig.getInstance().getDodgeDamageModifier();
    public static double dodgeMaxChance      = AdvancedConfig.getInstance().getDodgeChanceMax();

    public static int    rollMaxBonusLevel = AdvancedConfig.getInstance().getRollMaxBonusLevel();
    public static double rollThreshold     = AdvancedConfig.getInstance().getRollDamageThreshold();
    public static double rollMaxChance     = AdvancedConfig.getInstance().getRollChanceMax();

    public static int    gracefulRollMaxBonusLevel = AdvancedConfig.getInstance().getGracefulRollMaxBonusLevel();
    public static double gracefulRollThreshold     = AdvancedConfig.getInstance().getGracefulRollDamageThreshold();
    public static double gracefulRollMaxChance     = AdvancedConfig.getInstance().getGracefulRollChanceMax();

    public static int dodgeXpModifier = ExperienceConfig.getInstance().getDodgeXPModifier();
    public static int rollXpModifier  = ExperienceConfig.getInstance().getRollXPModifier();
    public static int fallXpModifier  = ExperienceConfig.getInstance().getFallXPModifier();

    public static double featherFallXPModifier = ExperienceConfig.getInstance().getFeatherFallXPModifier();

    public static boolean afkLevelingDisabled    = Config.getInstance().getAcrobaticsAFKDisabled();
    public static boolean dodgeLightningDisabled = Config.getInstance().getDodgeLightningDisabled();

    private Acrobatics() {};

    protected static double calculateModifiedDodgeDamage(double damage, double damageModifier) {
        return Math.max(damage / damageModifier, 1.0);
    }

    protected static double calculateModifiedRollDamage(double damage, double damageThreshold) {
        return Math.max(damage - damageThreshold, 0.0);
    }
}
