package com.accenture.web.serviceImpl;

import com.accenture.web.model.ActivityDTO;
import com.accenture.web.repository.CommonRepository;
import com.accenture.web.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    CommonRepository repo;

    @Override
    public  List<ActivityDTO> getActivityList() {
        return repo.getActivityList();
    }
} 