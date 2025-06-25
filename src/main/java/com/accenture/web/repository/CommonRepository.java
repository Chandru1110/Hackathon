package com.accenture.web.repository;

import com.accenture.web.model.ActivityDTO;

import java.util.List;

public interface CommonRepository {

    List<ActivityDTO> getActivityList();
} 