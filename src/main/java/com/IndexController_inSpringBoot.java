package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.model.EmployeeService;
import com.employee.model.EmployeeVO;
import com.seatingchart.model.SeatingChart;
import com.seatingchart.model.SeatingChartService;

@Controller
public class IndexController_inSpringBoot {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	SeatingChartService seatingChartService;

	@GetMapping("/")
	public String index(Model model) {
		List<EmployeeVO> employees = employeeService.getAll();
		List<SeatingChart> seats = seatingChartService.getAll();
		List<EmployeeVO> availableEmployees = employeeService.getAvailableEmployees();

		// 構建座位編號和員工的對應關係
		Map<Integer, EmployeeVO> empMap = new HashMap<>();
		for (EmployeeVO emp : employees) {
			if (emp.getSeatingChart() != null) {
				empMap.put(emp.getSeatingChart().getFloorSeatSEQ(), emp);
			}
		}

		model.addAttribute("empListData", employees);
		model.addAttribute("seatListData", seats);
		model.addAttribute("empMap", empMap);
		model.addAttribute("availableEmpListData", availableEmployees);

		return "seat"; // view
	}
}

//    @ModelAttribute("empListData")  
//   	public List<EmployeeVO> empListData(Model model) {
//   		
//       	List<EmployeeVO> list = employeeService.getAll();
//   		return list;
//   	}
//    
//    
//    @ModelAttribute("seatListData")  
//   	public List<SeatingChart> seatListData(Model model) {
//   		
//       	List<SeatingChart> seatList = seatingChartService.getAll();
//   		return seatList;
//   	}

//}
