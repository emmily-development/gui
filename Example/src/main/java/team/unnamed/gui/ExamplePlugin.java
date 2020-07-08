package team.unnamed.gui;

import me.fixeddev.ebcm.bukkit.BukkitCommandManager;
import me.fixeddev.ebcm.parametric.ParametricCommandBuilder;
import me.fixeddev.ebcm.parametric.ReflectionParametricCommandBuilder;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    public void onEnable() {
        registerCommands();
    }

    private void registerCommands() {
        ParametricCommandBuilder builder = new ReflectionParametricCommandBuilder();
        BukkitCommandManager manager = new BukkitCommandManager(getName());

        manager.registerCommands(builder.fromClass(new ExampleCommand()));
    }

}