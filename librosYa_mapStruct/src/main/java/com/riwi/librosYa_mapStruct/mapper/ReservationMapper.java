package com.riwi.librosYa_mapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.librosYa_mapStruct.dto.GetReservation;
import com.riwi.librosYa_mapStruct.dto.GetUser;
import com.riwi.librosYa_mapStruct.entity.Reservation;
import com.riwi.librosYa_mapStruct.entity.User;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    GetReservation reservationToGetDTO(Reservation reservation);

    List<GetReservation> toGetUserList(List<Reservation> reservationList);
}
