package io.github.miningfatigue3bug.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Player.class)
abstract class PlayerMixin {
    @Redirect(
        method = "getDestroySpeed",
        at = @At(
            value = "INVOKE",
            target = "Ljava/lang/Math;pow(DD)D"
        ),
        require = 1
    )
    private double miningFatigue3Bug$restoreOldMultiplier(double base, double exponent) {
        if (base == 0.3D && exponent == 3.0D) {
            return (double) 0.0027F;
        }

        return Math.pow(base, exponent);
    }
}
