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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
         int cond=0;
          String name;
        name = request.getParameter("nlog");
        
        String temp = null;
        String nrest = null;
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
            res = statement.executeQuery("select* from restaurent where name='"+name+"'");
              while(res.next()){
                           
                          cond=1;
			  temp =res.getString("day");
                           nrest=res.getString("rest");
                          
                          
                          
                   
                   
                   }
              if(cond==0){
                       request.setAttribute("error", "er");
                       request.setAttribute("msg", "aucun reservation pour vous");
                     this.getServletContext().getRequestDispatcher("/WEB-INF/home1.jsp").forward(request, response);}
               if(cond==1){
                      
                      request.setAttribute("name",name);
                      request.setAttribute("temp",temp);
                      request.setAttribute("rest",nrest);
                     this.getServletContext().getRequestDispatcher("/WEB-INF/LOGIN.jsp").forward(request, response);}
              
        } catch (SQLException ex) {
            Logger.getLogger(SuccesR.class.getName()).log(Level.SEVERE, null, ex);
        }
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
         int cond=0;
          String name;
           String nom=null;
           String nnrest=null;
     name = (String) request.getSession().getAttribute("r");
         String rest1 = (String) request.getSession().getAttribute("r1");
        
        int note1=Integer.parseInt(request.getParameter("note1")) ;
      int note2=Integer.parseInt(request.getParameter("note2")) ;
         int note3=Integer.parseInt(request.getParameter("note3")) ;
        int moy=(note1+note2+note3)/3;
      
        
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
          
            res = statement.executeQuery("select * from evaluation");
              while(res.next()){
                           
                           nom =res.getString("name");
			   nnrest =res.getString("rest");
                          
                          if(name.equals(nom)){
                              if(rest1.equals(nnrest)){
                                  cond=1;
                              }
                              
                          }
                          
                   
                   
                   }
              if(cond==0){
               statement.execute("insert into evaluation (name,rest,nourriture,salle,service,moy) values ('"+name+"','"+rest1+"','"+note1+"','"+note2+"','"+note3+"','"+moy+"')"); 
                     this.getServletContext().getRequestDispatcher("/WEB-INF/LOGIN.jsp").forward(request, response);
              }
               if(cond==1){
                    

                     this.getServletContext().getRequestDispatcher("/WEB-INF/LOGIN.jsp").forward(request, response);
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
