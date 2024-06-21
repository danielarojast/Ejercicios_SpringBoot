package com.riwi.librosYa_mapStruct.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetLoan {
    private Long id;
    private LocalDate loanDate;
    private LocalDate returnDate;
    private Long userId;
    private Long bookId;
}
