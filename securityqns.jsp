

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
form {border: 3px solid #f1f1f1;}

input[type=text]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

.container {
  padding: 16px;
}

</style>
</head>
<body>

<h2>Security Questions</h2>
<div class="container">

<%ArrayList<Question> qarr =
			(ArrayList<Question>)request.getAttribute("data");
		for(Question qn:qarr){%>
		<%-- Arranging data in tabular form
		--%>

				<%=qn.getQn()%>
				<br><input type="text" name="<%=qn.getCorrectAns()%>"><br></br>
				<br><input type="hidden" name="<%=qn.getCorrectAns()%>"><%=qn.getCorrectAns()%>
			<%}%>

<button type="button" onclick="myfun()">SUBMIT</button>
</div>

</body>
</html>

