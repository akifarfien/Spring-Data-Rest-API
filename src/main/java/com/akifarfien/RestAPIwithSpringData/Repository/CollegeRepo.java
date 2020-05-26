package com.akifarfien.RestAPIwithSpringData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akifarfien.RestAPIwithSpringData.bean.College;

@RepositoryRestResource
public interface CollegeRepo extends JpaRepository<College, Integer> {

}
