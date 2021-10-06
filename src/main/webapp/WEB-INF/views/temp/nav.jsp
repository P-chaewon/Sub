<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<ul>
		<li><a href="${pageContext.request.contextPath}/product/productList">list</a></li>
		<li><a href="${pageContext.request.contextPath}/product/productList?c1=fresh&pn=1">Fresh</a>
			<ul>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=meat&pn=1">Meat</a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=fork&pn=1">Fork</a></li>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=beef&pn=1">Beef</a></li>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=chicken&pn=1">Chicken</a></li>
					</ul>
				</li>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=aquatic&pn=1">Aquatic</a></li>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=vegetable&pn=1">Vegetable</a></li>
			</ul>
		</li>
		<li><a href="${pageContext.request.contextPath}/product/productList?c1=instant">Instant</a>
			<ul>
				<li><a href="">Meat</a></li>
				<li><a href="">Aquatic</a></li>
				<li><a href="">Vegetable</a></li>
			</ul>
		</li>
		<li><a href="#">Snack</a>
			<ul>
				<li><a href="">Meat</a></li>
				<li><a href="">Aquatic</a></li>
				<li><a href="">Vegetable</a></li>
			</ul>
		</li>
		<li><a href="#">Drink</a>
			<ul>
				<li><a href="">Meat</a></li>
				<li><a href="">Aquatic</a></li>
				<li><a href="">Vegetable</a></li>
			</ul>
		</li>
	</ul>