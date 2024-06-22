package com.riwi.librosYa_mapStruct.api.dto.request;

import com.riwi.librosYa_mapStruct.utils.enums.RolUser;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotBlank(message = "El nombre de usuario es requerido")
    private String username;
    @NotBlank(message = "La contraseña es requerida")
    private String password;
    @NotBlank(message = "El email es requerido")
    @Email
    private String email;
    @NotBlank(message = "El nombre completo es requerido")
    private String fullName;
    @NotBlank(message = "El rol es requerido")
    private RolUser rol;
}
