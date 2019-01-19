<table class="table table-striped">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Company Name</th>
        <th>Password</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

    <#list users as user>

        <tr>

        <td> ${user.firstName}</td>
        <td> ${user.lastName}</td>
        <td> ${user.email}</td>
        <td> ${user.phoneNumber}</td>
        <td> ${user.companyName}</td>
        <td> ${user.password}</td>

        </tr>
    </#list>

    </tbody>
</table>