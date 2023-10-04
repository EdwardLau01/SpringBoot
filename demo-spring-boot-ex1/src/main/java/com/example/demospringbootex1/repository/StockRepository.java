package com.example.demospringbootex1.repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demospringbootex1.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{
  
  // select * from table where company_name = "";
  List<Stock> findByCompanyName(String companyName); 
}
