package com.accenture.web.service;

import com.accenture.web.model.ActivityDTO;

import java.util.List;

public interface CommonService {
    /**
     * Retrieves a list of all activities.
     */
    List<ActivityDTO> getActivityList();
} 