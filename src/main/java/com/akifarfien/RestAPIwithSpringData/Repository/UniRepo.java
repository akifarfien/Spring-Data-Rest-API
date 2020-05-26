package com.akifarfien.RestAPIwithSpringData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.akifarfien.RestAPIwithSpringData.bean.University;

@RepositoryRestResource
public interface UniRepo extends JpaRepository<University, Integer> {

}
