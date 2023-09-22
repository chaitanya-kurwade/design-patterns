package com.codewithmosh.C_Creational.b_singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
	private Map<String, Object> map = new HashMap<>();
	private ConfigManager() {}
	public static ConfigManager instance = new ConfigManager();
	
	public static ConfigManager getInstance() {
		return instance;
	}
	
	public void set(String key, Object value) {
		map.put(key, value);
	}
	
	public Object get(String key) {
		return map.get(key);
	}
}
