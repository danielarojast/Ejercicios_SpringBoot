package com.riwi.librosYa_mapStruct.infraestructure.abstract_service;

import com.riwi.librosYa_mapStruct.api.dto.request.UserRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.UserResp;

public interface IUserService extends CrudService<UserRequest, UserResp, Long>{
    
}
