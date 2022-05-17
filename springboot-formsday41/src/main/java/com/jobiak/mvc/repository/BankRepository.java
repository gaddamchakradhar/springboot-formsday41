package com.jobiak.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvc.model.BankUser;


@Repository
public interface BankRepository extends JpaRepository<BankUser,Long> {

	

}
