package com.example.getData.repository;

import com.example.getData.model.Data;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Transactional
@Repository
public interface GetRepository extends JpaRepository<Data, Long> {

}