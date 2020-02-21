<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Winners</title>
</head>
<body>
<h3>Winners List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Place<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list winnerss as winners>
        <tr>
            <td>${winners.id}</td>
            <td>${winners.place}</td>
        </tr>
    </#list>
</div>
</body>
</html>

