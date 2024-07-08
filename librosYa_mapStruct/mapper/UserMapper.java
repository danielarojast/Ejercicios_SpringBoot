package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.api.dto.request.UserRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.UserResp;
import com.riwi.librosYa_mapStruct.domain.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User requestToEntity(UserRequest userRequest);
    UserResp toUserResp(User user);

}
