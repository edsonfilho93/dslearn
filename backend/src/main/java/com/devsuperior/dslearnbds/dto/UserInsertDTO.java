package com.devsuperior.dslearnbds.dto;


import com.devsuperior.dslearnbds.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
    private static final long serialVersionUID = 29926102646523573L;

    private String password;

    public UserInsertDTO() {
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
