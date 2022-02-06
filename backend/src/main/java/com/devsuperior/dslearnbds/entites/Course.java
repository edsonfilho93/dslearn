package com.devsuperior.dslearnbds.entites;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String imgUri;
    private String imgGrayUri;

    @Setter(value = AccessLevel.NONE)
    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();
}
