<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Event</title>
</head>
<body>
<h3>Event List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Name<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list events as event>
        <tr>
            <td>${event.id}</td>
            <td>${event.name}</td>
        </tr>
    </#list>
</div>

</body>
</html>