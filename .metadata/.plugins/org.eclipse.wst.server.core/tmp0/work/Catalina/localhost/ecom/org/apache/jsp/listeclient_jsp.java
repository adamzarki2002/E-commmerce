/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.26
 * Generated at: 2022-12-26 20:38:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class listeclient_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>Electro | Home</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/fontawesome-free/css1/all.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Tempusdominus Bbootstrap 4 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/icheck-bootstrap/icheck-bootstrap.min.css\">\r\n");
      out.write("  <!-- JQVMap -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/jqvmap/jqvmap.min.css\">\r\n");
      out.write("    <!-- pace-progress -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/pace-progress/themes/black/pace-theme-flat-top.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\r\n");
      out.write("  <!-- overlayScrollbars -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/overlayScrollbars/css/OverlayScrollbars.min.css\">\r\n");
      out.write("  <!-- Daterange picker -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("  <!-- summernote -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/summernote/summernote-bs4.css\">\r\n");
      out.write("  <!-- Google Font: Source Sans Pro -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css1?family=Source+Sans+Pro:300,400,400i,700\" rel=\"stylesheet\">\r\n");
      out.write("   \r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini pace-primary\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar -->\r\n");
      out.write("  <nav class=\"main-header navbar navbar-expand navbar-dark navbar-gray-dark\" style=\"background-color: #ff0018;\">\r\n");
      out.write("    <!-- Left navbar links -->\r\n");
      out.write("    <ul class=\"navbar-nav\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" data-widget=\"pushmenu\" href=\"#\"><i class=\"fas fa-bars\"></i></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"HomeAdmin\" class=\"nav-link\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- SEARCH FORM -->\r\n");
      out.write("     <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <!-- Messages Dropdown Menu -->\r\n");
      out.write(" \r\n");
      out.write("      <li class=\"nav-item d-none d-sm-inline-block\">\r\n");
      out.write("        <a href=\"logout\" class=\"nav-link\">Log out</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      </ul>\r\n");
      out.write("\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Main Sidebar Container -->\r\n");
      out.write("  <aside class=\"main-sidebar sidebar-dark-danger elevation-4\" style=\"background-color: #ff0018;\">\r\n");
      out.write("    <!-- Brand Logo -->\r\n");
      out.write("    <a href=\"HomeAdmin\" class=\"brand-link\">\r\n");
      out.write("      <img src=\"dist/img/logoSite.png\" alt=\"AdminLTE Logo\" class=\"brand-image img-circle elevation-3\"\r\n");
      out.write("           style=\"opacity: .8\">\r\n");
      out.write("      <span class=\"brand-text font-weight-light\">Electro</span>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Sidebar -->\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("      <!-- Sidebar user panel (optional) -->\r\n");
      out.write("      <div class=\"user-panel mt-3 pb-3 mb-3 d-flex\">\r\n");
      out.write("        <div class=\"image\">\r\n");
      out.write("          <img src=\"data:image/jpeg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Admin.getPhotoAdmin() }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" onerror=\"if (this.src != 'dist/img/person.jpg') this.src = 'dist/img/person.jpg';\" class=\"img-circle elevation-2\" alt=\"User Image\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("         ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <!-- Sidebar Menu -->\r\n");
      out.write("      <nav class=\"mt-2\">\r\n");
      out.write("        <ul class=\"nav nav-pills nav-sidebar flex-column\" data-widget=\"treeview\" role=\"menu\" data-accordion=\"false\">\r\n");
      out.write("          <!-- Add icons to the links using the .nav-icon class\r\n");
      out.write("               with font-awesome or any other icon font library -->\r\n");
      out.write("          <li class=\"nav-item has-treeview menu-open\">\r\n");
      out.write("            <a href=\"homeadmin.jsp\" class=\"nav-link active\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-home\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Home\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li class=\"nav-item has-treeview\">\r\n");
      out.write("            <a href=\"listeclient\" class=\"nav-link\">\r\n");
      out.write("              <i class=\"nav-icon fas fa-user-alt\"></i>\r\n");
      out.write("              <p>\r\n");
      out.write("                Clients\r\n");
      out.write("                <i class=\"right fas fa-angle-left\"></i>\r\n");
      out.write("              </p>\r\n");
      out.write("            </a>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"listefamille\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Ajouter un Produit</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"listeP\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>Liste des Produit</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"commande\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>les commandes</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"ajouterfamille.jsp\" class=\"nav-link\">\r\n");
      out.write("                  <i class=\"far fa-circle nav-icon\"></i>\r\n");
      out.write("                  <p>ajouter une Famille</p>\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("          </li>\r\n");
      out.write("                </nav>\r\n");
      out.write("      <!-- /.sidebar-menu -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.sidebar -->\r\n");
      out.write("  </aside>\r\n");
      out.write("\r\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  <div class=\"content-wrapper\">\r\n");
      out.write("    <!-- Content Header (Page header) -->\r\n");
      out.write("    <div class=\"content-header\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row mb-2\">\r\n");
      out.write("          <div class=\"col-sm-6\">\r\n");
      out.write("            <h1 class=\"m-0 text-dark\">Home</h1>\r\n");
      out.write("          </div><!-- /.col -->\r\n");
      out.write("          \r\n");
      out.write("        </div><!-- /.row -->\r\n");
      out.write("      </div><!-- /.container-fluid -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.content-header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Main content -->\r\n");
      out.write("    <section class=\"content\">\r\n");
      out.write("        <!-- Main row -->\r\n");
      out.write("        <div class=\"card my-4\">\r\n");
      out.write("            <div class=\"card-header p-0 position-relative mt-n4 mx-3 z-index-2\">\r\n");
      out.write("              <div class=\"bg-gradient-primary shadow-primary border-radius-lg pt-4 pb-3\">\r\n");
      out.write("                <h6 class=\"text-white text-capitalize ps-3\">Authors table</h6>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card-body px-0 pb-2\">\r\n");
      out.write("              <div class=\"table-responsive p-0\">\r\n");
      out.write("              \r\n");
      out.write("                <table class=\"table align-items-center mb-0\">\r\n");
      out.write("                  <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                      <th class=\"text-uppercase text-secondary text-xxs font-weight-bolder opacity-7\">Client</th>\r\n");
      out.write("                      <th class=\"text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2\">Email</th>\r\n");
      out.write("                      <th class=\"text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7\">Adresse</th>\r\n");
      out.write("                      <th class=\"text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7\">numero de telephone</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                  </thead>\r\n");
      out.write("                  <tbody>\r\n");
      out.write("                  \r\n");
      out.write("                  ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                     </section>\r\n");
      out.write("          <!-- /.Left col -->\r\n");
      out.write("          <!-- right col (We are only adding the ID to make the widgets sortable)-->\r\n");
      out.write("         \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <!-- Control Sidebar -->\r\n");
      out.write("  <aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("    <!-- Control sidebar content goes here -->\r\n");
      out.write("  </aside>\r\n");
      out.write("  <!-- /.control-sidebar -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ./wrapper -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<!-- jQuery UI 1.11.4 -->\r\n");
      out.write("<script src=\"plugins/jquery-ui/jquery-ui.min.js\"></script>\r\n");
      out.write("<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\r\n");
      out.write("<script>\r\n");
      out.write("  $.widget.bridge('uibutton', $.ui.button)\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Bootstrap 4 -->\r\n");
      out.write("<script src=\"plugins/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<!-- ChartJS -->\r\n");
      out.write("<script src=\"plugins/chart.js/Chart.min.js\"></script>\r\n");
      out.write("<!-- Sparkline -->\r\n");
      out.write("<script src=\"plugins/sparklines/sparkline.js\"></script>\r\n");
      out.write("<!-- JQVMap -->\r\n");
      out.write("<script src=\"plugins/jqvmap/jquery.vmap.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/jqvmap/maps/jquery.vmap.usa.js\"></script>\r\n");
      out.write("<!-- jQuery Knob Chart -->\r\n");
      out.write("<script src=\"plugins/jquery-knob/jquery.knob.min.js\"></script>\r\n");
      out.write("<!-- daterangepicker -->\r\n");
      out.write("<script src=\"plugins/moment/moment.min.js\"></script>\r\n");
      out.write("<script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("<!-- Tempusdominus Bootstrap 4 -->\r\n");
      out.write("<script src=\"plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js\"></script>\r\n");
      out.write("<!-- Summernote -->\r\n");
      out.write("<script src=\"plugins/summernote/summernote-bs4.min.js\"></script>\r\n");
      out.write("<!-- overlayScrollbars -->\r\n");
      out.write("<script src=\"plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js\"></script>\r\n");
      out.write("<!-- AdminLTE App -->\r\n");
      out.write("<script src=\"dist/js/adminlte.js\"></script>\r\n");
      out.write("<!-- AdminLTE dashboard demo (This is only for demo purposes) -->\r\n");
      out.write("<script src=\"dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("<!-- AdminLTE for demo purposes -->\r\n");
      out.write("<script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("  <!-- pace-progress -->\r\n");
      out.write("<script src=\"plugins/pace-progress/pace.min.js\"></script>\r\n");
      out.write("<!-- SweetAlert2 -->\r\n");
      out.write("<script src=\"plugins/sweetalert2/sweetalert2.min.js\"></script>\r\n");
      out.write("<!-- Toastr -->\r\n");
      out.write("<script src=\"plugins/toastr/toastr.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /listeclient.jsp(86,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty sessionScope.prenomcli && !empty sessionScope.nomcli }", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.prenomcli }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ sessionScope.nomcli }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" </p>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
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
      // /listeclient.jsp(186,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("em");
      // /listeclient.jsp(186,18) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/listeclient.jsp(186,18) '${client}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${client}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                      <tr>\r\n");
            out.write("                      \r\n");
            out.write("                      <td>\r\n");
            out.write("                        <p class=\"text-xs font-weight-bold mb-0\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.nomCli}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(' ');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.prenomCli}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                        <p class=\"text-xs text-secondary mb-0\"></p>\r\n");
            out.write("                      </td>\r\n");
            out.write("                      <td class=\"align-middle text-center text-sm\">\r\n");
            out.write("                      <p class=\"text-xs font-weight-bold mb-0\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.email}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                      </td>\r\n");
            out.write("                      <td class=\"align-middle text-center\">\r\n");
            out.write("                        <p class=\"text-xs font-weight-bold mb-0\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.adrCli}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p>\r\n");
            out.write("                      </td>\r\n");
            out.write("                      <td class=\"align-middle text-center\">\r\n");
            out.write("                        <p class=\"text-xs font-weight-bold mb-0\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${em.numtel}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p> \r\n");
            out.write("                      </td>\r\n");
            out.write("                     \r\n");
            out.write("                    </tr>\r\n");
            out.write("                \r\n");
            out.write("                      ");
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
