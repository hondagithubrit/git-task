<%@ include file="/init.jsp" %> 

<portlet:actionURL name="saveEmployee" var="saveEmployeeURL">

</portlet:actionURL>

<h1>Create/Edit Employee Details</h1>
 

<aui:form name="form" action="${saveEmployeeURL}" >
    
    <aui:input name="name"></aui:input>
    <aui:input name="address"></aui:input>
    <aui:input name="phoneNo"></aui:input>
    <aui:input name="salary"></aui:input>
    <aui:input name="emailAddress"></aui:input>


    <aui:button-row>
       <aui:button cssClass="btn-btn-promary" type="submit"></aui:button>
    </aui:button-row>
    
    
    
</aui:form>