package com.songjie.benmu.songjie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: songjie
 * @Date: 2019-04-28 11:15
 * @Description:
 */
@RequestMapping("/door")
public class DoorController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/success")
    public String success(){
        logger.info("logger in success!");
        return "success";
    }

}
