package skywolf46.HorizonEssential.Modules.Extension;

import org.bukkit.Bukkit;
import skywolf46.HorizonEssential.Modules.AbstractModule;

import java.util.HashMap;

public class ServerManageModule extends AbstractModule {
    private HashMap<String, Boolean> data = new HashMap<>();

    @Override
    protected void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§6HorizonEssentials §7| §e서버 관리 모듈 활성화");
    }

    @Override
    protected void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§6HorizonEssentials §7| §c서버 관리 모듈 비활성화");
    }
}
