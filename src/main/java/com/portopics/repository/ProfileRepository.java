package com.portopics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.portopics.model.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

	@Query("SELECT p.photo FROM Profile p")
	public List<Byte[]> listPhotos();

	@Query("SELECT p.photo FROM Profile p where p.email = :email")
	public Byte[] findPhotoByEmail(@Param("email") String email);

	@Query("SELECT p FROM Profile p where e.email = :email")
	public Profile findByEmail(@Param("email") String email);
	
}