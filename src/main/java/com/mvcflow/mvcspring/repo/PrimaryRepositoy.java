package com.mvcflow.mvcspring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcflow.mvcspring.bean.PrimaryData;

@Repository
public interface PrimaryRepositoy extends JpaRepository<PrimaryData, Integer> {

}
