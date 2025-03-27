package com.traini8.TrainingCenterRegistry.service;

import java.util.List;

import com.traini8.TrainingCenterRegistry.entity.TrainingCenter;

public interface TrainingCenterService {
	
	TrainingCenter createTrainingCenter(TrainingCenter trainingCenter);
	List<TrainingCenter> getAllTrainingCenters();

}
