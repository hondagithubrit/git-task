package com.lr.training.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.lr.training.constants.EmployeeControllerPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + EmployeeControllerPortletKeys.EMPLOYEECONTROLLER,
		        "mvc.command.name=/create/edit"
		}
		  
		)
public class CreateEditRenderMvcCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/edit.jsp";
	}
	
	
}




