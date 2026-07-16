# Mining Fatigue III Bug

中文：适用于 Minecraft Java Edition 26.3 的 Fabric 模组，将挖掘疲劳 III
从 Mojang 修复后的 `0.027` 倍挖掘速度恢复为旧 BUG 的 `0.0027` 倍。

A tiny Fabric mod for Minecraft Java Edition 26.3 that restores the old
Mining Fatigue III bug.

Minecraft 26.3 changed the mining-fatigue multiplier to the formula
`0.3^(amplifier + 1)`. For Mining Fatigue III (`amplifier == 2`), that fixes
the old `0.0027` multiplier to the mathematically consistent `0.027`.

This mod changes only Mining Fatigue III back to `0.0027`. Levels I, II, and
IV or higher retain the 26.3 behavior.

This is the inverse counterpart to
[glowstone314/MF3F](https://github.com/glowstone314/MF3F), which fixes the old
value in Minecraft 26.2 and earlier.

## Requirements

- Minecraft Java Edition 26.3-snapshot-3 or the 26.3 release series
- Fabric Loader 0.19.3 or newer
- Java 25

## Build

```powershell
./gradlew.bat build
```

The mod JAR is written to `build/libs/`.

## Installation

1. Install Fabric Loader 0.19.3 or newer for Minecraft 26.3.
2. Put the release JAR in the Minecraft `mods` folder.
3. Install the mod on both the client and server when playing multiplayer.
