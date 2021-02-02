package com.example.test;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BeanRepository extends JpaRepository<BeanB, Long> {

}
