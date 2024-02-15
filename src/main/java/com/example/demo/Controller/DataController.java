package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DataService;

@RestController
public class DataController {
	
	@Autowired
	private DataService dataService;


    @GetMapping("/data")
    public List<String> getDataList() {
        return dataService.getDataList();
    }

}
