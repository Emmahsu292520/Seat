package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.model.EmployeeService;
import com.employee.model.EmployeeVO;
import com.seatingchart.model.SeatingChart;
import com.seatingchart.model.SeatingChartService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	SeatingChartService seatingChartService;

	@PostMapping("/submitSelection")
	public String submitSelection(@RequestParam("empId") Integer empId, @RequestParam("seatId") Integer seatId) {
		EmployeeVO employee = employeeService.getOneEmp(empId);
		SeatingChart seat = seatingChartService.getOneSeat(seatId);
		if (employee != null && seat != null) {
			employee.setSeatingChart(seat);
			employeeService.updateEmp(employee);
		}
		return "redirect:/"; // 重定向到訂位首頁，刷新頁面
	}

	@PostMapping("/clearSeat")
	public String clearSeat(@RequestParam("seatId") Integer seatId) {
		List<EmployeeVO> employees = employeeService.getAll();
		for (EmployeeVO employee : employees) {
			if (employee.getSeatingChart() != null && employee.getSeatingChart().getFloorSeatSEQ().equals(seatId)) {
				employee.setSeatingChart(null);
				employeeService.updateEmp(employee);
				break;
			}
		}
		return "redirect:/"; // 重定向到首頁，刷新頁面
	}

}
