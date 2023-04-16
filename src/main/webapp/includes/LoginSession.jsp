<!-- Checks if session is null and redirect -->
<%
if (session.getAttribute("auth") == null) {
	response.sendRedirect("Login.jsp");
}
%>