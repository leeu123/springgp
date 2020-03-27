<!-- 진행중인 파티 화면 -->
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!-- 자바 코드 :URLEncoder 클래스는 일반 문자열을 웹에서 통용되는 'x-www-form-urlencoded' 형식으로 변환하는 역할을 담당
대소문자, 숫자, 밑줄을 제외한 URL에 있는 문자를 코드화하는 것 -->
<%
	String s = URLEncoder.encode("중식", "UTF-8");
	String k = URLEncoder.encode("한식", "UTF-8");
	String j = URLEncoder.encode("일식", "UTF-8");
	String l = URLEncoder.encode("양식", "UTF-8");
	String m = URLEncoder.encode("세계음식", "UTF-8");
	String n = URLEncoder.encode("뷔페", "UTF-8");
%>
<head>
<title>Party</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="gp/css/gpstyleparty.css">
<link rel="stylesheet" type="text/css" href="gp/css/loginstyle.css" />
<link rel="stylesheet" type="text/css" href="gp/css/party.css" />

<link rel='stylesheet' type='text/css'
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic'>

<link rel="stylesheet" type="text/css" href="gp/css/Icomoon/style.css" />
<link rel="stylesheet" type="text/css" href="gp/css/animated-header.css" />
<script type="text/javascript" src="gp/_scripts/jquery-2.0.2.min.js"></script>
<script type="text/javascript" src="gp/_scripts/jquery-ui-1.10.4.min.js"></script>
<script type="text/javascript" src="gp/_scripts/jquery.isotope.min.js"></script>
<script type="text/javascript" src="gp/_scripts/animated-header.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="gp/_scripts/login.js"></script>
<script type="text/javascript" src="gp/scripts/party.js"></script>

</head>
<body>

	<%@include file="header.jsp"%>

	<section>
		<div style="width: 100%; height: 86px;"></div>
		<article></article>
		<div id="ptitle">
			<img src="gp/img/ptitle.png" width="100%" height="100%">
		</div>
		<div id="pic">
			<div id="section" style="border: none;">

				<div class="picbox">
					<a href="partycate?cate=<%=k%>"><div class="partypic"
							name="kor">
							<div id="korea" align="center"></div>
						</div>
						<div class="pictitle">한 &nbsp;&nbsp;&nbsp; 식</div> </a>
				</div>

				<div class="picbox">
					<a href="partycate?cate=<%=s%>"><div class="partypic"
							name="chn">
							<div id="china" align="center"></div>
						</div>
						<div class="pictitle">중 &nbsp;&nbsp;&nbsp; 식</div> </a>
				</div>

				<div class="picbox">
					<a href="partycate?cate=<%=j%>"><div class="partypic"
							name="jpn">
							<div id="japan" align="center"></div>
						</div>
						<div class="pictitle">일 &nbsp;&nbsp;&nbsp; 식</div> </a>
				</div>

				<div class="picbox">
					<a href="partycate?cate=<%=l%>"><div class="partypic" name="wes">
							<div id="western" align="center"></div>
						</div>
						<div class="pictitle">양 &nbsp;&nbsp;&nbsp; 식</div> </a>
				</div>

				<div class="picbox">
					<a href="partycate?cate=<%=m%>"><div class="partypic"
							name="wor">
							<div id="world" align="center"></div>
						</div>
						<div class="pictitle">세 계 &nbsp;&nbsp; 음 식</div> </a>
				</div>

				<div class="picbox">
					<a href="partycate?cate=<%=n%>"><div class="partypic"
							name="what">
							<div id="whatever" align="center"></div>
						</div>
						<div class="pictitle">뷔 &nbsp;&nbsp;&nbsp; 페</div> </a>
				</div>

			</div>
		</div>

	</section>

	<%@include file="footer.jsp"%>

</body>

</html>
