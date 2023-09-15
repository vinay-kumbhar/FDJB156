package com.vk.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vk.main.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	List<Product> findAllByPid(int pid);

}
