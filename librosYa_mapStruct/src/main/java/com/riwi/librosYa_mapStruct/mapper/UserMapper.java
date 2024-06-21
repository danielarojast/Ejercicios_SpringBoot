package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.dto.GetUser;
import com.riwi.librosYa_mapStruct.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    GetUser userToGetDTO(User user);

    List<GetUser> toGetUserList(List<User> userList);
}
