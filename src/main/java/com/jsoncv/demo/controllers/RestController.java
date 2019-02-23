package com.jsoncv.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    @PostMapping(value = "/json")
    public ResponseEntity takeCompanyNameReturnCV(){
        return ResponseEntity.ok("plc");
    }
}
