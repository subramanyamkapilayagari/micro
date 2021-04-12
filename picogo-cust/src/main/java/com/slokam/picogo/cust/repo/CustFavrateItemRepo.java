package com.slokam.picogo.cust.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picogo.cust.entity.CustFavrateItem;
				@Repository
				public interface CustFavrateItemRepo extends JpaRepository<CustFavrateItem, Integer> {

				}
