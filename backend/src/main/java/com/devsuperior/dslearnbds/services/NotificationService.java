package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.entites.Notification;
import com.devsuperior.dslearnbds.entites.User;
import com.devsuperior.dslearnbds.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repository;
    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForUSer(Pageable pageable) {
        User user = authService.userAuthenticated();

        Page<Notification> page = repository.findByUser(user, pageable);

        return page.map(NotificationDTO::new);
    }

}
