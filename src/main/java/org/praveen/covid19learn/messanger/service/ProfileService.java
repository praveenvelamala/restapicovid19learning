package org.praveen.covid19learn.messanger.service;

import java.util.Map;

import org.praveen.covid19learn.messanger.database.DatabaseClass;
import org.praveen.covid19learn.messanger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profileMap = DatabaseClass.getProfiles();
}


