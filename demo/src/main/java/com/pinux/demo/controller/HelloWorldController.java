package com.pinux.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @ClassName HelloWorldController
 * @Description TODO
 * @Author pinux
 * @Date 19-1-2 下午3:27
 * @Version 1.0
 */
@RestController
public class HelloWorldController {

    /**
     * @return 
     * @Author pinux
     * @Description 
     * @Date 下午3:28 19-1-2
     * @Param
     **/
    @RequestMapping(value = "/index")
    public String index() {
        return "Hello World!";
    }
}
