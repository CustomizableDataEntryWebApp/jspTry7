/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-17 16:04:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class userui_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"FinalProjectStyling418.css\">\r\n");
      out.write("\r\n");
      out.write("<title>Welcome to CustomSD</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class = \"body\">\r\n");
      out.write("<a href=\"/index\">\r\n");
      out.write("\t<img src = \"https://i.imgur.com/P2GI5Aw.png\" \r\n");
      out.write("\talt=\"Welcome\" style =\"width:300px; height:100px;\"/>\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("<h3>Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(", \r\n");
      out.write("please type in search word(s), \r\n");
      out.write("then choose if you want to 'AND' or 'OR' the words, \r\n");
      out.write("then click search.</h3>\r\n");
      out.write("\r\n");
      out.write("<h3>Connection status </h3>\r\n");
 
try {
/* Create string of connection url within specified format with machine name, 
port number and database name. Here machine name id localhost and 
database name is usermaster. */ 
String connectionURL = "jdbc:mysql://localhost:3306/cds"; 

// declare a connection by using Connection interface 
Connection connection = null; 

// Load JBBC driver "com.mysql.jdbc.Driver" 
Class.forName("com.mysql.jdbc.Driver").newInstance(); 

/* Create a connection by using getConnection() method that takes parameters of 
string type connection url, user name and password to connect to database. */ 
connection = DriverManager.getConnection(connectionURL, "David", "password");

// check weather connection is established or not by isClosed() method 
if(!connection.isClosed())

      out.write("\t\r\n");
      out.write("<font size=\"+1\" color=\"green\"></b>\r\n");
 
out.println("Connected successfully to MySQL");
connection.close();
}
catch(Exception ex){

      out.write("\r\n");
      out.write("</font>\r\n");
      out.write("<font size=\"+1\" color=\"red\"><br/>\r\n");

out.println("Unable to connect to database.");
}

      out.write("\r\n");
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("<div style=\"border:solid black\"> \r\n");
      out.write("\tPlease type in keywords and search\r\n");
      out.write("  \t<form action=\"/userui\" method=\"post\"> \r\n");
      out.write("  \t\t<p> <font color=\"red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("  \t\t<p> <font color=\"red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorNotAllFilled}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("  \t\t<p> <font color=\"red\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorAddorOR}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></p>\r\n");
      out.write("  \t\t\r\n");
      out.write("    \tField1 <input type=\"text\" name=\"f1\"/> \r\n");
      out.write("    \tField2 <input type=\"text\" name=\"f2\"/> \r\n");
      out.write("    \tField3 <input type=\"text\" name=\"f3\"/> <br/>\r\n");
      out.write("    \t<input type=\"button\" name=\"add\" value=\"AND\" />\r\n");
      out.write("    \t<input type=\"button\" name=\"or\" value=\"OR\" /> <br/>\r\n");
      out.write("    \t<input type=\"submit\" value=\"Search\"/>\r\n");
      out.write("  \t</form>\r\n");
      out.write(" </div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
