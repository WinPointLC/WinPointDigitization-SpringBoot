package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.OrganizationType;

@Repository
public interface OrganizationTypeRepository extends JpaRepository<OrganizationType, Integer>{

}
