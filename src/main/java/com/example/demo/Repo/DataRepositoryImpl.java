package com.example.demo.Repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
class DataRepositoryImpl implements DataRepository {

    private final List<String> dataList;

    public DataRepositoryImpl() {
        // Initialize sample data list
        dataList = new ArrayList<>();
        dataList.add("Data 1");
        dataList.add("Data 2");
        dataList.add("Data 3");
    }

    @Override
    public List<String> findAll() {
        return dataList;
    }
}
