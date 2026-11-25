package com.springboot.training_portal.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.training_portal.entity.AppUser;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
	
	
	Optional<AppUser> findByUsername(String username);
	

}
