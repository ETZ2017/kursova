<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Places</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Places List</h3>
<div>
    <table border="3"class="table table-sm table-dark">
    <tr>
        <th>id</th>
        <th>Places</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list placess as places>
        <tr class="bg-info">
            <td>${places.id}</td>
            <td>${places.place}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>

