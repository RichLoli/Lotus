package com.macoloco.lotus.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.macoloco.lotus.comm.APIResponse;
import com.macoloco.lotus.enums.HTTPCode;
import com.macoloco.lotus.pojo.ForceMap;
import com.macoloco.lotus.service.ForceMapService;
import com.macoloco.lotus.util.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * 力导向图数据接口
 *
 * @author Aya
 * @date 2021/09/06
 */
@RestController
@CrossOrigin
@RequestMapping("/api/force")
@Slf4j
public class ApiForceController {

    @Resource
    ForceMapService forceMapService;

    @GetMapping("/demo")
    public APIResponse forceData() {
        URL resource = this.getClass().getResource("/static/graphs.json");
        try (BufferedReader br = new BufferedReader(new FileReader(new File(resource.toURI())))) {
            StringBuilder sb = new StringBuilder();
            String s = null;
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            return new APIResponse(HTTPCode.SUCCESS).data(JSON.parseJsonObject(sb.toString()));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/maps")
    public APIResponse mapsData() {
        List<ForceMap> maps = forceMapService.selectAll();
        return new APIResponse(HTTPCode.SUCCESS).data(maps);
    }

    @GetMapping("{id}/map")
    public APIResponse mapData(
            @PathVariable("id") String id
    ) {
        List<ForceMap> maps = forceMapService.selectAll();
        return new APIResponse(HTTPCode.SUCCESS).data(maps);
    }

    @PostMapping("/map")
    public APIResponse postMap(@RequestBody ForceMap forceMap) {
        int result = forceMapService.insert(forceMap);
        return new APIResponse(HTTPCode.SUCCESS).data(result);
    }

}
