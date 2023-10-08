package io.github.karmasmp.karmaplugin;

public enum PluginWorldType {

    ADMIN("Admin", "admin"),
    DEFAULT("Default", "world"),
    EVENT("Event", "event");

    private final String name;
    private final String worldName;

    private PluginWorldType(String name, String worldName) {
        this.name = name;
        this.worldName = worldName;
    }

    public String getName() {
        return name;
    }

    public String getWorldName() {
        return worldName;
    }
}
