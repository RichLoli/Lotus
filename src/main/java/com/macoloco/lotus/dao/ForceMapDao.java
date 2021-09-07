package com.macoloco.lotus.dao;

import com.macoloco.lotus.pojo.ForceMap;

import java.util.List;

public interface ForceMapDao {

    List<ForceMap> selectAll();

    int insert(ForceMap forceMap);

    int update(ForceMap forceMap);

    int delete(String id);

}
