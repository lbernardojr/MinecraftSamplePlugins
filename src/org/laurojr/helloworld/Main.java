package org.laurojr.helloworld;

import org.bukkit.plugin.java.JavaPlugin;
import org.laurojr.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        new HelloCommand(this);
    }

}
