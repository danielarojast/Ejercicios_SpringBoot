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
public class GetReservation {
    private Long id;
    private LocalDate reservationDate;
    private String status;
    private Long userId;
    private Long bookId;
}
