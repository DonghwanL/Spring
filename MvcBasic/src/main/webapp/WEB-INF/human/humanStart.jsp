<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>START</title>
<style>
.err {
	font-size: 12px;
	color: red;
	font-weight: 500;
}
</style>
</head>
<body>
	<h2>FORM</h2>
	
	<c:set var="appPath" value="<%=request.getContextPath()%>" />
	
	<form:form commandName="human" action="${appPath}/caller3.hm" method="post">
		<table border="1">
			<tr>
				<td width="25%" align="center">ID</td>
				<td width="75%" align="left">
					<form:input path="id"/>
					<form:errors path="id" cssClass="err"/>
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">이름</td>
				<td width="75%" align="left">
					<form:input path="name"/>
					<form:errors path="name" cssClass="err"/>
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">취미</td>
				<td width="75%" align="left">
					<form:radiobuttons path="hobby" items="${hobbies}" itemLabel="korea" itemValue="english" />
					<form:errors path="hobby" cssClass="err" />
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">특기</td>
				<td width="75%" align="left">
					<form:checkboxes path="special" items="${speciallist}"/>
					<form:errors path="special" cssClass="err"/>
				</td>
			</tr>
			
			<tr>
				<td width="25%" align="center">생일</td>
				<td width="75%" align="left">
					<form:input path="birth"/>
					<form:errors path="birth" cssClass="err"/>
				</td>
			</tr>
			
<%-- 			<tr>
				<td width="25%" align="center">직업 (JSTL)</td>
				<td width="75%" align="left">
					<select name="job">
						<c:forEach items="${joblists}" var="oneitem">
							<option value="${oneitem.code}">${oneitem.name}
						</c:forEach>
					</select>
					<form:errors path="job" cssClass="err" />
				</td>
			</tr> --%>
			
			<tr>
				<td width="25%" align="center">직업 (방법 1)</td>
				<td width="75%" align="left">
					<form:select path="job" items="${joblists}" itemLabel="name"  itemValue="code" />
					<form:errors path="job" cssClass="err" />
				</td>
			</tr>
			
			<%-- <tr>
				<td width="25%" align="center">직업 (방법 2)</td>
				<td width="75%" align="left">
					<form:select path="job">
						<form:options items="${joblists}" itemLabel="name" itemValue="code" />
					</form:select>
					<form:errors path="job" cssClass="err" />
				</td>
			</tr> --%>
			
			<tr>
				<td width="25%" align="center">가입일자</td>
				<td width="75%" align="left">
					<form:input path="regdate"/>
					<form:errors path="regdate" cssClass="err"/>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="가입하기">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>