package com.devendrabrain.secondlevelcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devendrabrain.secondlevelcache.entity.City;
import com.devendrabrain.secondlevelcache.service.CityService;

@RestController
public class CityController {

	@Autowired
	CityService cityService;

	@PostMapping("/create")
	public City create(@RequestBody City city) {
		return cityService.create(city);
	}

	@GetMapping("/city/{id}")
	public City fetchById(@PathVariable Long id) {
		return cityService.fetchById(id);
	}
}
