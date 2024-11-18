package com.calix.bdh.repository;

import java.util.List;

import com.calix.bdh.model.Location;

public interface LocationRepositoryCustom {
        public List<Location> findByOrgId(String orgId);
}
