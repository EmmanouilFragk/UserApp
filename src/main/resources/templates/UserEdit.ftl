<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftl">

    <title>Edit Owner</title>
</head>

<body>
<#include "partials/UserNavbar.ftl">
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <form class="form-horizontal" action="/user/edit" method="POST" name="userForm" id="userForm">
                <h1 class="page-header">Edit Personal Information</h1>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">

                    <div class="form-group">
                        <@spring.bind "userForm.userFirstName"/>
                        <label for="productName">Firstname</label>
                        <input type="text" class="form-control" name="userFirstName" id="userFirstName" value="${userForm.userFirstName}" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userForm.userLastName"/>
                        <label for="productCode">Surname</label>
                        <input type="text" class="form-control" name="userLastName" id="userLastName" value="${userForm.userLastName}" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userForm.email"/>
                        <label for="productName">Email</label>
                        <input type="text" class="form-control" name="email" id="email" value="${userForm.email}" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userForm.phoneNumber"/>
                        <label for="productName">Phone Number</label>
                        <input type="text" class="form-control" name="phoneNumber" id="phoneNumber" value="${userForm.phoneNumber}"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userForm.companyName"/>
                        <label for="productName">Company Name</label>
                        <input type="text" class="form-control" name="companyName" id="companyName" value="${userForm.companyName}"/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                    <div class="form-group">
                        <@spring.bind "userForm.password"/>
                        <label for="productName">Password</label>
                        <input type="password" class="form-control" name="password" id="password" required/>

                        <#list spring.status.errorMessages as error>
                            <span class="errorRed">${error}</span>
                        </#list>
                    </div>

                </div>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <button type="submit" value="Update" class="btn btn-success">Update</button>
                    <button type="reset" id="btn-clear" class="btn btn-danger">Reset</button>
                </div>

            </form>
        </div>
    </div>
</div>
<#include "partials/scripts.ftl">
</body>
</html>