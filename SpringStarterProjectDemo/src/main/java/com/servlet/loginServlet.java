package com.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("From Login Servlet");
		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
	    String json = "";
	        	    
//	    Gson gson = new Gson();
	    		
//		String json1 = gson.toJson("{ 'success': 'true', 'location': '" + jspURL + "Analytics.jsp'}");
        String json2 = null;
        String json3 = null;
        String jsonString = null;
		String getInfoParam = request.getParameter("getInfoParam");
		System.out.println("action = " + getInfoParam);
		
		
		if(br != null){
	    	json = br.readLine();
	    }
		

        System.out.println("AnalyticsjsonString: " + jsonString);
	    PrintWriter writer = response.getWriter();
		writer.println(jsonString);
		writer.flush();
	}

}
