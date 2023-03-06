package com.userBankDetails.userBankDetails.mapper;

import com.userBankDetails.userBankDetails.dto.UserAccountDetails;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    @Select("select * from useraccountdetails")
    List<UserAccountDetails> findAll();

    @Insert("insert into useraccountdetails(name,age,mailId,address,password,mobileNumber,accountNumber) values(#{name},#{age},#{mailId},#{address},#{password},#{mobileNumber},#{accountNumber})")
    void insert(UserAccountDetails useraccountdetails);

}
