package com.cg.mywalletapp.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.mywalletapp.beans.Transactions;



public interface TransactionsRepo extends JpaRepository<Transactions, String>{

	@Query("SELECT t from Transactions t WHERE t.mobileNo =:mobileNo")
	public List<Transactions> findAllByMobileNo(@Param("mobileNo") String mobileNo);
}
