package com.macoloco.lotus.controller;

import com.macoloco.lotus.comm.APIResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
@Slf4j
public class ApiAdminController {

    public APIResponse login() {
        throw new NotImplementedException();
    }


    public APIResponse register() {
        throw new NotImplementedException();
    }
}
