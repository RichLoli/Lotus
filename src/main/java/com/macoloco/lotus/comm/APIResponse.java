package com.macoloco.lotus.comm;

import com.macoloco.lotus.enums.HTTPCode;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Getter
public class APIResponse implements Serializable {


    private String code;

    private String msg;

    private Map<String, Object> data = new HashMap<>();

    public APIResponse(HTTPCode httpCode){
        this.code = httpCode.getCode();
        this.msg = httpCode.getMsg();
    }

    public APIResponse data(Map<String, Object>  data){
        this.data = data;
        return this;
    }

    public APIResponse p(String key, Object value){
        data.put(key, value);
        return this;
    }
}
