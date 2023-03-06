package com.userBankDetails.userBankDetails.dto;

    public class UserAccountDetails {
        private String name;
        private  Integer mobileNumber;
        private Integer age;
        private String address;
        private String password;
        private String mailId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(Integer mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMailId() {
            return mailId;
        }

        public void setMailId(String mailId) {
            this.mailId = mailId;
        }

        public Integer getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(Integer accountNumber) {
            this.accountNumber = accountNumber;
        }

        private Integer accountNumber;
    }

