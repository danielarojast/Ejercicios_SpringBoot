package com.riwi.librosYa_mapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.librosYa_mapStruct.dto.GetLoan;
import com.riwi.librosYa_mapStruct.dto.GetUser;
import com.riwi.librosYa_mapStruct.entity.Loan;
import com.riwi.librosYa_mapStruct.entity.User;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {
    GetLoan loanToGetLoan(Loan loan);
    List<GetLoan> toGetLoanList(List<Loan> loanList);
}
