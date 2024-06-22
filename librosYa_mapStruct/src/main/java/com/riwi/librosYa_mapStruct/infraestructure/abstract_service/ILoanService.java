package com.riwi.librosYa_mapStruct.infraestructure.abstract_service;

import com.riwi.librosYa_mapStruct.api.dto.request.LoanRequest;
import com.riwi.librosYa_mapStruct.api.dto.response.LoanResp;

public interface ILoanService extends CrudService<LoanRequest, LoanResp, Long>{
    
}
