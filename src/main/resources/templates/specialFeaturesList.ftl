<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Special Features</title>
</head>
<body>
<h3>Special Features List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Type<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list specialFeaturess as specialFeatures>
        <tr>
            <td>${specialFeatures.id}</td>
            <td>${specialFeatures.type}</td>
        </tr>
    </#list>
</div>
</body>
</html>

