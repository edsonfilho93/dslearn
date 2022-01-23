package com.devsuperior.dslearnbds.entites;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"authority"})
public class Role implements Serializable {
    private static final long serialVersionId = 1L;

    private Long id;
    private String authority;

}
