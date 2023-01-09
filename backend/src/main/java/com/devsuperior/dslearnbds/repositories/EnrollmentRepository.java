package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entites.Enrollment;
import com.devsuperior.dslearnbds.entites.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
