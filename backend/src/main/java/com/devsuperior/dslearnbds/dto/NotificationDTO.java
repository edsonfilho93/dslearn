package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entites.Notification;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO implements Serializable {

    private Long id;
    private String text;
    private Instant moment;
    private Boolean read;
    private String route;
    private Long userId;

    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.getRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }
}
