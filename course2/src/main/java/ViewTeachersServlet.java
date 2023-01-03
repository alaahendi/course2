
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewTeachersServlet
 */
@WebServlet("/ViewTeachersServlet")
public class ViewTeachersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewTeachersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(
				" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\"><ul class=\"nav\">\r\n"
						+ "  <li class=\"nav-item\">\r\n" + "<li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/Home.html\"> Logout</a>\r\n"
						+ "  </li>"
						+ "  <li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/ViewClassesServlet\"> View Classes List</a>\r\n"
						+ "  </li>\r\n" + "  <li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/ViewClassInfo\"> View Class Information List</a>\r\n"
						+ "  </li>\r\n" + " <li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/ViewStudentsServlet\"> View Students List</a>\r\n"
						+ "  </li>\r\n" + "  <li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/ViewSubjectsServlet\"> View Subjects List</a>\r\n"
						+ "  </li>\r\n" + "  <li class=\"nav-item\">\r\n"
						+ "    <a class=\"nav-link\" href=\"/Course2project/ViewTeachersServlet\"> View Teachers List</a>\r\n"
						+ "  </li>\r\n" + "</ul>");
		out.println("<h1>Teachers List</h1>");

		List<Teachers> list = TeachersDao.getAllTeachers();

		out.print("<table border='1' width='100%' class=\"table table-striped\">");
		out.print("<tr><th>Teacher Id</th><th>First Name</th><th>Last Name</th><th>Major</th></tr>");
		for (Teachers t : list) {
			out.print("<tr><td>" + t.getTeacher_id() + "</td><td>" + t.getFname() + "</td><td>" + t.getLname()
					+ "</td><td>" + t.getMajor() + "</td>");
		}
		out.print("</table>");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
}
