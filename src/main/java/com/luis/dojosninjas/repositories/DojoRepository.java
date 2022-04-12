package com.luis.dojosninjas.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.luis.dojosninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	// this method retrieves all the Expenses from the database
    ArrayList<Dojo> findAll();
    // this method finds Expenses with descriptions containing the search string
    //this method deletes a Expense by Id
    void deleteById(Long id);
}
