<!DOCTYPE html>
<html lang="en">

<head>
    <#include "partials/head.ftl">
    <title>Welcome!</title>
</head>
<body>
   <h1>Login</h1>
   <form name='login' action="/login" method='POST'>
          <table>
                 <tr>
                        <td>Insert Email:</td>
                        <td><input type='email' name='email' value=''></td>
                     </tr>
                 <tr>
                        <td>Insert Password:</td>
                        <td><input type='password' name='password' /></td>
                     </tr>
                 <tr>
                        <td><input name="submit" type="submit" value="submit" /></td>
                     </tr>
              </table>
      </form>
</body>
</html>