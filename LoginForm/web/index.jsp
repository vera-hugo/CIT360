<%-- 
    Document   : index
    Created on : Feb 11, 2019, 10:14:06 AM
    Author     : David Vera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <style>
        td{
            padding: 10px;
        }
        div{
            width: 50%;
            border: 1px solid black;
            border-radius: 5px;
            background-color: lightslategray;
            
        }
    </style>
    <body>
        <center><h1><u>Login Here</u></h1></center>
        <center>
            <div>
                <form action="login" method="POST">
                    <table>
                        <tr>
                            <td>User Name</td>
                            <td><input type="text" class="form-control" name="username" placeholder="User Name"></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="text" class="form-control" name="password" placeholder="Password"></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: center"><input class="btn btn-success" type="submit" value="submit"></td>
                        </tr>
                    </table>
                </form>    
            </div>          
        </center>
    </body>
</html>
