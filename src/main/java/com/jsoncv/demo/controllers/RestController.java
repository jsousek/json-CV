package com.jsoncv.demo.controllers;

import com.jsoncv.demo.services.CVFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@org.springframework.web.bind.annotation.RestController

public class RestController {

    CVFactory cvFactory;

    @Autowired
    public RestController(CVFactory cvFactory) {
        this.cvFactory = cvFactory;
    }

    @PostMapping(value = "/json")
    public ResponseEntity takeCompanyNameReturnCV(@RequestHeader String name){
        return ResponseEntity.ok(cvFactory.createCV(name));
    }
}
