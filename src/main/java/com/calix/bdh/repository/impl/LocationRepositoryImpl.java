package com.calix.bdh.repository.impl;

import org.springframework.stereotype.Repository;

import com.calix.bdh.model.Location;
import com.calix.bdh.repository.LocationRepositoryCustom;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class LocationRepositoryImpl implements LocationRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Location> findByOrgId(String orgId) {
        TypedQuery<Location> query = entityManager.createQuery(
            "SELECT l FROM Location l WHERE l.orgId = :orgId", Location.class);
        query.setParameter("orgId", orgId);
        return query.getResultList();
    }
}