package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entites.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
