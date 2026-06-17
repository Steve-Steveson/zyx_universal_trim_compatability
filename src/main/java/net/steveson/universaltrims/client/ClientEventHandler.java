package net.steveson.universaltrims.client;

import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.steveson.universaltrims.client.model.TrimmedItemModel;

public class ClientEventHandler {
    public static void init()
    {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(ClientEventHandler::registerModelLoaders);
    }

    public static void registerModelLoaders(ModelEvent.RegisterGeometryLoaders event)
    {
        event.register("trimmed_item", new TrimmedItemModel.Loader());
    }
}
