<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

	<ul>
		<li><a href="${pageContext.request.contextPath}/product/productList">list</a></li>
		<li><a href="${pageContext.request.contextPath}/product/productList?c1=fresh">Fresh</a>
			<ul>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=meat">Meat</a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=fork">Fork</a></li>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=beef">Beef</a></li>
						<li><a href="${pageContext.request.contextPath}/product/productList?c3=chicken">Chicken</a></li>
					</ul>
				</li>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=aquatic">Aquatic</a></li>
				<li><a href="${pageContext.request.contextPath}/product/productList?c2=vegetable">Vegetable</a></li>
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