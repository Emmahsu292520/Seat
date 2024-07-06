package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.EmployeeRepository;
import com.employee.model.EmployeeService;
import com.seatingchart.model.SeatingChart;
import com.seatingchart.model.SeatingChartRepository;
import com.seatingchart.model.SeatingChartService;

@SpringBootApplication
public class Test_Application_CommandLineRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	SeatingChartRepository seatingChartRepository;

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	SeatingChartService seatingChartService;


	public static void main(String[] args) {
		SpringApplication.run(Test_Application_CommandLineRunner.class);
	}

	public void run(String... args) throws Exception {

//		System.out.println("進入測試");
//		// 新增座位
//		SeatingChart  seat1= new SeatingChart();
//		seat1.setFloorNo("5樓");
//		seat1.setSeatNo("座位1");
//		seatingChartRepository.save(seat1);
//
//		// 新增員工
//		EmployeeVO employee = new EmployeeVO();
//		employee.setEmpId(10006);
//		employee.setName("金貝貝");
//		employee.seteMail("down123@gmail.com");
//		employee.setSeatingChart(seat1);
//		employeeRepository.save(employee);
		
		
//		//修改員工
//		EmployeeVO employee2= employeeService.getOneEmp(10005);
//		Optional<EmployeeVO> optional = employeeRepository.findById(10005);
//		if(optional.isPresent()) {
//			EmployeeVO employee2= optional.get();
//			employee2.setName("沙龍巴斯");
//			employee2.seteMail("down126@gmail.com");
//			employee2.setSeatingChart(seat1);
//			employeeRepository.save(employee2);
//		}
		
		
//		// 修改座位
//		SeatingChart seat2 = new SeatingChart();
//		seat2.setFloorNo("6樓");
//		seat2.setSeatNo("座位2");
//		seatingChartRepository.save(seat2);
		
//		//查詢   
//		List<EmployeeVO> list = employeeRepository.findAll();  //findAll()返回的是List<T>
//		for(EmployeeVO emp : list ) {
//			System.out.println(emp);
//		}
//		
//		List<SeatingChart> seatList = seatingChartService.getAll();
//		for(SeatingChart seat : seatList) {
//			System.out.println(seat);
//		}
		

	}

}
