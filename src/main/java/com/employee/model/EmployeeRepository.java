package com.employee.model;

import org.springframework.data.jpa.repository.JpaRepository;
                                            //JpaRepository<要操作的永續類別, 主鍵類型>
public interface EmployeeRepository extends JpaRepository<EmployeeVO, Integer>{

}
