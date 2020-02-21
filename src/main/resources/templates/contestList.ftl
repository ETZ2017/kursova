<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contest</title>
</head>
<body>
<h3>Contest List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Contest<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list contests as contest>
        <tr>
            <td>${contest.id}</td>
            <td>${contest.name}</td>
        </tr>
    </#list>
</div>
</body>
</html>
