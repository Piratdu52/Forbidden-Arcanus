package com.stal111.forbidden_arcanus.common.world.placement;

import com.mojang.serialization.Codec;

//TODO
public class DimensionPlacement  {
	public DimensionPlacement(Codec<DimensionConfig> codec) {
		//super(codec);
	}

	public static DimensionPlacement create() {
		return new DimensionPlacement(DimensionConfig.CODEC);
	}

//	public Stream<BlockPos> getPositions(DecorationContext helper, Random rand, DimensionConfig config, BlockPos pos) {
//		ServerLevel world = helper.level.getLevel();
//		ResourceKey<Level> key = world.dimension();
//		if (config.whitelist.contains(key) || config.whitelist.isEmpty() || !config.blacklist.contains(key)) {
//			return Stream.of(pos);
//		} else {
//			return Stream.empty();
//		}
//	}
}
