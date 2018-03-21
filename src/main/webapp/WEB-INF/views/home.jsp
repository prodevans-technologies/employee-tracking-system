<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" >
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css" >
</head>
<body bgcolor='lightblue'>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Employee Tracker</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
 
</nav>

<div class="container" style="padding-top:20px;">
<div class="row">
<div class="col-md-7" ></div>
<div class="col-md-4 ">
<div class="card">
  <h5 class="card-header" >Login</h5>
  <div class="card-body">
  

<form >
  <div class="form-group">
    <label for="exampleInputEmail1">User Name</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter user name">
    <small id="emailHelp" class="form-text text-muted">We'll never share your user name with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary" >Submit</button>
</form>
</div>

</div>
</div>
</div>
</div>

<div class="footer">
	
  <p>A product of PRODEVANS&#169</p>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>
	
</body>
</html>
