package com.devsuperior.dslearnbds.entites;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    private String name;
    private String imgUri;
    private String imgGrayUri;

    @Setter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();
}
