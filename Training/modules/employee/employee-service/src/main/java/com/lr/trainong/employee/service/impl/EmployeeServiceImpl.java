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
import com.lr.trainong.employee.service.EmployeeLocalServiceUtil;
import com.lr.trainong.employee.service.base.EmployeeServiceBaseImpl;

import java.sql.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.lr.trainong.employee.service.EmployeeService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=employee",
		"json.web.service.context.path=Employee"
	},
	service = AopService.class
)
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {


	public Employee addEmployeeDetails(String name,String address,long salary,String phoneNo,String emailAddress) {
		
	return EmployeeLocalServiceUtil.addEmployeeDetails(name, address, salary, phoneNo, emailAddress);
	
		
	} 
	
}