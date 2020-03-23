package src.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;


@WebServlet("/VerActividades")
public class VerActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerActividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	//doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloActividad mActividades = new ModeloActividad();
		ArrayList<Actividad> actividades = mActividades.selectAll();
		
		request.setAttribute("actividades", actividades);
		request.getRequestDispatcher("verActividades.jsp").forward(request, response);
	}
	//doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
