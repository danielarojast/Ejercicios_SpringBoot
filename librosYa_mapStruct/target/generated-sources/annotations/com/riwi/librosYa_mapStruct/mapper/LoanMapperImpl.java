package com.riwi.librosYa_mapStruct.mapper;

import com.riwi.librosYa_mapStruct.api.dto.response.LoanResp;
import com.riwi.librosYa_mapStruct.domain.entity.Loan;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-21T19:21:12-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.38.0.v20240524-2033, environment: Java 17.0.11 (Eclipse Adoptium)"
)
@Component
public class LoanMapperImpl implements LoanMapper {

    @Override
    public LoanResp loanToGetLoan(Loan loan) {
        if ( loan == null ) {
            return null;
        }

        LoanResp.LoanRespBuilder loanResp = LoanResp.builder();

        loanResp.id( loan.getId() );
        if ( loan.getLoanDate() != null ) {
            loanResp.loanDate( LocalDateTime.ofInstant( loan.getLoanDate().toInstant(), ZoneOffset.UTC ).toLocalDate() );
        }
        loanResp.returnDate( loan.getReturnDate() );

        return loanResp.build();
    }

    @Override
    public List<LoanResp> toGetLoanList(List<Loan> loanList) {
        if ( loanList == null ) {
            return null;
        }

        List<LoanResp> list = new ArrayList<LoanResp>( loanList.size() );
        for ( Loan loan : loanList ) {
            list.add( loanToGetLoan( loan ) );
        }

        return list;
    }
}
