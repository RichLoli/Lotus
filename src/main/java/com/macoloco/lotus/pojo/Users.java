package com.macoloco.lotus.pojo;

import lombok.Data;

@Data
public class Users extends Entity {

    private String username;
    private String password;
    private String active;
    private String delete;

}
