package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.DataRepository;

@Service
class DataServiceImpl implements DataService {

	@Autowired
    private DataRepository dataRepository;


    @Override
    public List<String> getDataList() {
        return dataRepository.findAll();
    }
}
