package io.github.fallOut015.glazed_bricks.data;

import io.github.fallOut015.glazed_bricks.data.client.BlockStateProviderGlazedBricks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class DataGeneratorGlazedBricks {
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Gen {
        @SubscribeEvent
        public static void gatherData(final GatherDataEvent event) {
            @SuppressWarnings("unused")
            DataGenerator gen = event.getGenerator();

            if(event.includeClient()) {
                //gen.addProvider(new BlockStateProviderGlazedBricks(gen));
                //gen.addProvider(new BlockModelProviderGlazedBricks(gen, event.getExistingFileHelper()));
            }

            if(event.includeServer()) {
				//gen.addProvider(new LootTableProviderGlazedBricks(gen));
                //gen.addProvider(new TagProviderGlazedBricks(gen, event.getExistingFileHelper()));
            }
        }
    }
}