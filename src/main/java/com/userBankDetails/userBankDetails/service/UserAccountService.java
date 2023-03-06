
package com.userBankDetails.userBankDetails.service;
import com.userBankDetails.userBankDetails.dto.UserAccountDetails;
import com.userBankDetails.userBankDetails.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService {
    @Autowired
    public Mapper mapper;

    public void createAccount(UserAccountDetails user) {
        user.setAccountNumber(generateAccountNumber());
        mapper.insert(user);

    }

    private int generateAccountNumber() {
        int accountNumber = (int) Math.floor(Math.random() * 1234567889) + 1;
        return accountNumber;

    }

    public List<UserAccountDetails> getAllUser()
    {
       return mapper.findAll();

    }
}