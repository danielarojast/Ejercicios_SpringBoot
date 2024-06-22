package com.riwi.librosYa_mapStruct.infraestructure.sevices;

import org.springframework.data.domain.Page;

import com.riwi.librosYa_mapStruct.api.dto.request.UserRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.UserResp;
import com.riwi.librosYa_mapStruct.infraestructure.abstract_service.IUserService;

public class UserService implements IUserService{

    @Override
    public UserResp create(UserRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public UserResp get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public UserResp update(UserRequest rq, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Page<UserResp> getAll(int page, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }
    
}
