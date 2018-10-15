<%-- 
    Document   : Evaluation
    Created on : 12 oct. 2018, 18:48:11
    Author     : Bandovic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>JSP Page</title>
        <style>
           th{
                
                width: 80px
            } 
            
        </style>
    </head>
    <body>
        
        
        
        <table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Evaluation</th>
     
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>ZOZO</td>
      <td>${n1}</td>
   
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Twity</td>
      <td>${n2}</td>
      
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>C54</td>
      <td>${n3}</td>
      
    </tr>
     <tr>
      <th scope="row">4</th>
      <td>ZONA</td>
      <td>${n4}</td>
   
    </tr>
  </tbody>
</table>
    </body>
</html>
