/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maharishi_inn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Langlang
 */
@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String home(Model model) {
        return "welcome";
    }
}
