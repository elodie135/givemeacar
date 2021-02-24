package com.repository;

import com.model.Agence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository/*tout ce qui contient @ est une annotation*/
public interface AgenceRepo extends JpaRepository<Agence,Long> {
    
}
