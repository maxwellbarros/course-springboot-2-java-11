package com.well.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.well.course.entities.Product;
import com.well.course.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}
}
