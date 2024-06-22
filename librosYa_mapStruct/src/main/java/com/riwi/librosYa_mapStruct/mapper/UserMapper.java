package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.api.dto.response.UserResp;
import com.riwi.librosYa_mapStruct.domain.entity.User;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserResp userToGetDTO(User user);

    List<UserResp> toGetUserList(List<User> userList);
}
