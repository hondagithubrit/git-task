<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="employeecontroller.caption"/></b>
</p>


<portlet:renderURL var="CreateEditRender">
     <portlet:param name="mvcRenderCommandName" value="/create/edit"/>
</portlet:renderURL>
 
<portlet:renderURL var="EmployeeEntriesRender">
     <portlet:param name="mvcEntitiesRenderCommandName" value="/refresh/Entities"/>
</portlet:renderURL>
 
<a href = "${EmployeeEntriesRender}">Employee Details</a>
 
<a href = "${CreateEditRender}">Create Employee</a>