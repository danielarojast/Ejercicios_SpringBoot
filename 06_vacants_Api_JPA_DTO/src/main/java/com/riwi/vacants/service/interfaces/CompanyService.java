package com.riwi.vacants.service.interfaces;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.vacants.entity.Company;
import com.riwi.vacants.repository.CompanyRepository;
import com.riwi.vacants.utils.dto.request.CompanyRequest;
import com.riwi.vacants.utils.dto.response.CompanyResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyService implements ICompanyService {

    @Autowired
    private final CompanyRepository companyRepository;

    @Override
    public void delete(String id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public CompanyResponse create(CompanyRequest request) {
        
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CompanyResponse update(String id, CompanyRequest request) {
        
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Page<CompanyResponse> getAll(int page, int size) {
        if(page > 0){
            page = 0;
        }

        PageRequest pagination= PageRequest.of(page, size);

        //Iteramos con map cada compañia y la convertimos 
        return this.companyRepository.findAll(pagination).map(this::entityToResponse);
    }

    //Este metodo es solo porque en el metodo pasado ---- devuelve una company y necesito que devuelva una companyResponse-
    private CompanyResponse entityToResponse(Company entity){
        CompanyResponse response= new CompanyResponse();
        
        //El beanUntil es propio de springboot y combierte los parametros de company uno por uno automaticos.
        BeanUtils.copyProperties(entity, response);

        return response;

    }
    
}
