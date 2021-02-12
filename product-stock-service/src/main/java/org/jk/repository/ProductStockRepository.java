package org.jk.repository;

import org.jk.entity.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {

	ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);
	
}
