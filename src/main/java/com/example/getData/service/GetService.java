package com.example.getData.service;

import com.example.getData.model.Data;
import com.example.getData.repository.GetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GetService {

    private GetRepository repository;

    public void postRequest(List<Data> data) {
        for(Data loop : data){
            Optional<Data> repositoryById = repository.findById(loop.getId());
            if(repositoryById.isEmpty()){
                repository.save(loop);
            }
            if(repositoryById.isPresent()){
                repository.save(loop);
            }
        }
    }

    public List<Data> GetAllData() {

        List<Data> dataList = repository.findAll();

        return dataList;
    }


    public void method1(){
        Data data;

        for(long i = 1; i < 1000; i++){
            data = new Data(i,"pxm_price" + i);
            repository.save(data);
        }
    }

}
