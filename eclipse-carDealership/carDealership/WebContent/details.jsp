
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details.jsp</title>
</head>
<body>
<div class="row">
 

<div class="card bg-light border-dark" style="width: 20rem;">
<img src="<c:out value="${car.picturePath}  "/>"
class="card-img-top" height = "200px" alt="Car Photo">
<div class="card-body">
<h5 class="card-title">
<c:out value="${car.year} " />
<c:out value="${car.make} " />
<c:out value="${car.modelName}  " />
</h5>
<p>
<c:out value="${car.price} " />
<br>
<c:out value="${car.odometer} " />
<br>
<c:out value="${car.color} " />
<br>
<c:out value="${car.vin} " />
<br>

</p>
<p class="card-text">
<c:out value="${car.description} " />
</p>
<c:if test="${car.isBidable }">
<a href="BidOnServlet?vin=${car.vin }">
<button type="button" class="btn btn-info">Bid on this Car</button>
</a>
</c:if>

</div>
</div>

</div>
<br>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
  </body>

</html>