<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="../temp/nav.jsp"></c:import>
<!-- search -->
<form action="./productList" method="get">
	<div class="input-group mb-3">
		<input type="hidden" name="${category}" value="${para}" >
		<input type="text" class="form-control" placeholder="Recipient's username" name="search">
		<button class="btn btn-outline-secondary" type="submit" id="button-addon2">Search</button>
	</div>
</form>

<table>
	<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.num}</td>
			<td><a href="./productView?num=${dto.num}">${dto.name}</a></td>
			<td>${dto.price}</td>
			<td>${dto.explain}</td>	
		
		</tr>
	</c:forEach>
</table>
<nav>
 	<ul class="pagination">
	    <li class="page-item">
	    	<a class="page-link first pager" href="./productList?${category}=${para}&pn=1&search=${pager.search}">
	    		<span aria-hidden="true">&laquo;</span>
	    	</a>
	    </li>
	    <li class="page-item">
	    	<a class="page-link prev pager" href="./productList?${category}=${para}&pn=${pager.startNum-1}&search=${pager.search}">
	    		<span aria-hidden="true">&lt;</span>
	    	</a>
	    </li>
	    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
			<li class="page-item">
				<a class="page-link pager" href="./productList?${category}=${para}&pn=${n}&search=${pager.search}">${n}</a>
			</li>
		</c:forEach>
	    <li class="page-item">
		    <a class="page-link pager" href="./productList?${category}=${para}&pn=${pager.lastNum+1}&search=${pager.search}">
		    	<span aria-hidden="true">&gt;</span>
		    </a>
	    </li>
	    <li class="page-item">
		    <a class="page-link pager last" href="./productList?${category}=${para}&pn=${pager.totalPage}&search=${pager.search}">
		    	<span aria-hidden="true">&raquo;</span>
		    </a>
	    </li>
	</ul>
</nav>
<button id="btn" type="button">click</button>
<script type="text/javascript">

	
	
	
</script>
</body>
</html>