<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cultural Building</title>
</head>
<body>
<h3>Cultural Building List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Name<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list culturalBuildings as culturalBuilding>
        <tr>
            <td>${culturalBuilding.id}</td>
            <td>${culturalBuilding.name}</td>
        </tr>
    </#list>
</div>

</body>
</html>