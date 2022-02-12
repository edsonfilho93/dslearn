package com.devsuperior.dslearnbds.entites.pk;

import com.devsuperior.dslearnbds.entites.Offer;
import com.devsuperior.dslearnbds.entites.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long serialVersionId = 1L;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;
}
