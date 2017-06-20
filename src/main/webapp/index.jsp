<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
</head>
<!-- 引入OL3样式 -->
<link type="text/css" rel="stylesheet" href="js/ol.css"/>
<!-- 引入OL3的JS -->
<script type="text/javascript" charset="UTF-8" src="js/ol-debug.js"></script>
<body>
<h2>SSM_BookSystem --- V1</h2>
目前包含简单的查询、分页、redis缓存
<br />
更新：2017年5月18日 17:51:22
<br />
作者：GuoJie
<br /><br /><br />
图书系统：<a href="<%=appPath%>/book/list">SSM_BookSystem V1(点击进入)</a>
<div id="map" style="width: 100% ;height: 400px;"></div>
	<script type="text/javascript">
		new ol.Map({
			layers:[
				new ol.layer.Tile({
					source:new ol.source.OSM()
				})
			],
			view: new ol.View({
				center:[115,40],
				zoom:5
			}),
			target:'map'
		});
	</script>
</body>
</html>
