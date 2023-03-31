package com.example.getData.controller;

import com.example.getData.model.Data;
import com.example.getData.repository.GetRepository;
import com.example.getData.service.GetService;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Map<String, Boolean>> postRequest(@RequestBody Data data){

        Map<String, Boolean> map = new HashMap<>();
        map.put("Post succesful", true);
        service.postRequest(data);
        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }

    @GetMapping("/getData")
    @Cacheable("datas")
    public List<Data> getAllData(){
        List<Data> data = service.GetAllData();

        return data;
    }
}
