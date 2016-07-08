<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新世界大门</title>

<script type="text/javascript">
	function register()
	{
		var form = document.forms[0];
		form.action = "register";
		form.submit();
	}
</script>
</head>
<body>
	<div align=center> ${requestScope.tip }</div>
	<center>
		<form name="login-form" action="login" method="post">
			用户名：<input type="text" name="username"><br>
			密     码：<input type="password" name="password"><br>
			<input type="submit" value="登录"> &nbsp; &nbsp;
		    <input type="button" value="注册" 
		    	onclick="register()">
		</form>
	</center>
</body>
</html>