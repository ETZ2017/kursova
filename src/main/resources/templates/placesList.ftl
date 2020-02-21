<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Places</title>
</head>
<body>
<h3>Places List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Places<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list placess as places>
        <tr>
            <td>${places.id}</td>
            <td>${places.place}</td>
        </tr>
    </#list>
</div>
</body>
</html>

