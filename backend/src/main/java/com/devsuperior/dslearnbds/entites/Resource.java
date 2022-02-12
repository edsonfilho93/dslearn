package com.devsuperior.dslearnbds.entites;

import com.devsuperior.dslearnbds.enums.ResourceType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {
    private static final long serialVersionId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String title;
    private String description;
    private String imgUri;
    private String position;
    private ResourceType type;
//    private String externalLink;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "resource")
    private List<Section> sections = new ArrayList<>();

}
