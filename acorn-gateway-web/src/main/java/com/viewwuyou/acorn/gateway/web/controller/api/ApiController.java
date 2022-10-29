package com.viewwuyou.acorn.gateway.web.controller.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api控制器，所有的api请求都通过该控制器处理，规定所有的请求都为post请求
 * @author viewwuyou
 */
@RestController
public class ApiController {

    @PostMapping("/api")
    public String doApi() {
        return null;
    }

}
