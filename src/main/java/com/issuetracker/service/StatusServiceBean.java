package com.issuetracker.service;

import com.issuetracker.dao.api.StatusDao;
import com.issuetracker.model.Status;
import com.issuetracker.service.api.StatusService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgottval
 */
@Stateless
public class StatusServiceBean implements StatusService {

    @Inject
    private StatusDao statusDao;
    
    @Override
    public void insert(Status status) {
        statusDao.insert(status);
    }

    @Override
    public List<Status> getStatuses() {
        return statusDao.getStatuses();
    }

    @Override
    public void remove(Status status) {
        statusDao.remove(status);
    }

    @Override
    public Status getStatusById(Long id) {
        return statusDao.getStatusById(id);
    }

    @Override
    public Status getStatusByName(String name) {
        return statusDao.getStatusByName(name);
    }
}
