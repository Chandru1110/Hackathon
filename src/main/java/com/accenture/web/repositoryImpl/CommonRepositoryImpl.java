package com.accenture.web.repositoryImpl;

import com.accenture.web.model.ActivityDTO;
import com.accenture.web.repository.CommonRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CommonRepositoryImpl implements CommonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActivityDTO> getActivityList() {
        TypedQuery<ActivityDTO> query = entityManager.createQuery(
            "FROM ActivityDTO", ActivityDTO.class);
        return query.getResultList();
    }
} 