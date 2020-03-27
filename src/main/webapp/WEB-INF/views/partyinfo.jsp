<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  

<head>
<title>Party Information</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="gp/css/gpstyleparty.css">
<link rel="stylesheet" type="text/css" href="gp/css/loginstyle.css" />
<link rel="stylesheet" type="text/css" href="gp/css/party_info.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
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
<script>
	function party_apply() {
		var id = papply.id.value;
		var ac = parseInt(papply.ac.value);
		var pno = parseInt(papply.pno.value);
		//var aa = papply.aa.value;
		var pid = papply.pid.value;
		
		
		if (id == "id") {
			alert("로그인이 필요합니다.");
			location.href = "loginpage.jsp";
		}
		else if(id==pid){
			alert("주최자는 파티를 신청할 수 없습니다.");
		}
		/*else if(aa=="false"){
			
			alert("파티신청기간이 아닙니다.");
		}*/
		else if(ac==pno){
			
			alert("파티 정원이 모두 찼습니다.");			
		}
		else {
			window.open("applycheck.jsp?pnum="+papply.pnum.value+"&id=" + id + "&rname="+papply.rname.value + "&pdate="+papply.pdate.value + "&ptime="+papply.ptime.value + "&addno="+papply.addno.value + "&addr1="+papply.addr1.value + 
					"&addr2="+papply.addr2.value + "&addr="+papply.addr.value + "&ptalk="+papply.ptalk.value, "hjhj",
			"width=650,height=520");  // 새창을 띄워주는 코드 사이즈 지정과 함께
			
			
		}
	}
