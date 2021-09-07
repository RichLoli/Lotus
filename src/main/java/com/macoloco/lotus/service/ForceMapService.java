package com.macoloco.lotus.service;

import com.macoloco.lotus.dao.ForceMapDao;
import com.macoloco.lotus.pojo.ForceMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForceMapService {

    @Resource
    ForceMapDao forceMapDao;

    public List<ForceMap> selectAll(){
        return forceMapDao.selectAll();
    }


    public int insert(ForceMap forceMap) {
        return forceMapDao.insert(forceMap);
    }
}
