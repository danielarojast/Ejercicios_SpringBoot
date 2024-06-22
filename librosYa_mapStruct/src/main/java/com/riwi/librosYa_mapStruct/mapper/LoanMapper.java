package com.riwi.librosYa_mapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.librosYa_mapStruct.api.dto.response.LoanResp;
import com.riwi.librosYa_mapStruct.domain.entity.Loan;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    LoanResp loanToGetLoan(Loan loan);
    List<LoanResp> toGetLoanList(List<Loan> loanList);
}
