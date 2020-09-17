<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <title>Search Results</title>
  </head>
  <body>
  // nav bar starts here
	<div class="header-bottom">
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<a class="navbar-brand" href ="index.jsp">Ced's Dealership</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarCollapse" aria-controls="navbarCollapse"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href ="display.jsp">inventory <span
						class ="sr-only">(current)</span>
					</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href ="addCar.jsp">Add Car
						</a>
					</li> 
					<li class="nav-item"><a class="nav-link disabled"
						href="#" tabindex="-1" aria-disabled="true">buy</a></li> 
				</ul>
				<form action ="SearchServlet" method="POST"  class="form-inline mt-2 mt-md-0">
					
					 <input
					 	name="Search"
						class="form-control mr-sm-2" type="text"
						placeholder="Search" aria-label="Search" />
					<button class="btn btn-outline-success my-2 my-sm-0"
						type="submit">Search</button>
				</form>
			</div>
		</nav>
	</div>
//header ends here
  <div class="row">
<c:if test="${searchResults != null}">

<c:forEach var="car" items="${searchResults}">

<div class="card bg-light border-dark" style="width: 20rem;">
<img src="<c:out value="${car.picturePath}  "/>"
class="card-img-top" height = "200px" alt="Car Photo">
<div class="card-body">
<h5 class="card-title">
<c:out value="${car.year} " />
<c:out value="${car.make} " />
<c:out value="${car.modelName}  " />
</h5>
<p class="card-text">
<c:out value="${car.description} " />
</p>
<p><a href="DetailsServlet?vin=${car.vin }">Details</a></p>
</div>
</div>




</c:forEach>
</c:if>
</div>
<br>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>