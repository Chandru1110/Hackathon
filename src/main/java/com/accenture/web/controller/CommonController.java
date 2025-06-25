package com.accenture.web.controller;

import com.accenture.web.model.ActivityDTO;
import com.accenture.web.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/common")
public class CommonController {

    @Autowired
    CommonService service;

    @GetMapping("/activityList")
    public List<ActivityDTO> getActivityList() {

        return service.getActivityList();
    }
} 