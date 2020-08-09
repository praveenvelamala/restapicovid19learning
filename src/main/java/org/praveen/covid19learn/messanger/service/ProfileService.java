package org.praveen.covid19learn.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.praveen.covid19learn.messanger.database.DatabaseClass;
import org.praveen.covid19learn.messanger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profileMap = DatabaseClass.getProfiles();

	public ProfileService(){
		Profile praveen = new Profile("pvelamal", "praveen", "velamala", 1L, 'M');
		Profile kalyani = new Profile("kalyaniv", "kalyani", "vana", 2L, 'F');
		Profile amarDeep = new Profile("amar", "amardeep", "velamala", 3L, 'M');
		profileMap.put("praveen", praveen);
		profileMap.put("kalyani", kalyani);
		profileMap.put("amardeep", amarDeep);
		
	}
	
public List<Profile> getAllProfiles(){
	return new ArrayList<Profile>(profileMap.values());
}

public Profile getProfile(String name){
	return profileMap.get(name);
}

public Profile addProfile(Profile p){
	p.setId((long) (profileMap.size()+1));
	profileMap.put(p.firstName, p);
	return profileMap.get(p.firstName);
}

public Profile updateProfile(Profile p){
	if(p.getFirstName()!= null){
	profileMap.put(p.getFirstName(),p);
	return profileMap.get(p.getFirstName());}
	else
		return null;
	}

public void deleteProfile(String name){
	profileMap.remove(name);
}



}
