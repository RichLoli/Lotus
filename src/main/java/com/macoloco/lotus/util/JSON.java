package com.macoloco.lotus.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

/**
 * JSON工具类
 * @author Aya
 * @date 2021/09/06
 */
public class JSON {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 对象转JSON字符串
     * @param obj
     * @return
     */
    public static String toJsonString(Object obj){
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * JSON转Java对象
     * @param json
     * @return
     */
    public static Map parseJsonObject(String json){
        try {
            return objectMapper.readValue(json, Map.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
