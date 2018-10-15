<%-- 
    Document   : LOGIN
    Created on : 12 oct. 2018, 19:11:44
    Author     : Bandovic
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Login</title>
        <style>
            #wrapper {
width:250px;
height:150px;
margin-top: 40px;
margin-left: 40px;
float: left;
border-radius:30px;
font-family: helvetica;
font-size:1.2em;
border: 1px solid grey;
background-color: appworkspace;
}
 #wrapper2 {
width:600px;
margin-top: 40px;
height:500px;
float: left;
margin-left:100px;
border-radius:30px;
font-family: helvetica;
font-size:1.2em;
border: 1px solid grey;
background-color: appworkspace;
}
           .form-group{
   
    width:300px;

    
}
/*input {
width:300px;
height:30px;
padding:5px;
border-radius:5px;
font-size:1.2em;
border: 1px solid grey;
margin-bottom:10px;
}
label {
width:200px;

padding-top:7px;
}*/
#validationForm{
    margin-left: 50px;
}
#welcomme{
   margin-left: 470px;
   margin-top: 30px;
    
    
    
}
#submitButton {
height:50px;
margin-left:200px;
width:100px;
}
#error {
color:red;
margin:20px;
}
h1{
   margin-left: 120px;
    
}
input{
    width: 150px
}
            
            
        </style>
    </head>
    <body>
      <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#/WebApplication2/CLOCO">REST25</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#navbarText"> <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
       
    </ul>
    <span class="navbar-text">
      
    </span>
  </div>
  
</nav>
    
           <div id="wrapper">
<div id="error"></div>
<%  
   String name11=(String)request.getAttribute("name");
   String name12=(String)request.getAttribute("rest");
   
    // String name1=request.getParameter("rest");
    session.setAttribute("r", name11); 
session.setAttribute("r1", name12); 
   
   


%>
<ul>
    <li>
      Name:${name}
    </li>
     <li>
      Restaurent:${rest}
    </li>
     <li>
      Date:${temp}
    </li>
    
    
</ul>

</div>
         <div id="wrapper2">
<div id="error"></div>
<form id="validationForm" method="post" action="login">
     <h1>EVALUATION</h1>
    <div class="form-group">
       
    <label for="exampleFormControlInput1">Nourriture</label>
    <input name="note1" type="number"  min="0" max="20" class="form-control"  style="width: 470px "id="exampleFormControlInput2" placeholder="/20">
  </div>
      <div class="form-group">
       
    <label for="exampleFormControlInput2">la salle</label>
    <input name="note2" type="number"  min="0" max="20" class="form-control" style="width: 470px" id="exampleFormControlInput2" placeholder="/20">
  </div>
      <div class="form-group">
       
    <label for="exampleFormControlInput3">Service</label>
    <input name="note3" type="number"  min="0" max="20" class="form-control"  style="width: 470px "id="exampleFormControlInput3" placeholder="/20">
  </div>
  
     
 



 <button type="submit" class="btn btn-lg btn-primary" >evaluer</button>
 
</form>
</div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
