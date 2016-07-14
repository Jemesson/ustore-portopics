package com.portopics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.portopics.model.Profile;
import com.portopics.service.ProfileService;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Byte[]> listPhotos() {
		return profileService.listPhotos();
	}

	@RequestMapping(value = "/search/{email}", method = RequestMethod.GET)
	public Byte[] findPhotoByEmail(@PathVariable String email) {
		return profileService.findPhotoByEmail(email);
	}

	@RequestMapping(value = "/save/{email}/{photo}", method = RequestMethod.POST)
	public Profile savePhoto(@PathVariable String email, @PathVariable Byte[] photo) {
		Profile profile = new Profile();
		profile.setEmail(email);
		profile.setPhoto(photo);
		profileService.savePhoto(profile);
		return profile;
	}

	@RequestMapping(value = "/remove/{email}", method = RequestMethod.DELETE)
	public void deletePhotoByEmail(@PathVariable String email) {
		profileService.deletePhotoByEmail(email);
	}
	
}
