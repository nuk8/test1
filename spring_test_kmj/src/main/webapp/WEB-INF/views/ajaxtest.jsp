<%@page import="com.mj.test.dtos.TestDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<%response.setContentType("text/html; charset=utf-8"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	List<TestDto> list=(List<TestDto>)request.getAttribute("list");
%>

<div>
<table>


<%
        	for(int i=0;i<list.size();i++){
        		TestDto dto=list.get(i);
        		
        		
        	%>
        	<tr>
        	<td> 검색결과 : <%=dto.getTest1()%></td>
        	</tr>
        	
        	<%
        	if(i>2){
        		}
        	}
        	%>
</table>
</div>
</body>
</html>