package com.example.demo.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.DataService;

@SpringBootTest
public class DataControllerTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private DataController dataController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDataList() {
        // Mock data from DataService
        List<String> expectedDataList = Arrays.asList("Da1", "Data2", "Data3");
        when(dataService.getDataList()).thenReturn(expectedDataList);

        // Call the controller method
        List<String> actualDataList = dataController.getDataList();

        // Verify the results
        assertEquals(expectedDataList, actualDataList);
    }
}
