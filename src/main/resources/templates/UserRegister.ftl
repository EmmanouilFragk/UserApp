<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>User Register</title>
</head>

<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" action="/register" method="POST" name="userRegisterForm" id="userRegisterForm">
                <h1 class="page-header">Register</h1>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="form-group">
                        <@spring.bind "userRegisterForm.userFirstName"/>
                        <label for="productCode">First Name</label>
                        <input type="text" class="form-control" name="userFirstName" id="userFirstName" placeholder="Enter First Name" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userRegisterForm.userLastName"/>
                        <label for="productName">Last Name</label>
                        <input type="text" class="form-control" name="userLastName" id="userLastName"  placeholder="Enter Last Name" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userRegisterForm.email"/>
                        <label for="productCode">Email</label>
                        <input type="text" class="form-control" name="email" id="email" placeholder="Enter email" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userRegisterForm.phoneNumber"/>
                        <label for="productName">Phone Number</label>
                        <input type="text" class="form-control" name="phoneNumber" id="phoneNumber"  placeholder="Entet Phone Number"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userRegisterForm.companyName"/>
                        <label for="productCode">Company</label>
                        <input type="text" class="form-control" name="companyName" id="companyName" placeholder="Enter Company Name"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userRegisterForm.password"/>
                        <label for="productName">Password</label>
                        <input type="password" class="form-control" name="password" id="password"  placeholder="Enter Password" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-success">Create</button>
                        <button type="reset" id="btn-clear" class="btn btn-danger">Reset</button>
                    </div>
                </div>


            </form>
        </div>
    </div>
</div>
<#include "partials/scripts.ftl">
</body>
</html>