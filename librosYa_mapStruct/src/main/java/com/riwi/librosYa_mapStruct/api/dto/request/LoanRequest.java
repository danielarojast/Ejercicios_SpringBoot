package com.riwi.librosYa_mapStruct.api.dto.request;

import java.time.LocalDate;

import com.riwi.librosYa_mapStruct.utils.enums.StatusLoan;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private LocalDate returnDate;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private StatusLoan status;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private Long userId;
    @NotBlank(message = "Debes de rellenar los campos oblitorios")
    private Long bookId;
}
