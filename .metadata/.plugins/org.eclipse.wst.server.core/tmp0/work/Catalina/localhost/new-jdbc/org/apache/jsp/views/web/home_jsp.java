/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2023-12-15 11:15:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/Project/Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1702469283491L));
    _jspx_dependants.put("jar:file:/D:/Project/Java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/new-jdbc/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1701696531123L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1702467550846L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("<!-- chá»©a cÃ¡c library support cho jsp -->\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Trang chủ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container px-4 px-lg-5 mt-5\">\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center\">\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Fancy Product</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t$40.00 - $80.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View options</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t$18.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Sale Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$50.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t$25.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Popular Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t$40.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Sale Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$50.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t$25.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Fancy Product</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t$120.00 - $280.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">View options</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Sale badge-->\r\n");
      out.write("\t\t\t\t\t<div class=\"badge bg-dark text-white position-absolute\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"top: 0.5rem; right: 0.5rem\">Sale</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Special Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text-muted text-decoration-line-through\">$20.00</span>\r\n");
      out.write("\t\t\t\t\t\t\t$18.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100\">\r\n");
      out.write("\t\t\t\t\t<!-- Product image-->\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/450x300/dee2e6/6c757d.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<!-- Product details-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product name-->\r\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"fw-bolder\">Popular Item</h5>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product reviews-->\r\n");
      out.write("\t\t\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-flex justify-content-center small text-warning mb-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bi-star-fill\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product price-->\r\n");
      out.write("\t\t\t\t\t\t\t$40.00\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- Product actions-->\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-outline-dark mt-auto\" href=\"#\">Add to cart</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
}
