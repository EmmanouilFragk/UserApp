<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>User Home page</title>
</head>

<body>
<#include "partials/UserNavbar.ftl">
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <#include "content/UserInfo.ftl">
        </div>
    </div>
</div>
<#include "partials/scripts.ftl">
</body>
</html>