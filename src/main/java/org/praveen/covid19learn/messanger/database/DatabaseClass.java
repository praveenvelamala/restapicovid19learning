package org.praveen.covid19learn.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.praveen.covid19learn.messanger.model.Message;
import org.praveen.covid19learn.messanger.model.Profile;

public class DatabaseClass {

	static Map<Long, Message> messages = new HashMap<>();
	static Map<String, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
	
	
}
