package com.riwi.librosYa_mapStruct.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetUser {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String rol;
}
