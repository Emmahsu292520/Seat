package com.seatingchart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "seatingchart")
public class SeatingChart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "floor_seat_seq")
	private Integer floorSeatSEQ;
	
	
	@NotBlank(message="樓層編號不能為空")
	@Column(name = "floor_no")
	private String floorNo;

	@NotBlank(message="座位編碼不能為空")
	@Column(name = "seat_no")
	private String seatNo;
	
	
	public SeatingChart() {
		super();
	}

	public Integer getFloorSeatSEQ() {
		return floorSeatSEQ;
	}

	public void setFloorSeatSEQ(Integer floorSeatSEQ) {
		this.floorSeatSEQ = floorSeatSEQ;
	}

	public String getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

    public SeatingChart(Integer floorSeatSEQ, String floorNo, String seatNo) {
        super();
        this.floorSeatSEQ = floorSeatSEQ;
        this.floorNo = floorNo;
        this.seatNo = seatNo;
    }
	
	
	
	
}
