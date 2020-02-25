<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Impressario</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Impressario List</h3>
<div>
    <table border="3"class="table table-sm table-dark">
    <tr>
        <th>id</th>
        <th>First name</th>
        <th>Delete</th>
        <th>Edit</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list impressarios as impressario>
        <tr class="bg-info">
            <td>${impressario.id}</td>
            <td>${impressario.firstName}</td>
            <td><a href="delete/${impressario.id}"><button>Delete</button></a></td>
            <td><a href="edit/${impressario.id}"><button>Edit</button></a></td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>

