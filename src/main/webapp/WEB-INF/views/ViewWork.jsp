<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>View Work</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" >
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css" >
</head>
<body bgcolor='lightblue'>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Employee Tracker</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
 <form class="navbar-nav ml-auto mt-8 mt-lg-0">  
      <a href="${pageContext.request.contextPath}/AdminLogin"><button class="btn btn-outline-success my-2 my-sm-0" type="button">Back</button></a>  
    </form>
</nav>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Emp.ID</th>
      <th scope="col">User</th>
      <th scope="col">Start Date</th>
      <th scope="col">End Date</th>
      <th scope="col">Status</th>
      <th scope="col">Activity</th>
      <th scope="col">Project</th>
      <th scope="col">Work Package</th>
      <th scope="col">Jira Task</th>
      <th scope="col">Type</th>
      <th scope="col">Subject</th>
      <th scope="col">Hours</th>
      <th scope="col">Comment</th>
      <th scope="col">Edit</th>
    </tr>
  </thead>
  <tbody>
    
  </tbody>
</table>
<div class="footer">
	
  <p>A product of &#169PRODEVANS</p>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>
	
</body>
</html>
