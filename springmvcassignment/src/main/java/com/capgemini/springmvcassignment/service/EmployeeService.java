package com.capgemini.springmvcassignment.service;

import java.util.List;



import com.capgemini.springmvcassignment.dto.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean getEmployeeByid(int id);
	public boolean addEmployee(EmployeeInfoBean bean);
	public boolean updateEmployee(EmployeeInfoBean bean);
	public boolean deleteEmployee(int Id);
	public List<EmployeeInfoBean> getAllEmployees();
	public EmployeeInfoBean authenticate(int empId,String password);

}
