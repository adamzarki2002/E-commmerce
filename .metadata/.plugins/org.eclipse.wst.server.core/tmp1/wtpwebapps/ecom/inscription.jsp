<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

		<title>Electro - Ecommerce</title>

		<!-- Google font -->
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

		<!-- Bootstrap -->
		<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>

		<!-- Slick -->
		<link type="text/css" rel="stylesheet" href="css/slick.css"/>
		<link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>

		<!-- nouislider -->
		<link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>

		<!-- Font Awesome Icon -->
		<link rel="stylesheet" href="css/font-awesome.min.css">

		<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="css/style.css"/>

		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

    </head>
	<body>
		<!-- HEADER -->
		<header>			
			<!-- MAIN HEADER -->
			<div id="header">
				<!-- container -->
				<div class="container">
					<!-- row -->
					<div class="row">
						<!-- LOGO -->
						<div class="col-md-3">
							<div class="header-logo">
								<a href="#" class="logo">
									<img src="./img/logo.png" alt="">
								</a>
							</div>
						</div>
						<!-- /LOGO -->

						<!-- SEARCH BAR -->
						<div class="col-md-6" style="width: 500px;">
							<div class="header-search">
								<form>
									
									<input class="input" placeholder="Search here">
									<button class="search-btn">Search</button>
								</form>
							</div>
						</div>
						<!-- /SEARCH BAR -->

						<!-- ACCOUNT -->
						<div class="col-md-3 clearfix" style="width:330px; ">
							<div class="header-ctn">
								<!-- Wishlist -->
								<div>
									<a href="login.jsp">
										<i class="fa fa-sign-in"></i>
										<span>Sign In</span>
									</a>
								</div>
								<div style="margin-left: 0px;">
									<a href="inscription.jsp">
										<i class="fa fa-user-o"></i>
										<span>Sign Up</span>
										
									</a>
								</div>
								<!-- /Wishlist -->

								<!-- Cart -->
								<div style="margin-left: 0px;">
									<a href="cart.jsp">
										<i class="fa fa-shopping-cart"></i>
										<span>Your Cart</span>
										
									</a>
								</div>
								<!-- /Cart -->

							</div>
						</div>
						<!-- /ACCOUNT -->
					</div>
					<!-- row -->
				</div>
				<!-- container -->
			</div>
			<!-- /MAIN HEADER -->
		</header>
		<!-- /HEADER -->


		<!-- SECTION -->
		<div class="section" style="background-image: url('http://fnh.ma//uploads/actualites/5a40b5d0ee423.jpg');">
			<!-- container -->
			<div class="container" style="margin-left: 0px; margin-right: 0px;">

				<div class="row" style=" width: 700px; margin-left: 800px;">
      <div class="wrapper">
