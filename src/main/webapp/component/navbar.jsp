

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><i class="fas fa-money-check-dollar"></i> Expense Tracker</a>
    <button class="navbar-toggler" type="button" 
            data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" 
            aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse " 
         id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" 
             aria-current="page" 
             href="index.jsp"><i class="fas fa-home"></i> Home</a>
        </li>
      </ul>
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
      
      <c:if test="${not empty loginUser }">
      
      <li class="nav-item">
          <a class="nav-link active" 
             href="#"><i class="fa-solid fa-user-secret"></i> ${loginUser.fullname }</a>
        </li>
        
        <li class="nav-item ">
          <a class="nav-link active " 
             href="../Logout"
             tabindex="-1" 
             ><i class="fas fa-user-plus"></i> Logout</a></li>
      
      </c:if>
      
      <c:if test="${ empty loginUser }">
      
      
        <li class="nav-item">
          <a class="nav-link active" 
             href="login.jsp"><i class="fas fa-sign-in-alt"></i> Login</a>
        </li>
        
        <li class="nav-item ">
          <a class="nav-link active " 
             href="register.jsp"
             tabindex="-1" 
             ><i class="fas fa-user-plus"></i> Register</a>
     
        </li>
        </c:if>
      </ul>
      
    </div>
  </div>
</nav>
