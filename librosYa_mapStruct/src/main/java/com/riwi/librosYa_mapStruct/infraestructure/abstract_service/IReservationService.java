package com.riwi.librosYa_mapStruct.infraestructure.abstract_service;

import com.riwi.librosYa_mapStruct.api.dto.request.ReservationRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.ReservationResp;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResp, Long>{
    
}
