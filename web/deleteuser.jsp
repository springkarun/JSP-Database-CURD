<%@page import="com.sawan.dao.UserDao"%>
<jsp:useBean id="u" class="com.sawan.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
UserDao.delete(u);
response.sendRedirect("viewusers.jsp");
%>