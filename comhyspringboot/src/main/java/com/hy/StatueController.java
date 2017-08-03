package com.hy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/27 0027.
 */
@Controller
@RequestMapping("test")
public class StatueController {
    @ResponseBody
    @RequestMapping(value = "/{name}")
    public String getStatues(@PathVariable("name") String name){
        return "hello"+name;
    }
}
