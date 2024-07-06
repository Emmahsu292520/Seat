package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.seatingchart.model.SeatingChart;

@Entity
@Table(name = "employee")
public class EmployeeVO {
	
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@NotBlank(message = "員工名字不能為空")
	@Pattern(regexp = "^[a-zA-Z\\u4e00-\\u9fa5]*$", message = "員工名字只能包含英文大小寫和中文！")
	@Column(name="name")
	private String name;
	
	@Email(message = "電子郵件格式不正確")
	@NotBlank(message = "員工電子郵件不能為空")
	@Column(name="e_mail")
	private String eMail;
	
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "floor_seat_seq", referencedColumnName = "floor_seat_seq")
    private SeatingChart seatingChart;


	public EmployeeVO() {
		super();
	}


	public EmployeeVO(Integer empId, String name,String eMail, SeatingChart seatingChart) {
		super();
		this.empId = empId;
		this.name = name;
		this.eMail = eMail;
		this.seatingChart = seatingChart;
		
		
		
		
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public SeatingChart getSeatingChart() {
		return seatingChart;
	}


	public void setSeatingChart(SeatingChart seatingChart) {
		this.seatingChart = seatingChart;
	}

	
	public String toString() {
		String result = "empId = " + empId + "\tname = " + name +"\tEMail = " + eMail+
				"floorSeatSEQ ="+seatingChart.getFloorSeatSEQ();
		return result;
	}
	
	
}
