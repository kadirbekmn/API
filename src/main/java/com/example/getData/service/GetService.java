package com.example.getData.service;

import com.example.getData.model.Data;
import com.example.getData.repository.GetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GetService {
    private GetRepository repository;

    public void postRequest(Data data) {
        Optional<Data> repositoryById = repository.findById(data.getId());
        if(repositoryById.isEmpty()){
            repository.save(data);
        }
        if(repositoryById.isPresent()){
            repository.save(data);
        }
    }

    public List<Data> GetAllData() {

        List<Data> dataList = repository.findAll();

        return dataList;
    }
}
