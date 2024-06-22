package com.riwi.librosYa_mapStruct.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.librosYa_mapStruct.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
