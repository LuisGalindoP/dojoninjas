package com.luis.dojosninjas.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.luis.dojosninjas.models.Dojo;
import com.luis.dojosninjas.repositories.DojoRepository;


@Service
public class DojoService {
	
	// Adding the Expense repository as a dependency
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	//Returns all the expenses
	public ArrayList<Dojo> allExpenses() {
		return dojoRepository.findAll();
	}
}
