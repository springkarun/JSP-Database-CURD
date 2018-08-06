<%@page import="com.sawan.dao.UserDao"%>
<jsp:useBean id="u" class="com.sawan.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.update(u);
response.sendRedirect("viewusers.jsp");
%>