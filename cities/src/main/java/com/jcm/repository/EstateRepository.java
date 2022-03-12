package com.jcm.repository;

import com.jcm.repository.entity.Estate;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstateRepository implements PanacheRepository<Estate> {
}
