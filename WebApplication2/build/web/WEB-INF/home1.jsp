<%-- 
    Document   : home1
    Created on : 12 oct. 2018, 15:18:22
    Author     : Bandovic
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
          <style>
#wrapper {
width:400px;
height:350px;
margin-top: 40px;
margin-left: 490px;
border-radius:30px;
font-family: helvetica;
font-size:1.2em;
border: 1px solid grey;
background-color: appworkspace;
}
.form-group{
   
    width:300px;

    
}
h1 { color: #ff4411; font-size: 48px; font-family: 'Signika', sans-serif; padding-bottom: 10px; }
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
   margin-left: 320px;
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
</style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a  id="reload" class="navbar-brand" href="#">REST25</a>
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
   <form   class="form-inline my-2 my-lg-0" methode="post" action="login">
      <input name="nlog" class="form-control mr-sm-2" type="text" placeholder="Name" aria-label="Name">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">LOG</button>
    </form>
</nav>
        <% if(request.getAttribute("error").equals("er") ) {%>
        <div id="re" class="alert alert-danger" style="display: <%   %>" role="alert">${msg}</div>
<%}%>
       
        
</div>
        <div id="welcomme">
            
            <h1 class="display-2">Welcome to Rest25</h1>
        </div>
       <div id="wrapper">
<div id="error"></div>
<form id="validationForm" method="post" action="term">
    <div class="form-group">
    <label for="exampleFormControlInput1">Name</label>
    <input    name="name" type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">LIST OF RESTAURENT</label>
    <select  name="rest" class="form-control" id="exampleFormControlSelect1">
        

        <option>  ${list[0]}
           </option>
      <option>${list[1]}</option>
      <option>${list[2]}</option>
      <option>${list[3]}</option>
      
      
    </select>
  </div>
      <div class="form-group">
<div class='input-group date' id='datetimepicker1'>
    <input name="time" type="date" class="form-control"   min="2018-01-01" max="2018-12-31" placeholder="yyyy/mm/dd"/>
<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span>
</span>
</div>
</div>
 



 <button  id="btn" type="submit" class="btn btn-lg btn-primary" >RESERVE</button>
 <a href="/WebApplication2/Show">Show Evaluation</a>
</form>
</div>
   <script>
       
$("#reload").click((function(event) {
   alert("twaty");
window.location.reload();



});
</script>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    </body>
</html>
