<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Event</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Event List</h3>
<div>
    <table border="3"class="table table-sm table-dark">
    <tr>
        <th>id</th>
        <th>Name</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list events as event>
        <tr class="bg-info">
            <td>${event.id}</td>
            <td>${event.name}</td>
        </tr>
    </#list>
    </table>
</div>

</body>
</html>