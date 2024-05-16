package com.angel.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.angel.curso.springboot.webapp.springbootweb.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola, ¿que tal?") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
}
