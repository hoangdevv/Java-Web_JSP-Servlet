<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><dec:title default="Trang chủ" /></title>

<!-- CSS -->
<link href="<c:url value='/template/web/bootstrap/css/styles.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp"%>
	<header class="bg-dark py-5">
	<div class="container px-4 px-lg-5 my-5">
		<div class="text-center text-white">
			<h1 class="display-4 fw-bolder">Shop in style</h1>
			<p class="lead fw-normal text-white-50 mb-0">With this shop
				homepage template</p>
		</div>
	</div>
	</header>
	<!-- container -->
	<section class="py-5"> <dec:body /> </section>

	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- Jquery -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript"
		src=",c:url value='/template/web/bootstrap/js/scripts.js'/>"></script>
</body>
</html>