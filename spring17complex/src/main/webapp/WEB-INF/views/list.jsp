<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script>
	//목표 : .search-form 전송을 차단하고 신규 form을 만들어서 입력한 것만 전송
//	$(function(){
//		$(".search-form").submit(function (e) {
//			e.preventDefault(); //기본이벤트 차단
			
//			// (1) 신규 form을 만들어서 복사한 뒤 신규 form을 전송
//			var form=$("<form>").attr("method", "get");
			
			//<input type="hidden" name="no" value="1">
//			var no = $(this).find("input[name=no]").val();
//			if(no.length > 0){				
//				$("<input>").attr("type","hidden").attr("name", "no").val(no).appendTo(form);
//			}
			
//			var name = $(this).find("input[name=name]").val();
//			if(name.length>0){
//				$("<input>").attr("type","hidden").attr("name", "name").val(name).appendTo(form);				
//			}
			
//			$("body").append(form);
//		});
//	});
	
	$(function(){
		/* $(".search-form").submit(function (e) {
			e.preventDefault(); //기본이벤트 차단
			
			// (1) 신규 form을 만들어서 복사한 뒤 신규 form을 전송
			var form=$("<form>").attr("method", "get");
	
			$(this).find("[name]").each(function(){
				if($(this).attr("type")=="checkbox"){
					if($(this).prop("checked")){
						$("<input>").attr("type", "hidden").attr("name", $(this).attr
								("name")).val($(this).val()).appendTo(form);
					}
				}else{
					var value = $(this).val();
					if(value.length>0){
						$("<input>").attr("type", "hidden").attr("name", $(this).attr
								("name")).val($(this).val()).appendTo(form);
					}
				}
			});
			$("body").append(form);
		}); */
		$(".search-form").submit(function(e){
			$(this).find("[name]").each(function(){
				var value = $(this).val();
				if(value.length==0){
					$(this).removeAttr("name");
				}
			});
			/* return false; */
			return true; //전송
		});
	});
	// 체크박스나 select처럼 백엔드에서 값을 주기 어려운 요소들을 프론트에서 처리
	$(function () {
	})
	
</script>

<h1>복합 검색 예제</h1>

<!-- 검색창 -->
<form action="./" method="get" autocomplete="off" class="search-form">
	번호 : <input type="text" name="no" value="${param.no}"><br><br>
	이름 : <input type="text" name="name" value="${param.name}"><br><br>
	분류 : 
		<label><input type="checkbox" name="type" value="과자">과자</label>
		<label><input type="checkbox" name="type" value="사탕">사탕</label>
		<label><input type="checkbox" name="type" value="주류">주류</label>
		<label><input type="checkbox" name="type" value="아이스크림">아이스크림</label>
		<br><br>
	가격 : <input type="text" name="minPrice" value="${param.minPrice}"> ~ <input type="text" name="maxPrice" value="${param.maxPrice}">
	<br><br>
	제조일 : <input type="text" name="beginMade" value="${param.beginMade}"> ~ <input type="text" name="endMade" value="${param.endMade}">
	<br><br>
	<button type="submit">검색</button>
	<br><br>
	<!-- 정렬 -->
	1차 정렬 : 
	<select name="sort">
		<option value="">선택하세요</option>
		<option value="price desc">가격 비싼 순</option>
		<option value="price asc">가격 저렴한 순</option>
		<option value="no asc">번호 순</option>
		<option value="made desc">최근 제조 순</option>
	</select>
	<br><br>
	2차 정렬 : 
	<select name="sort">
		<option value="">선택하세요</option>
		<option value="price desc">가격 비싼 순</option>
		<option value="price asc">가격 저렴한 순</option>
		<option value="no asc">번호 순</option>
		<option value="made desc">최근 제조 순</option>
	</select>
	<br><br>
	
</form>
<!-- 결과화면 -->
<table width="600" align="center" border="1px sold gray">
	<thead>
		<tr>
			<th>no</th>
			<th>name</th>
			<th>type</th>
			<th>price</th>
			<th>made</th>
			<th>expire</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.no }</td>
			<td>${dto.name }</td>
			<td>${dto.type }</td>
			<td>${dto.price }</td>
			<td>${dto.made }</td>
			<td>${dto.expire }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>







