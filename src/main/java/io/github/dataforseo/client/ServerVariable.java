package io.github.dataforseo.client;

import java.util.HashSet;

public class ServerVariable {
    public String description;
    public String defaultValue;
    public HashSet<String> enumValues = null;

    public ServerVariable(String description, String defaultValue, HashSet<String> enumValues) {
        this.description = description;
        this.defaultValue = defaultValue;
        this.enumValues = enumValues;
    }
}