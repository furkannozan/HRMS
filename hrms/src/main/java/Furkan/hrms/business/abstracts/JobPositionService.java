package Furkan.hrms.business.abstracts;

import java.util.List;

import Furkan.hrms.entities.concretes.JobPosition;



public interface JobPositionService {
	List<JobPosition> getAll();
}
