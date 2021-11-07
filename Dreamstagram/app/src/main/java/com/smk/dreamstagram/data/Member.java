package com.smk.dreamstagram.data;

public class Member {
    private String emailAccount;
    private String password;
    private String memberName;

    public Member(String emailAccount, String password, String memberName) {
        this.emailAccount = emailAccount;
        this.password = password;
        this.memberName = memberName;
    }

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
