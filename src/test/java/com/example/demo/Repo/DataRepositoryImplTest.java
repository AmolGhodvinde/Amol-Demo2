package com.example.demo.Repo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class DataRepositoryImplTest {

    @Test
    void testFindAll() {
        // Create an instance of DataRepositoryImpl
        DataRepositoryImpl dataRepository = new DataRepositoryImpl();

        // Call the findAll() method
        List<String> dataList = dataRepository.findAll();

        // Assert that the returned list is not null and contains the expected data
        assertEquals(3, dataList.size());
        assertEquals("Data 1", dataList.get(0));
        assertEquals("Data 2", dataList.get(1));
        assertEquals("Data 3", dataList.get(2));
    }
}
