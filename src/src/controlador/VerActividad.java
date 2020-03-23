package src.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;

/**
 * Servlet implementation class VerActividad
 */
@WebServlet("/VerActividad")
public class VerActividad extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerActividad() {
        super();
        // TODO Auto-generated constructor stub
    }

	//doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idActividad = Integer.parseInt(request.getParameter("id"));
		
		ModeloActividad mActividad = new ModeloActividad();
		Actividad actividad = mActividad.get(idActividad);
		
		request.setAttribute("actividad", actividad);
		request.getRequestDispatcher("verActividad.jsp").forward(request, response);		
	}

	//doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
