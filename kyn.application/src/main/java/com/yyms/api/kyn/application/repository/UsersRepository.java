package com.yyms.api.kyn.application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yyms.api.kyn.application.dao.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	//Check or Find existing email - return user which relates with existing email
	//For Login 
    Optional<Users> findByEmail(String email);

    //Check or Find existing mail - return true or false
    //For Register (duplicate mail)
    Boolean existsByEmail(String email);

}
