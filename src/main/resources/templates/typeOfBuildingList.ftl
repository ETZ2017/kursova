<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Type of Building</title>
</head>
<body>
<h3>Type of Building List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Type<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list typeOfBuildings as typeOfBuilding>
        <tr>
            <td>${typeOfBuilding.id}</td>
            <td>${typeOfBuilding.type}</td>
        </tr>
    </#list>
</div>
</body>
</html>

