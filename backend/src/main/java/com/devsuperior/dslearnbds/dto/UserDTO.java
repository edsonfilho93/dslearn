package com.devsuperior.dslearnbds.dto;


import com.devsuperior.dslearnbds.entites.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long SerialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Campo Obrigatório!")
    private String name;
    @Email(message = "Informar um email válido!")
    private String email;

//    private Set<RoleDTO> roles = new HashSet<>();

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();

//        entity.getRoles().forEach(role -> this.roles.add(new RoleDTO(role)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Set<RoleDTO> getRoles() {
//        return roles;
//    }
}