<div> <img src="data:image/png;base64,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" alt=""> </div>
               <form role="form" action="<%=request.getContextPath()%>/inscription"; method="post">
               <form class="p-3 mt-3">
                   <div class="form-field d-flex align-items-center">  <input type="nomcli" name="nomcli" id="nomcli" placeholder="Nom" required="required"> </div>
                   <div class="form-field d-flex align-items-center">  <input type="prenomcli" name="prenomcli" id="prenomcli" placeholder="Prénom" required="required"> </div>
                   <div class="form-field d-flex align-items-center">  <input type="email" name="email" id="email" placeholder="Email" required="required"> </div>
                   <div class="form-field d-flex align-items-center">  <input type="numtel" name="numtel" id="numtel" placeholder="numéro du telephone" required="required"> </div>
                   <div class="form-field d-flex align-items-center">  <input type="adrcli" name="adrcli" id="adrcli" placeholder="Adresse" required="required"> </div>
                   <div class="form-field d-flex align-items-center">  <input type="password" name="pass" id="pass" placeholder="Password" required="required"> </div>   <button class="btn mt-3">S'inscrir</button>
                   <div class="text-center fs-6">
         <a href="login.jsp" style="width: 200px;">Sign In</a>
        </div>
             </form>
             </div>
        </form>
        
    </div>
					<!-- /shop -->
				</div>
				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
		<!-- /SECTION -->

				<!-- /row -->
			</div>
			<!-- /container -->
		</div>
									</div>
					
		<!-- /SECTION -->

		<!-- SECTION -->
		

		
		<!-- FOOTER -->
		<footer id="footer">
			<!-- top footer -->
			<div class="section">
				<!-- container -->
				<div class="container">
					<!-- row -->
					<div class="row">
						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">About Us</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>
								<ul class="footer-links">
									<li><a href="#"><i class="fa fa-map-marker"></i>1734 Stonecoal Road</a></li>
									<li><a href="#"><i class="fa fa-phone"></i>+021-95-51-84</a></li>
									<li><a href="#"><i class="fa fa-envelope-o"></i>email@email.com</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Categories</h3>
								<ul class="footer-links">
									<li><a href="#">Hot deals</a></li>
									<li><a href="#">Laptops</a></li>
									<li><a href="#">Smartphones</a></li>
									<li><a href="#">Cameras</a></li>
									<li><a href="#">Accessories</a></li>
								</ul>
							</div>
						</div>

						<div class="clearfix visible-xs"></div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Information</h3>
								<ul class="footer-links">
									<li><a href="#">About Us</a></li>
									<li><a href="#">Contact Us</a></li>
									<li><a href="#">Privacy Policy</a></li>
									<li><a href="#">Orders and Returns</a></li>
									<li><a href="#">Terms & Conditions</a></li>
								</ul>
							</div>
						</div>

						<div class="col-md-3 col-xs-6">
							<div class="footer">
								<h3 class="footer-title">Service</h3>
								<ul class="footer-links">
									<li><a href="#">My Account</a></li>
									<li><a href="#">View Cart</a></li>
									<li><a href="#">Wishlist</a></li>
									<li><a href="#">Track My Order</a></li>
									<li><a href="#">Help</a></li>
								</ul>
							</div>
						</div>
					</div>
					<!-- /row -->
				</div>
				<!-- /container -->
			</div>
			<!-- /top footer -->

			<!-- /bottom footer -->
		</footer>
		<!-- /FOOTER -->

		<!-- jQuery Plugins -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/slick.min.js"></script>
		<script src="js/nouislider.min.js"></script>
		<script src="js/jquery.zoom.min.js"></script>
		<script src="js/main.js"></script>
 <style>
 	/* Importing fonts from Google */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');

/* Reseting */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}

body {
    background: #ecf0f3;
}

.wrapper {
    max-width: 350px;
    min-height: 500px;
    margin: 80px auto;
    padding: 40px 30px 30px 30px;
    background-color: #ecf0f3;
    border-radius: 15px;
    box-shadow: 13px 13px 20px #cbced1, -13px -13px 20px #fff;
}

.logo {
    width: 80px;
    margin: auto;
}

.logo img {
    width: 100%;
    height: 80px;
    object-fit: cover;
    border-radius: 50%;
    box-shadow: 0px 0px 3px #5f5f5f,
        0px 0px 0px 5px #ecf0f3,
        8px 8px 15px #a7aaa7,
        -8px -8px 15px #fff;
}

.wrapper .name {
    font-weight: 600;
    font-size: 1.4rem;
    letter-spacing: 1.3px;
    padding-left: 10px;
    color: #555;
}

.wrapper .form-field input {
    width: 100%;
    display: block;
    border: none;
    outline: none;
    background: none;
    font-size: 1.2rem;
    color: #666;
    padding: 10px 15px 10px 10px;
    /* border: 1px solid red; */
}

.wrapper .form-field {
    padding-left: 10px;
    margin-bottom: 20px;
    border-radius: 20px;
    box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;
}

.wrapper .form-field .fas {
    color: #555;
}

.wrapper .btn {
    box-shadow: none;
    width: 100%;
    height: 40px;
    background-color: #03A9F4;
    color: #fff;
    border-radius: 25px;
    box-shadow: 3px 3px 3px #b1b1b1,
        -3px -3px 3px #fff;
    letter-spacing: 1.3px;
}

.wrapper .btn:hover {
    background-color: #039BE5;
}

.wrapper a {
    text-decoration: none;
    font-size: 0.8rem;
    color: #03A9F4;
}

.wrapper a:hover {
    color: #039BE5;
}

@media(max-width: 380px) {
    .wrapper {
        margin: 30px 20px;
        padding: 40px 15px 15px 15px;
    }
}
 </style>
	</body>
</html>
