<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>$Title$</title>
</head>
    <body>
    <div class="container">
        <div class="col-md-6 col-md-offset-3">
            <table border="1" width="90%">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Edit</th>
                    <th>Delet</th>
                    <th>Add</th>
                </tr>
                <c:forEach items="${userList}" var="user">
                    <tr>
                        <td>${user.getId()}</td>
                        <td>${user.getName()}</td>
                        <td>${user.getEmail()}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    </body>
</html>