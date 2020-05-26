package com.akifarfien.RestAPIwithSpringData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.akifarfien.RestAPIwithSpringData.bean.Student;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student, Integer> {

	
}
