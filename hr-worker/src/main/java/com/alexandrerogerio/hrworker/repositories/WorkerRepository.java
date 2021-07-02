package com.alexandrerogerio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
