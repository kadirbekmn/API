package com.example.getData.controller;

import com.example.getData.model.Data;
import com.example.getData.repository.GetRepository;
import com.example.getData.service.GetService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@Produces(MediaType.APPLICATION_JSON)
@RequestMapping("api/v1/data")
public class GetController {

    private GetService service;

    @PostMapping("/postData")
    public List<Data> postRequest(@RequestBody List<Data> data){

        service.postRequest(data);
        List<Data> data1 = service.GetAllData();
        return data1;
    }

    @GetMapping("/getData")
    @CachePut(value = "datas")
    public List<Data> getAllData(){
        List<Data> data = service.GetAllData();
        return data;
    }
}
