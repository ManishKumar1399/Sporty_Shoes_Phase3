package com.simplilearn.sporty.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.simplilearn.sporty.Entity.Product;
import com.simplilearn.sporty.repo.RepoProduct;


public class ProductService {
	@Autowired
	RepoProduct productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product addProductWithUser(Product product) {
		return productRepository.save(product);
	}
	
	public Optional<Product> getProductById(int id) {
		Optional<Product> proOptional = productRepository.findById(id);
		return proOptional;
	}
	
	public Optional<Product> getProductByName(String name) {
		Optional<Product> proOptional = productRepository.findByName(name);
		return proOptional;
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public List<Product> getAllProductBasedOnCatogary(String category) {
		return productRepository.findAllByCategory(category);
	}

	public void deleteProductById(int prdId) {
		productRepository.deleteById(prdId);
	}

}
