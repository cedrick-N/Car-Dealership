<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <title>display/inventory</title>
  </head>
  <body>
  // header starts here
  <div class="header-bottom">
		<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
			<a class="navbar-brand" href ="index.jsp"><span class = "logo">Ced's Dealership</span></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarCollapse" aria-controls="navbarCollapse"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link" href ="inventoryServlet">inventory <span
						class ="sr-only">(current)</span>
					</a>
					</li>
					<li class="nav-item active">
						<a class="nav-link" href ="addCar.jsp">Add Car
						</a>
					</li> 
					<li class="nav-item active"><a class="nav-link disabled"
						href="#" tabindex="-1" aria-disabled="true">buy</a></li> 
				</ul>
				
			</div>
		</nav>
	</div>
  // header ends here
  <br>
  <br>
    
    <form action="addCarServlet" method = "post">
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="Make">Make</label>
      <input type="text" class="form-control" id="make" name = "make" placeholder= "make">
    </div>
    <div class="form-group col-md-6">
      <label for="odometer">Odometer</label>
      <input type="text" class="form-control" id="odometer" name="odometer" placeholder= "odometer">
    </div>
  </div>
  <div class="form-group">
    <label for="modelName">Model Name</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Model" name ="model">
  </div>
  <div class="form-group">
    <label for="year">Year</label>
    <input type="text" class="form-control" id="year" placeholder="Year" name= "year">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Description</label>
      <textarea  class="form-control" id="description" placeholder = "Description" name ="description"></textarea>
    </div>
    
    <div class="form-group col-md-2">
      <label for="inputZip">Price</label>
      <input type="text" class="form-control" id="price" name= "price" placeholder= "Price">
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Color</label>
      <input type="text" class="form-control" id="color" name= "color" placeholder= "Color">
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Vin</label>
      <input type="text" class="form-control" id="vin" name= "vin" placeholder= "vin">
    </div>
   <!--   <div class="form-group col-md-2">
      <label for="inputZip">Date Received</label>
      <input type="date" class="form-control" id="date" name= "dateReceived" placeholder= "Date Received">
    </div> -->
  </div>
  <div class="form-group">
    <label for="picture">Picture Path</label>
    <input type="text" class="form-control" id="picture" placeholder="Picture" name= "picture">
  </div>
  <div class="form-group">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" id="gridCheck">
      <label class="form-check-label" for="gridCheck">
        Check me out
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Add car</button>
</form>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>
</html>