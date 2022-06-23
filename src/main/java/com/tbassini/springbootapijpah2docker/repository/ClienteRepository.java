package com.tbassini.springbootapijpah2docker.repository;

import com.tbassini.springbootapijpah2docker.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
