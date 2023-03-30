package com.example.getData.service;

import com.example.getData.repository.GetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetService {
    private GetRepository repository;
}
