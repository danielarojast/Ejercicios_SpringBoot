package com.riwi.vacants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.vacants.entity.Vacant;

public interface VancantRepository extends JpaRepository<Vacant, Long>{
    
}
