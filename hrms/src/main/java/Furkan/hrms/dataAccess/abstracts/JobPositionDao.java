package Furkan.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Furkan.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
