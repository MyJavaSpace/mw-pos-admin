<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloMvc</title>
</head>
<body>
hello mvc ${res} 
${pageContext.servletContext.contextPath }
 
 <form action="addr/selectbyprimarykey.shtml" method="get" style="border:1px solid red;">
     <table>
           <tr><td colspan="2">这个表单演示了对象数据绑定的方法，以及对象中的Set，List，Array数据绑定（三者类似）</td></tr>
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="fsCityId" value="1"></td>
            </tr>
            <tr>
                <td>用户地址：</td>
                <td><input type="text" name="fsDistrictId" value="1"><br></td>
            </tr>
             <tr>
                <td>用户地址：</td>
                <td><input type="text" name="fsProvinceId" value="1"><br></td>
            </tr>
              <tr>
                  <td colspan="2" style="text-align: right;">
                  <input type="submit" value="提交">
                  </td>
               </tr>
       </table>
</form>
</body>
</html>