package com.thebluecabrio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by stevenrowney on 21/03/2017.
 */
@Controller
public class ThymeleafController {

    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}
