package com.portopics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portopics.model.Profile;
import com.portopics.repository.ProfileRepository;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public List<Byte[]> listPhotos() {		
		return profileRepository.listPhotos();
	}

	public Byte[] findPhotoByEmail(String email) {
		return profileRepository.findPhotoByEmail(email);
	}

	public void savePhoto(Profile profile) {
		profileRepository.save(profile);
	}

	public void deletePhotoByEmail(String email) {
		Profile profile = profileRepository.findByEmail(email);
		profileRepository.delete(profile.getId());
	}

}
