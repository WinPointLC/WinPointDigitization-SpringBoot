package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winpoint.model.Course;
import com.winpoint.model.OrganizationType;

@Repository
public interface OrganizationTypeRepository extends JpaRepository<OrganizationType, Integer>{
	OrganizationType findByOrganizationTypeName(String OrganizationTypeNanem);
}
