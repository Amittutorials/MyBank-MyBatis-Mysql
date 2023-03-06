package com.userBankDetails.userBankDetails.controller;

import com.userBankDetails.userBankDetails.dto.UserAccountDetails;
import com.userBankDetails.userBankDetails.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
    public class UserAccountController {
        @Autowired
        private UserAccountService userAccountService;
        @PostMapping("/add")
        public void createAccount(@RequestBody UserAccountDetails user) {
             userAccountService.createAccount(user);
        }

        @GetMapping("/getBankUserDetails")
        public List<UserAccountDetails> getAllUser()
        {
           return userAccountService.getAllUser();
        }

}