</script>
</head>
<body>
	<%@include file="header.jsp"%>

	<div style="width: 100%; height: 86px;"></div>
	<article></article>
	<form action="party_apply.jsp" name="papply">
	
	<input type="hidden" id="pnum" name="pnum" value="${painfo.pnum }">   
		<input type="hidden" id="id" name="id" value="<%=id%>"> 
		
		<input type="hidden" id="pno" name="pno" value="${painfo.pno }">
		<input type="hidden" id="ac" name="ac" value="${painfo.pa_apply }">
		<input type="hidden" id="pid" name="pid" value="${painfo.id }">
		<input	type="hidden" id="rname" name="rname"value="${painfo.rname }"> 
		<input type="hidden" id="pdate" name="pdate" value="${painfo.pdate }"> 
		<input	type="hidden" id="ptime" name="ptime" value="${painfo.ptime }"> 
		<input type="hidden" id="addno" name="addno" value="${painfo.addno }"> 
		<input type="hidden" id="addr1" name="addr1" value="${painfo.addr1 }"> 
		<input type="hidden" id="addr2" name="addr2" value="${painfo.addr2 }"> 
		<input type="hidden" id="addr" name="addr" value="${painfo.addr }">
		<input type="hidden" id="ptalk" name="ptalk" value="${painfo.ptalk }">

		<section style="background: #f6f6f6;"> <fmt:formatNumber value="${(painfo.pa_apply/painfo.pno)}" var="per" type="percent"/>
			<div
				style="width: 55%; height: 100%; background: white; padding-top: 1%; padding-left: 2%; padding-right: 2%; margin: 0 auto;">
				<!--  파티  신청 상자 -->
				<table name="table1"
					style="width: 100%; height: 450px; border: 1px solid #a6a6a6; border-radius: 20px; margin-bottom: 1%">
					<tbody>
						<tr>
							<td style="padding: 20px; width: 70%; height: 95%"
								valign="middle">
								<div
									style="margin-bottom: 20px; width: 100%; height: 70px; border-bottom: solid 1px #eaeaea; font-family: 궁서; font-size: 1cm;">${painfo.rname }</div>
								<table name="table2" style="width: 100%">
									<tbody>
										<tr>
											<!--  식당 사진 -->
											<td style="width: 55%;"><img
												src="gp/party/${painfo.rfile }"
												style="width: 330px; height: 280px; margin-right: 10px;"></td>
											<!--  파티 신청 상제 정보 -->
											<td style="width: 45%; padding-top: 5px;" valign="top">
												<div
													style="width: 98%; height: 30px; border-bottom: solid 1px #A6A6A6; margin-bottom: 5px; text-align: left; font-size: 0.5cm">
													<b>파티 정보</b>
												</div>

												<table name="table3" style="font-size: 0.4cm">
													<tbody>
														<tr style="height: 30px; width: 37%">
															<td style="width: 38%;"><b>모임일자 : </b></td>
															<td></td>
															<td>${painfo.pdate }&nbsp;&nbsp;${painfo.ptime }
															</td>
														</tr>

														<tr style="height: 10px;">
															<td colspan="3"></td>
														</tr>
														<tr style="height: 30px;">
															<td><b>접수기간 : </b></td>
															<td></td>

															<td>${painfo.sins}&nbsp;&nbsp;${painfo.sinf }</td>
														</tr>
														<tr style="height: 10px;">
															<td colspan="3"></td>
														</tr>
														<tr style="height: 30px;">
															<td><b>모임장소 :</b></td>
															<td></td>
															<td>${painfo.addr}<br>${painfo.addr1 }&nbsp;&nbsp;${painfo.addr2 }
															</td>
														</tr>
														<tr>
															<th
																style="height: 15px; border-bottom: dashed 0.5px #eaeaea;"
																colspan="3"></th>
														</tr>
														<tr>
															<th
																style="height: 5px; border-bottom: dashed 0.5px #eaeaea;"
																colspan="3"></th>
														</tr>
														<tr style="height: 30px;">
															<td><b>예상비용 : </b></td>
															<td></td>
															<td>1 인당 ${painfo.preprice }</td>
														</tr>

													</tbody>
												</table>
											</td>
										</tr>
									</tbody>
								</table>
							</td>
							<td
								style="width: 30%; border-left: solid 1px #EAEAEA; padding: 5%;">
								<div
									style="margin: 3%; width: 94%; height: 30%; border-bottom: solid 0.5px #eaeaea;">
									<!-- int per = 0;
										per = (Apply_count)*100/Integer.parseInt(sic.get(0).getPno());	 -->
																
									
									<table style="width: 100%;">
										<tbody>
											<tr>
												<td style="width: 70%;"><font
													style="font-size: 0.7cm; color: #23A41A; width: 100%; height: 20px; font-weight: 900; margin-bottom: 10px;">${painfo.pa_apply}&nbsp;명
														신청</font></td>
												<td><div
														style="border: solid 1px #23A41A; border-radius: 5px; width: 50px; height: 25px; font-size: 0.5cm; text-align: center; color: #23A41A;">${per}
 

													</div></td>
											</tr>
											<tr style="height: 5px;"></tr>
											<tr>
												<td colspan="2" width="100%">
												

												<div style="float:left; background: green; height: 10px; width:${per};"></div>
												<div style="float:left; background: #f6f6f6;height: 10px; width:${100-(painfo.pa_apply/painfo.pno)}%;"></div>
												</td>
											</tr>
											<tr style="height: 5px;"></tr>
											<tr>
												<td colspan="2" style="text-align: right;"><p
														style="font-size: 0.35cm;">
														모집인원
														${painfo.pno }명
													</p></td>
											</tr>
										</tbody>
									</table>


								</div>
								<div style="margin: 3%; width: 94%; height: 50%; padding: 5px;">
									<font
										style="font-size: 0.5cm; width: 100%; height: 20px; font-weight: 900;">주최자
										: ${painfo.nick }</font> <br>
									<p style="font-size: 0.35cm; margin-top: 15px; white-space:pre-line;">
										${painfo.ptalk }
									</p>
								</div>
								<div
									style="margin: 3%; width: 94%; height: 20%; border-top: dashed 0.5px #eaeaea; border-bottom: solid 0.5px #eaeaea; padding: 5px; color: red; font-size: 0.35cm;">
									※신청하시기 전에 <br>꼭 유의사항을 읽어주세요.
								</div>

							</td>
						</tr>
					</tbody>
				</table>

				<%@include file="partynotice.jsp"%>
				<div
					Style="width: 100%; height: 50px; text-align: center; margin-top: 2%;">
					<button type="button" onClick="party_apply()" class="btn btn-success"
						style="width: 70%;" >파티 신청</button><br> <font
						style="color: red;">신청하시기 전에 꼭 유의사항을 읽어주세요.</font>
				</div>
			</div>
		</section>
	</form>

	<%@include file="footer.jsp"%>

</body>

</html>