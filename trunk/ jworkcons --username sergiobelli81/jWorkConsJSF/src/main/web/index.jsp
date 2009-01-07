<%
  final String contextRoot = request.getContextPath();
  System.out.println("contextRoot="+contextRoot);
  
  final String target = contextRoot + "/login/login.jsf";
  System.out.println("target="+target);
  
  response.sendRedirect(target);
%>

<html>
	<body>
		<label>CIAO !!! </label>
	</body>
</html>
