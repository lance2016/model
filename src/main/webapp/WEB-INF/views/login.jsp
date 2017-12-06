<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/statics/css/bootstrap.css">
    <title>Insert title here</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-3.2.1.min.js"></script>

    <script>
//        $(document).ready(function () {
//            alert("nothing");
//        })
    </script>
</head>
<body onload='document.f.username.focus();'>
<div class="container">
    <h3 class="col-md-6 col-md-offset-3">Login with Username and Password</h3>
    <form name='f' action='${pageContext.request.contextPath }/login'
          method='POST' class="col-md-6 col-md-offset-3">
        <table>
            <tr>
                <td>Userssss:</td>
                <td><input type='text' name='username' value=''></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit"
                                       value="Login" /></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>