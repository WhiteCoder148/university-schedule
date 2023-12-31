package com.foxminded.university_schedule.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foxminded.university_schedule.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Optional<Student> findByFirstNameAndLastName(String firstName, String lastName);
}
