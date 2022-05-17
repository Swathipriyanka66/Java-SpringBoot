package com.jobiak.mvcforms.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvcforms.model.User;

@Repository 		//CURD operations
public interface UserRepository extends JpaRepository<User,Long> {
                                                       //Entity class and Entity primary Key column type
}
