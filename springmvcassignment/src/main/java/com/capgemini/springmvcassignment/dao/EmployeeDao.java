package com.capgemini.springmvcassignment.dao;

import java.util.List;

import com.capgemini.springmvcassignment.dto.EmployeeInfoBean;

public interface EmployeeDao {
	public EmployeeInfoBean getEmployeeByid(int Id);
	public boolean addEmployee(EmployeeInfoBean bean);
	public boolean updateEmployee(EmployeeInfoBean bean);
	public boolean deleteEmployee(int Id);
	public List<EmployeeInfoBean> getAllEmployees();
	public EmployeeInfoBean authenticate(int empId,String password);

}
