package com.traini8.TrainingCenterRegistry.service;

import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traini8.TrainingCenterRegistry.entity.TrainingCenter;
import com.traini8.TrainingCenterRegistry.repository.TrainingCenterRepository;

@Service
public class TrainingCenterServiceImpl implements TrainingCenterService{
	
	@Autowired
	private TrainingCenterRepository trainingCenterRepository;
	
	@Override
	public TrainingCenter createTrainingCenter(TrainingCenter  trainingCenter) {
		trainingCenter.setCreatedOn(Instant.now());
		return trainingCenterRepository.save(trainingCenter);
		
	}
	
	@Override
	public List<TrainingCenter> getAllTrainingCenters(){
		return trainingCenterRepository.findAll();	
		
	}

}
