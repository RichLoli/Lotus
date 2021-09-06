package com.macoloco.lotus.enums;

public enum HTTPCode {

    SUCCESS("0","SUCCESS"),
    AUTHENFAILED("401","身份验证失败")
    ;

    private String code;

    private String msg;

    HTTPCode(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
