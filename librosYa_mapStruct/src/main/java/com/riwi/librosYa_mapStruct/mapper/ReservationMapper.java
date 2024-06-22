package com.riwi.librosYa_mapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.librosYa_mapStruct.api.dto.response.ReservationResp;
import com.riwi.librosYa_mapStruct.domain.entity.Reservation;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    ReservationResp reservationToGetDTO(Reservation reservation);

    List<ReservationResp> toGetUserList(List<Reservation> reservationList);
}
