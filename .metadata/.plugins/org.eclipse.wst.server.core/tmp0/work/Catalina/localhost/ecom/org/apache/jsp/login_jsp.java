/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.26
 * Generated at: 2023-01-18 00:13:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1671483540249L));
    _jspx_dependants.put("jar:file:/C:/Users/ASUS%20TUF%20F15/Desktop/tp%20jEE/ecom/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ecom/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602870372000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("	<head>	\r\n");
      out.write("		<meta charset=\"utf-8\">\r\n");
      out.write("		<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("		 <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("\r\n");
      out.write("		<title>Electro - Ecommerce</title>\r\n");
      out.write("\r\n");
      out.write("		<!-- Google font -->\r\n");
      out.write("		<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Bootstrap -->\r\n");
      out.write("		<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("		<!-- Slick -->\r\n");
      out.write("		<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("		<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("\r\n");
      out.write("		<!-- nouislider -->\r\n");
      out.write("		<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("\r\n");
      out.write("		<!-- Font Awesome Icon -->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Custom stlylesheet -->\r\n");
      out.write("		<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("\r\n");
      out.write("		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("		<!--[if lt IE 9]>\r\n");
      out.write("		  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("		  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("		<![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<!-- HEADER -->\r\n");
      out.write("		<header>			\r\n");
      out.write("			<!-- MAIN HEADER -->\r\n");
      out.write("			<div id=\"header\">\r\n");
      out.write("				<!-- container -->\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<!-- row -->\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<!-- LOGO -->\r\n");
      out.write("						<div class=\"col-md-3\">\r\n");
      out.write("							<div class=\"header-logo\">\r\n");
      out.write("								<a href=\"listePCH\" class=\"logo\">\r\n");
      out.write("									<img src=\"./img/logo.png\" alt=\"\">\r\n");
      out.write("								</a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /LOGO -->\r\n");
      out.write("\r\n");
      out.write("						<!-- SEARCH BAR -->\r\n");
      out.write("						<div class=\"col-md-6\" style=\"width: 500px;\">\r\n");
      out.write("							<div class=\"header-search\">\r\n");
      out.write("								<form>\r\n");
      out.write("									\r\n");
      out.write("									<input class=\"input\" placeholder=\"Search here\">\r\n");
      out.write("									<button class=\"search-btn\">Search</button>\r\n");
      out.write("								</form>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /SEARCH BAR -->\r\n");
      out.write("\r\n");
      out.write("						<!-- ACCOUNT -->\r\n");
      out.write("						<div class=\"col-md-3 clearfix\" style=\"width:330px; \">\r\n");
      out.write("							<div class=\"header-ctn\">\r\n");
      out.write("								<!-- Wishlist -->\r\n");
      out.write("								<div>\r\n");
      out.write("									<a href=\"login.jsp\">\r\n");
      out.write("										<i class=\"fa fa-sign-in\"></i>\r\n");
      out.write("										<span>Sign In</span>\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div style=\"margin-left: 0px;\">\r\n");
      out.write("									<a href=\"inscription.jsp\">\r\n");
      out.write("										<i class=\"fa fa-user-o\"></i>\r\n");
      out.write("										<span>Sign Up</span>\r\n");
      out.write("										\r\n");
      out.write("									</a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- /Wishlist -->\r\n");
      out.write("\r\n");
      out.write("								<!-- Cart -->\r\n");
      out.write("								\r\n");
      out.write("								<!-- /Cart -->\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /ACCOUNT -->\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- row -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- container -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /MAIN HEADER -->\r\n");
      out.write("		</header>\r\n");
      out.write("		<!-- /HEADER -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- SECTION -->\r\n");
      out.write("		<form action=\"");
      out.print(request.getContextPath());
      out.write("/login\"; method=\"post\">\r\n");
      out.write("		<div class=\"section\" style=\"background-image: url('http://fnh.ma//uploads/actualites/5a40b5d0ee423.jpg');\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\" style=\"margin-left: 0px; margin-right: 0px;\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"row\" style=\" width: 700px; margin-left: 800px;\">\r\n");
      out.write("      <div class=\"wrapper\">\r\n");
      out.write("               <div> <img src=\"data:image/png;base64,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\"\" alt=\"\"> </div>\r\n");
      out.write("               <p style=\"color:red;\">");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("               <form class=\"p-3 mt-3\">\r\n");
      out.write("                   <div class=\"form-field d-flex align-items-center\">  <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Email\" required=\"required\"> </div>\r\n");
      out.write("                   <div class=\"form-field d-flex align-items-center\">  <input type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Password\" required=\"required\"> </div>   <button class=\"btn mt-3\" href=\"listePCH\">Login</button>\r\n");
      out.write("                   <div class=\"text-center fs-6\">\r\n");
      out.write("         <a href=\"inscription.jsp\" style=\"width: 200px;\">Sign up</a>\r\n");
      out.write("        </div>\r\n");
      out.write("             \r\n");
      out.write("             </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("					<!-- /shop -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("\r\n");
      out.write("					</form>\r\n");
      out.write("		<!-- /SECTION -->\r\n");
      out.write("\r\n");
      out.write("		<!-- SECTION -->\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<!-- FOOTER -->\r\n");
      out.write("		<footer id=\"footer\">\r\n");
      out.write("			<!-- top footer -->\r\n");
      out.write("			<div class=\"section\">\r\n");
      out.write("				<!-- container -->\r\n");
      out.write("				<div class=\"container\">\r\n");
      out.write("					<!-- row -->\r\n");
      out.write("					<div class=\"row\">\r\n");
      out.write("						<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("							<div class=\"footer\">\r\n");
      out.write("								<h3 class=\"footer-title\">About Us</h3>\r\n");
      out.write("								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</p>\r\n");
      out.write("								<ul class=\"footer-links\">\r\n");
      out.write("									<li><a href=\"#\"><i class=\"fa fa-map-marker\"></i>1734 Stonecoal Road</a></li>\r\n");
      out.write("									<li><a href=\"#\"><i class=\"fa fa-phone\"></i>+021-95-51-84</a></li>\r\n");
      out.write("									<li><a href=\"#\"><i class=\"fa fa-envelope-o\"></i>email@email.com</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("							<div class=\"footer\">\r\n");
      out.write("								<h3 class=\"footer-title\">Categories</h3>\r\n");
      out.write("								<ul class=\"footer-links\">\r\n");
      out.write("									<li><a href=\"#\">Hot deals</a></li>\r\n");
      out.write("									<li><a href=\"#\">Laptops</a></li>\r\n");
      out.write("									<li><a href=\"#\">Smartphones</a></li>\r\n");
      out.write("									<li><a href=\"#\">Cameras</a></li>\r\n");
      out.write("									<li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"clearfix visible-xs\"></div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("							<div class=\"footer\">\r\n");
      out.write("								<h3 class=\"footer-title\">Information</h3>\r\n");
      out.write("								<ul class=\"footer-links\">\r\n");
      out.write("									<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("									<li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("									<li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("									<li><a href=\"#\">Orders and Returns</a></li>\r\n");
      out.write("									<li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"col-md-3 col-xs-6\">\r\n");
      out.write("							<div class=\"footer\">\r\n");
      out.write("								<h3 class=\"footer-title\">Service</h3>\r\n");
      out.write("								<ul class=\"footer-links\">\r\n");
      out.write("									<li><a href=\"#\">My Account</a></li>\r\n");
      out.write("									<li><a href=\"#\">View Cart</a></li>\r\n");
      out.write("									<li><a href=\"#\">Wishlist</a></li>\r\n");
      out.write("									<li><a href=\"#\">Track My Order</a></li>\r\n");
      out.write("									<li><a href=\"#\">Help</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /row -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /container -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /top footer -->\r\n");
      out.write("\r\n");
      out.write("			<!-- /bottom footer -->\r\n");
      out.write("		</footer>\r\n");
      out.write("		<!-- /FOOTER -->\r\n");
      out.write("\r\n");
      out.write("		<!-- jQuery Plugins -->\r\n");
      out.write("		<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("		<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("		<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("		<script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("		<script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("		<script src=\"js/main.js\"></script>\r\n");
      out.write(" <style>\r\n");
      out.write(" 	/* Importing fonts from Google */\r\n");
      out.write("@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700;800;900&display=swap');\r\n");
      out.write("\r\n");
      out.write("/* Reseting */\r\n");
      out.write("* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    font-family: 'Poppins', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background: #ecf0f3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper {\r\n");
      out.write("    max-width: 350px;\r\n");
      out.write("    min-height: 500px;\r\n");
      out.write("    margin: 80px auto;\r\n");
      out.write("    padding: 40px 30px 30px 30px;\r\n");
      out.write("    background-color: #ecf0f3;\r\n");
      out.write("    border-radius: 15px;\r\n");
      out.write("    box-shadow: 13px 13px 20px #cbced1, -13px -13px 20px #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo {\r\n");
      out.write("    width: 80px;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 80px;\r\n");
      out.write("    object-fit: cover;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    box-shadow: 0px 0px 3px #5f5f5f,\r\n");
      out.write("        0px 0px 0px 5px #ecf0f3,\r\n");
      out.write("        8px 8px 15px #a7aaa7,\r\n");
      out.write("        -8px -8px 15px #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .name {\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    font-size: 1.4rem;\r\n");
      out.write("    letter-spacing: 1.3px;\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("    color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .form-field input {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    display: block;\r\n");
      out.write("    border: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    font-size: 1.2rem;\r\n");
      out.write("    color: #666;\r\n");
      out.write("    padding: 10px 15px 10px 10px;\r\n");
      out.write("    /* border: 1px solid red; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .form-field {\r\n");
      out.write("    padding-left: 10px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("    box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .form-field .fas {\r\n");
      out.write("    color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .btn {\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    background-color: #03A9F4;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border-radius: 25px;\r\n");
      out.write("    box-shadow: 3px 3px 3px #b1b1b1,\r\n");
      out.write("        -3px -3px 3px #fff;\r\n");
      out.write("    letter-spacing: 1.3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper .btn:hover {\r\n");
      out.write("    background-color: #039BE5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 0.8rem;\r\n");
      out.write("    color: #03A9F4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrapper a:hover {\r\n");
      out.write("    color: #039BE5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media(max-width: 380px) {\r\n");
      out.write("    .wrapper {\r\n");
      out.write("        margin: 30px 20px;\r\n");
      out.write("        padding: 40px 15px 15px 15px;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write(" </style>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /login.jsp(117,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mdpInco}", java.lang.Object.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
