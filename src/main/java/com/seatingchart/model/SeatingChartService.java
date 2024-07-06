package com.seatingchart.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SeatingChartService")
public class SeatingChartService {
	
	@Autowired
	SeatingChartRepository seatingChartRepository;
	
	public SeatingChart getOneSeat(Integer floorSeatSEQ){
		Optional<SeatingChart> optional= seatingChartRepository.findById(floorSeatSEQ);
		return optional.orElse(null);
	}
	
	public List<SeatingChart> getAll(){
		return seatingChartRepository.findAll();
	}
	
	
	public void addSeat(SeatingChart seatingChart) {
		seatingChartRepository.save(seatingChart);
	}

	
	public void updateSeat(SeatingChart seatingChart) {
		seatingChartRepository.save(seatingChart);
	}
}
