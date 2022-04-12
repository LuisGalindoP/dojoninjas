package com.luis.dojosninjas.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.luis.dojosninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {

	// this method retrieves all the Expenses from the database
    ArrayList<Ninja> findAll();
    // this method finds Expenses with descriptions containing the search string
    //this method deletes a Expense by Id
    void deleteById(Long id);
}
