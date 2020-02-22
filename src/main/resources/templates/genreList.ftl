<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Genre</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<h3>Genre List</h3>
<div>
    <table border="3"class="table table-sm table-dark">
    <tr>
        <th>id</th>
        <th>Genre</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list genres as genre>
        <tr class="bg-info">
            <td>${genre.id}</td>
            <td>${genre.genre}</td>
        </tr>
    </#list>
    </table>
</div>

</body>
</html>