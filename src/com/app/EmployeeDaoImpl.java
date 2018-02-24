package com.app;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDao
{
private JdbcTemplate template;
 public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
	@Override
	public void insertEmployee(Employee emp)
	{
		String sql="insert into softwaredb.employee values(?,?,?)";
	template.update(sql,emp.getEmpId(),emp.getEmpName(),emp.getEmpSal());
	}
}
