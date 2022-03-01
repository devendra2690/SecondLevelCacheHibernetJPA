package com.devendrabrain.secondlevelcache.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devendrabrain.secondlevelcache.entity.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
