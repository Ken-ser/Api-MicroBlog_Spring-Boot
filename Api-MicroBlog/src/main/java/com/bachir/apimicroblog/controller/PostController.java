/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bachir.apimicroblog.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Bachir_Karim
 */
@RestController
@RequestMapping("/posts")
public class PostController
{
    
    @RequestMapping("/url")
    public String page( Model model )
    {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
}