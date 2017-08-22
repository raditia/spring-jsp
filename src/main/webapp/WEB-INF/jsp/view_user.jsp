<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>View User</title>
</head>
    <body>
    <div class="container">
        <div class="col-md-8 col-md-offset-2">
            <table border="1" width="90%">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Edit</th>
                    <th>Delete</th>
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