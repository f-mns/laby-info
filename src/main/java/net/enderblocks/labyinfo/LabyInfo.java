package net.enderblocks.labyinfo;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LabyInfo extends Plugin {
    private static Set<String> playerIds;

    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new LoginListener());

        playerIds = ConcurrentHashMap.newKeySet();
    }

    @Override
    public void onDisable() {
        playerIds = null;
    }

    public static void addPlayerId(String id) {
      playerIds.add(id);
    }
}
