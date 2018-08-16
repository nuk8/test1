<%@page import="com.mj.test.dtos.TestDto"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<%

	List<TestDto> list=(List<TestDto>)request.getAttribute("list");
%>
	 <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">

      google.charts.load("current", {packages:["corechart"]});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
        	<%
        	for(int i=0;i<list.size();i++){
        		TestDto dto=list.get(i);
        	%>
        	 ['Task', 'Hours per Day'],
             ['액션', <%=dto.getTest1()%>],
             ['코미디', <%=dto.getTest2()%>],
             ['멜로', <%=dto.getTest3()%>],
             ['로코', <%=dto.getTest4()%>],
             ['다큐멘터리', <%=dto.getTest5()%>],
             ['토끼', <%=dto.getTest6()%>],
             ['차', <%=dto.getTest7()%>]
        ]);
        <%
        	}
        	%>
        var options = {
          title: 'My Daily Activities',
          is3D: true,
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
        chart.draw(data, options);
      }
      

      
    </script>
</head>
<body>
<h1>
	Hello world!  
</h1>

 <div id="piechart_3d" style="width: 900px; height: 500px;"></div>
</body>
</html>
