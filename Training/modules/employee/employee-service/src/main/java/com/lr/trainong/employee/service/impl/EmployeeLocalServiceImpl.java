/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lr.trainong.employee.service.impl;

import com.liferay.portal.aop.AopService;
import com.lr.trainong.employee.model.Employee;
import com.lr.trainong.employee.model.impl.EmployeeImpl;
import com.lr.trainong.employee.service.base.EmployeeLocalServiceBaseImpl;

import java.sql.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.lr.trainong.employee.service.EmployeeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.lr.trainong.employee.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {


	public Employee addEmployeeDetails(String name,String address,long salary,String phoneNo,String emailAddress) {
		
		
		
		Employee employee = new EmployeeImpl();
		
		long employeeId = counterLocalService.increment(Employee.class.getName());
		employee.setEmployeeId(employeeId);
		
		employee.setName(name);
		employee.setAddress(address);
		employee.setEmailAddress(emailAddress);
		employee.setSalary(salary);
		employee.setPhoneNo(phoneNo);

		
	 employeeLocalService.addEmployee(employee);
		
		
		return employee; 
		
	}
}