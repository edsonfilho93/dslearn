package com.devsuperior.dslearnbds.entites;

import com.devsuperior.dslearnbds.entites.pk.EnrollmentPK;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {
    private static final long serialVersionId = 1L;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @EmbeddedId
    private EnrollmentPK id = new EnrollmentPK();

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;

    private boolean onlyUpdate;
    private boolean available;

    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean onlyUpdate, boolean available) {
        this.id.setUser(user);
        this.id.setOffer(offer);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.onlyUpdate = onlyUpdate;
        this.available = available;
    }

    public User getStudent() {
        return this.id.getUser();
    }

    public void setStudent(User user) {
        this.id.setUser(user);
    }

    public Offer getOffer() {
        return this.id.getOffer();
    }

    public void setOffer(Offer offer) {
        this.id.setOffer(offer);
    }

}
