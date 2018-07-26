package com.ORM.toN;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmloyeeRepository extends JpaRepository<employee,Long> {
}
