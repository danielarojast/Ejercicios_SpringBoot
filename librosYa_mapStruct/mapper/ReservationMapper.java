package com.riwi.librosYa_mapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.librosYa_mapStruct.api.dto.response.ReservationResp;
import com.riwi.librosYa_mapStruct.domain.entity.Reservation;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, uses= {UserMapper.class})
public interface ReservationMapper {
    
    ReservationResp toReservationResp(Reservation reservation);


}
