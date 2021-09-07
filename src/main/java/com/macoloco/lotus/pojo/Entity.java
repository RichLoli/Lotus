package com.macoloco.lotus.pojo;

import com.macoloco.lotus.util.DateUtil;
import com.macoloco.lotus.util.IdGen;
import lombok.Data;

import java.util.Date;

@Data
public class Entity {

    private String id;

    private String createtime;

    private String updatetime;

    protected Entity(){
        id = IdGen.uuid();
        createtime = DateUtil.now();
        updatetime = DateUtil.now();
    }
}
