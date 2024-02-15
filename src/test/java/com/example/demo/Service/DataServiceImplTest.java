package com.example.demo.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.Repo.DataRepository;

class DataServiceImplTest {

    @Mock
    private DataRepository dataRepository;

    @InjectMocks
    private DataServiceImpl dataService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetDataList() {
        // Mocking data from repository
        List<String> testData = Arrays.asList("Data1", "Data2", "Data3");
        when(dataRepository.findAll()).thenReturn(testData);

        // Calling the service method
        List<String> result = dataService.getDataList();

        // Asserting the result
        assertEquals(testData, result);
    }
}
