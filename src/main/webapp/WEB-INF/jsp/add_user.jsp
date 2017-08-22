<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>Add User</title>
</head>
    <body>
        <div class="container">
            <div class="col-md-6 col-md-offset-3">
                <form action="/add_user" method="post">
                    <table>
                        <tr>
                            <td>
                                Nama
                            </td>
                            <td>
                                <input type="text" name="name">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Email
                            </td>
                            <td>
                                <input type="text" name="email">
                            </td>
                        </tr>
                    </table>
                    <input type="submit" value="Add">
                </form>
            </div>
        </div>
    </body>
</html>