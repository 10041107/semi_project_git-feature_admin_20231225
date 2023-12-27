package com.semiproject.pettales.Aadminpage.model.dto;

import java.util.Date;

public class UserTableDTO {

    private int userCode;
    private String userNickname;
    private String userEmail;
    private String userPassword;
    private String userStatus;
    private String userAuth;
    private String petCodeList;
    private String companyCodeList;
    private Date registDate;
    private Date updateDate;

    // 기본 생성자
    public UserTableDTO() {
        // 기본 생성자의 내용
    }

    // 모든 필드를 매개변수로 받는 생성자
    public UserTableDTO(int userCode, String userNickname, String userEmail, String userPassword,
                        String userStatus, String userAuth, String petCodeList, String companyCodeList,
                        Date registDate, Date updateDate) {
        this.userCode = userCode;
        this.userNickname = userNickname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userStatus = userStatus;
        this.userAuth = userAuth;
        this.petCodeList = petCodeList;
        this.companyCodeList = companyCodeList;
        this.registDate = registDate;
        this.updateDate = updateDate;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    public String getPetCodeList() {
        return petCodeList;
    }

    public void setPetCodeList(String petCodeList) {
        this.petCodeList = petCodeList;
    }

    public String getCompanyCodeList() {
        return companyCodeList;
    }

    public void setCompanyCodeList(String companyCodeList) {
        this.companyCodeList = companyCodeList;
    }

    public Date getRegistDate() {
        return registDate;
    }

    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "UserTableDTO{" +
                "userCode=" + userCode +
                ", userNickname='" + userNickname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userAuth='" + userAuth + '\'' +
                ", petCodeList='" + petCodeList + '\'' +
                ", companyCodeList='" + companyCodeList + '\'' +
                ", registDate=" + registDate +
                ", updateDate=" + updateDate +
                '}';
    }
}