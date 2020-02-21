<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Genre</title>
</head>
<body>
<h3>Genre List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Genre<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list genres as genre>
        <tr>
            <td>${genre.id}</td>
            <td>${genre.genre}</td>
        </tr>
    </#list>
</div>

</body>
</html>