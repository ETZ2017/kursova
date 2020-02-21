<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Organiser</title>
</head>
<body>
<h3>Organiser List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>First name<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list organisers as organiser>
        <tr>
            <td>${organiser.id}</td>
            <td>${organiser.firstName}</td>
        </tr>
    </#list>
</div>
</body>
</html>

