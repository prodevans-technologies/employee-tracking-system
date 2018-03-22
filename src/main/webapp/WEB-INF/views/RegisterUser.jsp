<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Register User</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" >
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css" >
</head>
<body bgcolor='lightblue'>
<nav class="navbar navbar-expand-lg navbar-light bg-light mt-2 mt-md-0">
  <a class="navbar-brand" href="#">Employee Tracker</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
 <form class="navbar-nav ml-auto mt-8 mt-lg-0">  
      <a href="${pageContext.request.contextPath}/AdminLogin"><button class="btn btn-outline-success my-2 my-sm-0" type="button">Back</button></a>  
    </form>
</nav>
<form>
<div class="container" style="padding-top:20px;">
<div class="row">
<div class="col-md-4" ></div>
<div class="col-md-4 ">
<div class="card">
  <h5 class="card-header" >User Registration</h5>
  <div class="card-body">
  
      <label for="inputuser">User</label>
      <input type="text" class="form-control" id="inputuser4" placeholder="User Name">
      
      <label for="inputPassword">Password</label>
      <input type="password" class="form-control" id="inputPassword" placeholder="Password">
    
    <label for="inputEmpid">Employee ID</label>
    <input type="text" class="form-control" id="inputempid" placeholder="Employee ID">
    
    <label for="inputRole">Role</label>
    <input type="text" class="form-control" id="inputrole" placeholder="Role"><br>
  
  <button type="submit" class="btn btn-primary">Create</button>
  
  </div>
  </div>
  </div>
  </div>
  </div>
</form>

<div class="footer">
	
  <p>A product of &#169PRODEVANS</p>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>
	
</body>
</html>
