package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListBL
 */
@WebServlet("/ListBL")
public class ListBL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListBL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = (String) request.getAttribute("number");
		String name = (String) request.getAttribute("name");
		String master_flg = (String) request.getAttribute("master_flg");
		String filename = (String) request.getAttribute("filename");
		if (master_flg == "1") {//管理者ログインの場合
			try {
				Connection commst = Common.getConnection();
				Statement stmt = commst.createStatement();
				String sqlmst = "SELECT * FROM skillsheet";
				ResultSet rs = stmt.executeQuery(sqlmst);
				request.setAttribute("ResultSet", rs);
				System.out.println("管理者です");
				getServletContext().getRequestDispatcher("/jsp/List.jsp").forward(request, response);
			} catch (SQLException e) {
				System.out.println("SQLException");
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException");
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}else{
			request.setAttribute("number", number);
			request.setAttribute("name", name);
			request.setAttribute("master_flg", master_flg);
			request.setAttribute("filename", filename);
			System.out.println("一般です");
			getServletContext().getRequestDispatcher("/jsp/Skill.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
