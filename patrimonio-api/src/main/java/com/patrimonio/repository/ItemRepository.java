package com.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patrimonio.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

}
