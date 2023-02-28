package daripher.addon.survive.mushrooms.block;

import java.util.Random;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MushroomBlock extends BushBlock {
	protected static final VoxelShape SHAPE = Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);

	public MushroomBlock() {
		super(Properties.of(Material.PLANT).lightLevel(s -> 10).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).hasPostProcess((b, w, p) -> true));
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return SHAPE;
	}

	@Override
	public void randomTick(BlockState blockState, ServerLevel level, BlockPos blockPos, Random random) {
		if (random.nextInt(25) == 0) {
			var i = 5;

			for (var pos : BlockPos.betweenClosed(blockPos.offset(-4, -1, -4), blockPos.offset(4, 1, 4))) {
				if (level.getBlockState(pos).is(this)) {
					--i;

					if (i <= 0) {
						return;
					}
				}
			}

			var pos = blockPos.offset(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);

			for (var k = 0; k < 4; ++k) {
				if (level.isEmptyBlock(pos) && blockState.canSurvive(level, pos)) {
					blockPos = pos;
				}

				pos = blockPos.offset(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
			}

			if (level.isEmptyBlock(pos) && blockState.canSurvive(level, pos)) {
				level.setBlock(pos, blockState, 2);
			}
		}
	}

	@Override
	protected boolean mayPlaceOn(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
		return blockState.isSolidRender(blockGetter, blockPos);
	}
}
