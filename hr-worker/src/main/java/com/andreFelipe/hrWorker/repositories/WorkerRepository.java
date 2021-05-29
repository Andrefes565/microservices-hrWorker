package com.andreFelipe.hrWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreFelipe.hrWorker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {


}
