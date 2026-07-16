# Mining Fatigue III Bug

适用于 Minecraft Java Edition 26.3 的 Fabric 模组，将挖掘疲劳 III
从 Mojang 修复后的 `0.027` 倍挖掘速度恢复为旧 BUG 的 `0.0027` 倍。

A tiny Fabric mod for Minecraft Java Edition 26.3 that restores the old
Mining Fatigue III bug.

Minecraft 26.3 changed the mining-fatigue multiplier to the formula
`0.3^(amplifier + 1)`. For Mining Fatigue III (`amplifier == 2`), that fixes
the old `0.0027` multiplier to the mathematically consistent `0.027`.

This mod changes only Mining Fatigue III back to `0.0027`. Levels I, II, and
IV or higher retain the 26.3 behavior.

## Fun Fact

> 比起一个正常的 Mod，这个 Mod 更像是一个 Bug：它修复了“在 Mojang 修复挖掘疲劳 III
> 相关 Bug 之后，这个 Bug 没有办法正常工作”的 Bug。

> Rather than a normal mod, this mod is more like a bug: it fixes the bug where,
> after Mojang fixed the Mining Fatigue III bug, that bug could no longer work
> properly.

如果你想修复 Minecraft 26.2 及更早版本中的这个 BUG，请访问：
[glowstone314/MF3F](https://github.com/glowstone314/MF3F)。

If you want to fix this bug in Minecraft 26.2 and earlier versions, please
visit [glowstone314/MF3F](https://github.com/glowstone314/MF3F).

## Requirements

- Minecraft Java Edition 26.3-snapshot-3 or the 26.3 release series
- Fabric Loader 0.19.3 or newer
- Java 25

## Installation

1. Install Fabric Loader 0.19.3 or newer for Minecraft 26.3.
2. Put the release JAR in the Minecraft `mods` folder.
3. Install the mod on both the client and server when playing multiplayer.
