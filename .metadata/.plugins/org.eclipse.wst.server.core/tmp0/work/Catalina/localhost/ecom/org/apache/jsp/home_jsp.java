/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.26
 * Generated at: 2023-01-19 10:27:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("	<head>\r\n");
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
      out.write("<header>			\r\n");
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
      out.write("									\r\n");
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
      out.write("		<!-- NAVIGATION -->\r\n");
      out.write("		<nav id=\"navigation\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- responsive-nav -->\r\n");
      out.write("				<div id=\"responsive-nav\">\r\n");
      out.write("					<!-- NAV -->\r\n");
      out.write("					<ul class=\"main-nav nav navbar-nav\">\r\n");
      out.write("						<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("						<li><a href=\"#\">Laptops</a></li>\r\n");
      out.write("						<li><a href=\"#\">Smartphones</a></li>\r\n");
      out.write("						<li><a href=\"#\">Cameras</a></li>\r\n");
      out.write("						<li><a href=\"#\">Accessories</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("					<!-- /NAV -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /responsive-nav -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- /NAVIGATION -->\r\n");
      out.write("\r\n");
      out.write("		<!-- SECTION -->\r\n");
      out.write("		<div class=\"section\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<!-- shop -->\r\n");
      out.write("					<div class=\"col-md-4 col-xs-6\">\r\n");
      out.write("						<div class=\"shop\">\r\n");
      out.write("							<div class=\"shop-img\">\r\n");
      out.write("								<img src=\"./img/shop01.png\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"shop-body\">\r\n");
      out.write("								<h3>Laptop<br>Collection</h3>\r\n");
      out.write("								<a href=\"#\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /shop -->\r\n");
      out.write("\r\n");
      out.write("					<!-- shop -->\r\n");
      out.write("					<div class=\"col-md-4 col-xs-6\">\r\n");
      out.write("						<div class=\"shop\">\r\n");
      out.write("							<div class=\"shop-img\">\r\n");
      out.write("								<img src=\"./img/shop03.png\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"shop-body\">\r\n");
      out.write("								<h3>Accessories<br>Collection</h3>\r\n");
      out.write("								<a href=\"#\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /shop -->\r\n");
      out.write("\r\n");
      out.write("					<!-- shop -->\r\n");
      out.write("					<div class=\"col-md-4 col-xs-6\">\r\n");
      out.write("						<div class=\"shop\">\r\n");
      out.write("							<div class=\"shop-img\">\r\n");
      out.write("								<img src=\"./img/shop02.png\" alt=\"\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"shop-body\">\r\n");
      out.write("								<h3>Cameras<br>Collection</h3>\r\n");
      out.write("								<a href=\"#\" class=\"cta-btn\">Shop now <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /shop -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /SECTION -->\r\n");
      out.write("\r\n");
      out.write("		<!-- SECTION -->\r\n");
      out.write("		<div class=\"section\">\r\n");
      out.write("			<!-- container -->\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<!-- row -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("					<!-- section title -->\r\n");
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"section-title\">\r\n");
      out.write("							<div class=\"section-nav\">\r\n");
      out.write("								<ul class=\"section-tab-nav tab-nav\">\r\n");
      out.write("									<li class=\"active\"><a data-toggle=\"tab\" href=\"#tab1\">Laptops</a></li>\r\n");
      out.write("									<li><a data-toggle=\"tab\" href=\"#tab1\">Smartphones</a></li>\r\n");
      out.write("									<li><a data-toggle=\"tab\" href=\"#tab1\">Cameras</a></li>\r\n");
      out.write("									<li><a data-toggle=\"tab\" href=\"#tab1\">Accessories</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /section title -->\r\n");
      out.write("\r\n");
      out.write("					<!-- Products tab & slick -->\r\n");
      out.write("					<div class=\"col-md-12\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"products-tabs\">\r\n");
      out.write("								<!-- tab -->\r\n");
      out.write("								<div id=\"tab1\" class=\"tab-pane active\">\r\n");
      out.write("									<div class=\"products-slick\" data-nav=\"#slick-nav-1\">\r\n");
      out.write("										<!-- product -->\r\n");
      out.write("										");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("										<!-- /product -->\r\n");
      out.write("\r\n");
      out.write("										\r\n");
      out.write("									</div>\r\n");
      out.write("									<div id=\"slick-nav-1\" class=\"products-slick-nav\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- /tab -->\r\n");
      out.write("							</div>\r\n");
      out.write("							\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>					</div>					<!-- Products tab & slick -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</div>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div id=\"slick-nav-2\" class=\"products-slick-nav\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- /tab -->\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /Products tab & slick -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /row -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /container -->\r\n");
      out.write("		</div>\r\n");
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
      out.write("			<!-- bottom footer -->\r\n");
      out.write("			\r\n");
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
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /home.jsp(213,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("em");
      // /home.jsp(213,10) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/home.jsp(213,10) '${produit}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${produit}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("										<div class=\"product\" style=\"width: 100px;\" >\r\n");
            out.write("											<div class=\"product-img\" >\r\n");
            out.write("												<img src=\"image/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.photoP}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" alt=\"\" >\r\n");
            out.write("											</div>\r\n");
            out.write("											<div class=\"product-body\">\r\n");
            out.write("												<p class=\"product-category\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.famPro}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("												<h3 class=\"product-name\"><a href=\"#\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.nomPro}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></h3>\r\n");
            out.write("												<h4 class=\"product-price\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.puProd}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</h4>\r\n");
            out.write("												<div class=\"product-btns\">\r\n");
            out.write("													<button class=\"quick-view\"><i class=\"fa fa-eye\"></i><span class=\"tooltipp\">quick view</span></button>\r\n");
            out.write("												</div>\r\n");
            out.write("											</div>\r\n");
            out.write("											<!-- <div class=\"add-to-cart\">\r\n");
            out.write("												<button class=\"add-to-cart-btn\"><i class=\"fa fa-shopping-cart\"></i> add to cart</button>\r\n");
            out.write("											</div> -->\r\n");
            out.write("										</div>\r\n");
            out.write("										");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
