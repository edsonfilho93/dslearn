package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entites.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
