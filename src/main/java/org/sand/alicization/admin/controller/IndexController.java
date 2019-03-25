package org.sand.alicization.admin.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * project:alicization
 * author:zhengguocchun
 * date:2019/3/22
 */
@RestController
@RequestMapping(value = "/admin")
public class IndexController {

    @RequestMapping(value = "/login")
    public ModelAndView index(ModelMap map){
        map.put("name","test");
        return new ModelAndView("/admin/login");
    }
}
