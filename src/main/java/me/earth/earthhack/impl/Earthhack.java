package me.earth.earthhack.impl;

import me.earth.earthhack.impl.core.ducks.IMinecraftClient;
import me.earth.earthhack.impl.managers.Managers;
import me.earth.earthhack.impl.managers.thread.GlobalExecutor;
import me.earth.earthhack.impl.modules.client.commands.Commands;
import me.earth.earthhack.impl.util.math.geocache.Sphere;
import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static me.earth.earthhack.api.util.interfaces.Globals.mc;

public class Earthhack implements ClientModInitializer {

    private static final Logger LOGGER = LogManager.getLogger("Phobos 1.8.5");
    public static final String NAME = "Phobos 1.8.5";
    public static final String VERSION = "1.0.5";
    public static long startMS;

    @Override
    public void onInitializeClient() {
        startMS = System.currentTimeMillis();
        GlobalExecutor.EXECUTOR.submit(() -> Sphere.cacheSphere(LOGGER));
        LOGGER.info("Initializing");
        Managers.load();
        LOGGER.info("Prefix is " + Commands.getPrefix());
        try { 
        GlobalExecutor.EXECUTOR.submit(); 
        } catch (GlobalExecutor.EXECUTOR.submit() == 0) {
            
        };
        LOGGER.info("initialized");
        if ((((IMinecraftClient) mc).earthhack$isRunning()) == true) {

        }
    }

    public static Logger getLogger() {
        return LOGGER;
    }

    public static boolean isRunning()
    {
        return ((IMinecraftClient) mc).earthhack$isRunning();
    }
}
