package com.lr.training.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.lr.training.constants.EmployeeControllerPortletKeys;
import com.lr.trainong.employee.service.EmployeeService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
		        "mvc.command.name=saveEmployee"
		},
		service = MVCActionCommand.class)
public class SaveActionMvcCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String name = ParamUtil.get(actionRequest, "name", "");
		String address =ParamUtil.get(actionRequest, "address", "");
		String phoneNo =ParamUtil.get(actionRequest, "phoneNo", "");
		long salary = ParamUtil.get(actionRequest, "salary",0);
		String emailAddress =ParamUtil.get(actionRequest, "emailAddress", "");

		
		System.out.println("VALUES --> " + name +" -  "+ address +" -  "+ phoneNo +" - "+ salary +" - "+ emailAddress);
		
		_employeeService.addEmployeeDetails(name, address, salary, phoneNo, emailAddress); 
		
	}


	private EmployeeService _employeeService;
	
	@Reference(unbind = "-")
	protected void setEmployeeService(EmployeeService employeeService) {
		
		_employeeService = employeeService;
		
	}
	
	
	
}
