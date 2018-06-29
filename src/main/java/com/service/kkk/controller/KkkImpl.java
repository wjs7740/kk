package com.service.kkk.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-29T06:02:03.553Z")

@RestSchema(schemaId = "kkk")
@RequestMapping(path = "/kkk", produces = MediaType.APPLICATION_JSON)
public class KkkImpl {

    @Autowired
    private KkkDelegate userKkkDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userKkkDelegate.helloworld(name);
    }

}
