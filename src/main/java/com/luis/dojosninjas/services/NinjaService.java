package com.luis.dojosninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.luis.dojosninjas.models.Ninja;
import com.luis.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	//Adding the Ninja repository as a dependency
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	//Returns all Ninjas
	public ArrayList<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
}
