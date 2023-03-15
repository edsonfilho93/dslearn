package com.devsuperior.dslearnbds.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthCustomError implements Serializable {

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;
}
