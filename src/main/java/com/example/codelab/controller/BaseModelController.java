package com.example.codelab.controller;

import com.example.codelab.models.BaseModel;
import com.example.codelab.repositories.BaseModelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class BaseModelController {

    private final BaseModelRepository baseModelRepository;

    public BaseModelController(BaseModelRepository baseModelRepository) {
        this.baseModelRepository = baseModelRepository;
    }


    @GetMapping("/hello")
    public String hello() {
        baseModelRepository.save(new BaseModel());
        System.out.println(baseModelRepository.findAll());
        System.out.println(baseModelRepository.searchAll());
        return "Hello world!";
    }

}
