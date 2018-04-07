<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 + Ibatis</title>
<script type="text/javascript">
	function reg(){
		location.href='http://localhost:8080/Struts2IBA/getmaxno.action';
	}
</script>
</head>
<body>
<center>
	<h3>社員情報登録</h3>
	<s:form action="search">
    	<s:textfield name="name" />
    	<s:submit value="検索" />
    </s:form>
    <input type="button" value="社員情報登録" onclick="reg()">
<table border="1" bordercolor="orange" cellpadding="0" cellspacing="0" width="750">
		<tr>
			<td>詳細</td>
			<td>社員ID</td>
			<td>名前</td>
			<td>性別</td>
			<td>部署</td>
			<td>職員</td>
			<td>賞与</td>
			<td>給与</td>
			<td>住所</td>
			<td>情報修正</td>
		</tr>

		<s:iterator value="list">
			<tr>
				<td><a href="http://localhost:8080/Struts2IBA/detail.action?empid=${ empid }"></a>
				<td><s:property value="empid"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="sex"/></td>
				<td><s:property value="age"/></td>
				<td><s:property value="dept"/></td>
				<td><s:property value="job"/></td>
				<td><s:property value="zk"/></td>
				<td><s:property value="address"/></td>
				<td align="center">
					<a href="http://localhost:8080/Struts2IBA/updatelist.action?empid=${ empid }">修正</a>
					<a href="http://localhost:8080/Struts2IBA/delete.action?empid=${ empid }">削除</a>
				</td>
			</tr>
		</s:iterator>
</table>
</center>
</body>
</html>