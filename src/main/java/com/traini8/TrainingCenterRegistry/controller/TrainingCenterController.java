package com.traini8.TrainingCenterRegistry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.traini8.TrainingCenterRegistry.entity.TrainingCenter;
import com.traini8.TrainingCenterRegistry.service.TrainingCenterService;

@RestController
@RequestMapping("/api/training-centers")
@Validated
public class TrainingCenterController {
	
	@Autowired
	private TrainingCenterService trainingCenterService;
	
	// Post API
	@PostMapping
	public ResponseEntity<TrainingCenter> createTrainingCenter(@RequestBody @Validated TrainingCenter trainingCenter){
		TrainingCenter savedCenter = trainingCenterService.createTrainingCenter(trainingCenter);
		return ResponseEntity.ok(savedCenter);
	}
	
	// GET API
	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters(){
		List<TrainingCenter> centers = trainingCenterService.getAllTrainingCenters();
		return ResponseEntity.ok(centers);
	}

}
