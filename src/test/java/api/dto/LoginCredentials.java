package api.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginCredentials {
    private String email;
    private String password;
    private String domain;

}
