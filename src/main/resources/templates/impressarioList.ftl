<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Impressario</title>
</head>
<body>
<h3>Impressario List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>First name<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list impressarios as impressario>
        <tr>
            <td>${impressario.id}</td>
            <td>${impressario.firstName}</td>
        </tr>
    </#list>
</div>
</body>
</html>

