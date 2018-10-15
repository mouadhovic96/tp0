/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaResource;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "Eva", urlPatterns = {"/Eva"})
public class Eva extends HttpServlet {

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
            out.println("<title>Servlet Eva</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Eva at " + request.getContextPath() + "</h1>");
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
     int note1=getNote1("ZOZO");
       int note2=getNote1("Twity");
       int note3=getNote1("C54");
      int note4=getNote1("ZONA");
      request.setAttribute("n1", note1);
       request.setAttribute("n2", note2);
        request.setAttribute("n3", note3);
         request.setAttribute("n4", note4);
                
        
        
        
        
        
           
        this.getServletContext().getRequestDispatcher("/WEB-INF/Evaluation.jsp").forward(request, response);
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
        processRequest(request, response);
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

    private int getNote1(String nrest) {
           int note=0;
           int cursore=0;
         int fnote=0;
      
        
             Connection con=null;
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
          
            res = statement.executeQuery("select * from evaluation where rest='"+nrest+"'");
              while(res.next()){
                           cursore++;
                           note =note+res.getInt("moy");
                           
			   
                          
                         
                          
                   
                   
                   }
              if(cursore!=0){
                  if(note!=0){
                       fnote=note/cursore;
             
                  }
              }
             
              
        } catch (SQLException ex) {
            Logger.getLogger(SuccesR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return fnote;
        //To change body of generated methods, choose Tools | Templates.
    }

}
