package com.crm.convert;

import com.crm.entity.Customer;
import com.crm.vo.CustomerVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-21T15:44:11+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
public class CustomerConvertImpl implements CustomerConvert {

    @Override
    public Customer convert(CustomerVO customerVO) {
        if ( customerVO == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setId( customerVO.getId() );
        customer.setName( customerVO.getName() );
        customer.setPhone( customerVO.getPhone() );
        customer.setEmail( customerVO.getEmail() );
        customer.setLevel( customerVO.getLevel() );
        customer.setSource( customerVO.getSource() );
        customer.setAddress( customerVO.getAddress() );
        customer.setFollowStatus( customerVO.getFollowStatus() );
        customer.setNextFollowStatus( customerVO.getNextFollowStatus() );
        customer.setRemark( customerVO.getRemark() );
        customer.setCreaterId( customerVO.getCreaterId() );
        if ( customerVO.getIsPublic() != null ) {
            customer.setIsPublic( customerVO.getIsPublic().byteValue() );
        }
        customer.setOwnerId( customerVO.getOwnerId() );
        if ( customerVO.getIsKeyDecisionMaker() != null ) {
            customer.setIsKeyDecisionMaker( customerVO.getIsKeyDecisionMaker().byteValue() );
        }
        if ( customerVO.getGender() != null ) {
            customer.setGender( customerVO.getGender().byteValue() );
        }
        customer.setDealCount( customerVO.getDealCount() );
        customer.setCreateTime( customerVO.getCreateTime() );

        return customer;
    }
}
