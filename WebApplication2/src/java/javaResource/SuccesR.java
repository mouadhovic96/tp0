/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaResource;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bandovic
 */
@WebServlet(name = "SuccesR", urlPatterns = {"/SuccesR"})
public class SuccesR extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SuccesR</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SuccesR at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
                 
                           
        
		
			
        
        
        
       //this.getServletContext().getRequestDispatcher("/WEB-INF/Sreserve.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         int cond=0;
          String name;
        name = request.getParameter("name");
        String rest=request.getParameter("rest");
        String jour=request.getParameter("time");
              java.sql.Connection con=null;
               ResultSet res=null;
           Statement statement=null;
             try{
			  String driver="com.mysql.jdbc.Driver";
			 
			 String url = "jdbc:mysql://localhost:3306/javabase";
			  String username="root";
			  String password="";
			  Class.forName(driver);
			  con=(java.sql.Connection) DriverManager.getConnection(url,username,password);
			 if(con!=null){
				  System.out.println("connection ok");
                         }
			  statement=con.createStatement();
			 

			
			  
		  }catch(Exception e){System.out.println(e);}
                  
        try {
            res = statement.executeQuery("select* from restaurent");
              while(res.next()){
                           
                          String nom =res.getString("name");
			  String temp =res.getString("day");
                          
                          if(name.equals(nom)){
                              if(jour.equals(temp)){
                                  cond=1;
                              }
                              
                          }
                          
                   
                   
                   }
             if(!name.isEmpty()){
              if(cond==0){
               statement.execute("insert into restaurent (name,rest,day) values ('"+name+"','"+rest+"','"+jour+"')"); 
                     this.getServletContext().getRequestDispatcher("/WEB-INF/Sreserve.jsp").forward(request, response);}
               if(cond==1){
                      request.setAttribute("error", "er");
                      request.setAttribute("msg", "deja reserver");
                      
                  Restaurent rest1=new Restaurent();
        rest1.setList("TOTO");
        rest1.setList("TWITY");
        rest1.setList("C54");
        rest1.setList("ZONA");
       String []list={"ZOZO","Twity","C54","ZONA"};
        request.setAttribute("list", list);
               
                     this.getServletContext().getRequestDispatcher("/WEB-INF/home1.jsp").forward(request, response);}}
            if(name.isEmpty()){
                
                  Restaurent rest1=new Restaurent();
        rest1.setList("TOTO");
        rest1.setList("TWITY");
        rest1.setList("C54");
        rest1.setList("ZONA");
       String []list={"ZOZO","Twity","C54","ZONA"};
        request.setAttribute("list", list);
                  request.setAttribute("error", "er");
                      request.setAttribute("msg", "enter your name");
               
                     this.getServletContext().getRequestDispatcher("/WEB-INF/home1.jsp").forward(request, response);
                  
              }
              
              
        } catch (SQLException ex) {
            Logger.getLogger(SuccesR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
