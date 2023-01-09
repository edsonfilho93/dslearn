package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entites.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
