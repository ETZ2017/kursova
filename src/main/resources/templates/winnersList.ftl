<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Winners</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
          crossorigin="anonymous">
</head>
<body>
<h3>Winners List</h3>
<div>
    <table border="3"class="table table-sm table-dark">
    <tr >
        <th>id</th>
        <th>Place</th>
        <th>Delete</th>
        <th>Edit</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list winnerss as winners>
        <tr class="bg-info">
            <td>${winners.id}</td>
            <td>${winners.place}</td>
            <td><a href="delete/${winners.id}"><button>Delete</button></a></td>
            <td><a href="edit/${winners.id}"><button>Edit</button></a></td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>

