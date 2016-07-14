package com.portopics.service;

import java.util.List;

import com.portopics.model.Profile;

public interface ProfileService {
	public List<Byte[]> listPhotos();

	public Byte[] findPhotoByEmail(String email);

	public void savePhoto(Profile profile);

	public void deletePhotoByEmail(String email);
}
