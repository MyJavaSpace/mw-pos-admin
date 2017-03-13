<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">

<head>
<title>Spring Thyme Seed Starter Manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<!--  <link rel="stylesheet" type="text/css" media="all" href="../../css/stsm.css" th:href="@{/css/stsm.css}"/> -->
<title>请求方法列表</title>
</head>

<body>
	<div style="margin: 0; padding: 0; text-align: center">
		<h1>请求方法列表</h1>
	</div>
	<div>
		<ul>
			<li th:each="method:${MethodList}">
				<h3 th:text="${method.methodName}"></h3>

				<p th:text="'所属控制器：'+${method.controllerName}"></p>

				<p th:text="'请求URL：'+${method.requestUrl}"></p>

				<p th:text="'请求方式：'+${method.requestType}"></p>

				<div>
					<p>方法参数列表：</p>
					<ul>
						<li th:each="param:${method.methodParmaTypes}">
							<p th:text="${param}"></p>
						</li>
					</ul>
				</div>

			</li>
		</ul>
	</div>


</body>
</html>