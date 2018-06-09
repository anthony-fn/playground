package com.anthony.playground.spring.mvc.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/homepage"})
public class HomeController {

  @RequestMapping(method = GET)
  public String home() {

    return "home"; // 返回名为 home 的视图
  }

}

// 等同于
/*
@controller
public class HomeController{
  @RequestMapping( value="/", method=Get)
  public String home(Model model)
  {
    return "home";
  }
}
 */
