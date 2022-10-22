package com.andre.hrworker.repositories;

import com.andre.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository  extends JpaRepository<Worker,Long> {


}
