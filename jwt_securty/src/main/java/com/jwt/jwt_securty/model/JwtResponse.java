package com.jwt.jwt_securty.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JwtResponse {
    String token;

    String userName;
}
