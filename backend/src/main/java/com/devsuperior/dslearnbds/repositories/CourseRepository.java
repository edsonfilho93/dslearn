package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entites.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
