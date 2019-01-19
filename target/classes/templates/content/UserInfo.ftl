<table class="table table-striped">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Company Name</th>
        <th></th>
    </tr>
    </thead>
    <tbody>

        <tr>

            <td> ${user.firstName}</td>
            <td> ${user.lastName}</td>
            <td> ${user.email}</td>
            <td> ${user.phoneNumber}</td>
            <td> ${user.companyName}</td>
            <td class="text-right">
                <a class="btn btn-success" href="/user/edit/">Edit</a>
            </td>
        </tr>

    </tbody>
</table>