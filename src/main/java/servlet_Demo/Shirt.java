package servlet_Demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/shirt",initParams=@WebInitParam(name="discount",value="35"))
public class Shirt extends HttpServlet
{
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	
	String discount=getServletConfig().getInitParameter("discount");
	
	String spdiscount=getServletContext().getInitParameter("spdiscount");
	
	resp.getWriter().print("<h1> Hello "+name+" your discount on Shirt is "+discount+"% and Special discount is "+spdiscount+"%</h1>");
}
}
