package com.osetskiy.messeger_restful_demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.osetskiy.messeger_restful_demo.database.DataBase;
import com.osetskiy.messeger_restful_demo.model.Message;
import com.osetskiy.messeger_restful_demo.model.Profile;

public class ProfileService {
	private Map<String,Profile> profiles = DataBase.getProfiles();

	public ProfileService() {
		profiles.put("vova",new Profile("aiden","vova","os"));	
	}

	public List<Profile> getAllProfiles() {

		return new ArrayList<Profile>(profiles.values());
	}

	public Profile addProfile(Profile profile) {		
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile getProfile(String name) {
		return profiles.get(name);
	}

	public Profile removeProfile(String name) {
		return profiles.remove(name);
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty())	return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

}
