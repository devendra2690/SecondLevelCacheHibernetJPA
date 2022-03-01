package com.devendrabrain.secondlevelcache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devendrabrain.secondlevelcache.entity.City;
import com.devendrabrain.secondlevelcache.repo.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepository;
	
	public City create(City city) {
		return cityRepository.save(city);
	}
	
	public City fetchById(Long id) {
		return cityRepository.findById(id).orElse(null);
	}
}
