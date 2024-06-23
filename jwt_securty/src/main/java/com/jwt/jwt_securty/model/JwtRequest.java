package com.jwt.jwt_securty.model;

import lombok.Data;

@Data
public class JwtRequest {

    String userName;

    String password;
}
