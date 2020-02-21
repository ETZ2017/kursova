<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Type of Event</title>
</head>
<body>
<h3>Type of Event List</h3>
<div>
    <table border="3", bgcolor="f0f0ff"></table>
    <tr>
        <th>id</th>
        <th>Type<th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list typeOfEvents as typeOfEvent>
        <tr>
            <td>${typeOfEvent.id}</td>
            <td>${typeOfEvent.type}</td>
        </tr>
    </#list>
</div>
</body>
</html>

