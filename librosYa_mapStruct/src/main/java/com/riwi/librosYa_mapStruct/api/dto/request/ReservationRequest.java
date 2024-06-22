package com.riwi.librosYa_mapStruct.api.dto.request;

import com.riwi.librosYa_mapStruct.utils.enums.StatusReservation;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationRequest {
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private StatusReservation status;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private Long userId;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private Long bookId;
}
