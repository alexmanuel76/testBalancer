package com.mova.balancertest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mova.balancertest.model.Balancer;

public interface BalancerRepository extends CrudRepository<Balancer,Integer>{

}
