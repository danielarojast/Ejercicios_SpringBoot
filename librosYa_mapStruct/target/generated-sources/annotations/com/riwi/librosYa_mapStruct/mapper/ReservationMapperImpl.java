package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.api.dto.response.ReservationResp;
import com.riwi.librosYa_mapStruct.domain.entity.Reservation;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T19:28:27-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationResp reservationToGetDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationResp.ReservationRespBuilder reservationResp = ReservationResp.builder();

        reservationResp.id( reservation.getId() );
        if ( reservation.getReservationDate() != null ) {
            reservationResp.reservationDate( LocalDateTime.ofInstant( reservation.getReservationDate().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        if ( reservation.getStatus() != null ) {
            reservationResp.status( reservation.getStatus().name() );
        }

        return reservationResp.build();
    }

    @Override
    public List<ReservationResp> toGetUserList(List<Reservation> reservationList) {
        if ( reservationList == null ) {
            return null;
        }

        List<ReservationResp> list = new ArrayList<ReservationResp>( reservationList.size() );
        for ( Reservation reservation : reservationList ) {
            list.add( reservationToGetDTO( reservation ) );
        }

        return list;
    }
}
