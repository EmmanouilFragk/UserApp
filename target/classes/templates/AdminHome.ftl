<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">
    <title>Admin Home Page</title>
</head>

<body>

<#include "partials/AdminNavbar.ftl">

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">List of Users</h1>
            <#include "content/UsersList.ftl">
        </div>
    </div>
</div>

<#include "partials/scripts.ftl">

</body>
</html>