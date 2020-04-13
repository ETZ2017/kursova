<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Genre</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>

<script>
    function myFunction() {
        let x = document.getElementById("search");
        if (x.style.display === "block") {
            x.style.display = "none";
            let state = x.style.display;
        } else {
            x.style.display = "block";
            let state = x.style.display;
        }
    }
</script>

<h1 style="text-align: center; margin-bottom: 10px">Genre List
    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor"
         stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-search"
         onclick="myFunction()">
        <circle cx="11" cy="11" r="8"/><line x1="21" y1="21" x2="16.65" y2="16.65"/></svg>
</h1>


<div id="search" style="display: none">
    <fieldset>
        <legend style="margin: 5px">Find by Genre</legend>
        <form name="search" action="" method="POST" style="margin: 5px">
            Genre:<@spring.formInput "searchForm.searchField", "", "text"/>
            <br>
            <input type="submit" value="Search" class="btn btn-info" style="margin-top: 5px"/>
        </form>
    </fieldset>
</div>

<br>

<div>
    <table border="3"class="table table-sm table-dark">
    <tr>
        <th>id</th>
        <th>Genre
            <a href="/web/genre/list/sorted" type="button" class="btn btn-outline-light">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"
                     fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round"
                     stroke-linejoin="round" class="feather feather-filter">
                    <polygon points="22 3 2 3 10 12.46 10 19 14 21 14 12.46 22 3"/></svg></a>
            <a href="/web/genre/list" type="button" class="btn btn-outline-light">
                <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                     stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                     class="feather feather-rotate-ccw"><polyline points="1 4 1 10 7 10"/>
                    <path d="M3.51 15a9 9 0 1 0 2.13-9.36L1 10"/></svg>
                Undo sort</a></th></th>
        <th>Description</th>
        <th>Delete</th>
        <th>Edit</th>
            <#--<th>Last Name</th>
            <th>Patronymic</th>-->
    </tr>
    <#list genres as genre>
        <tr class="bg-info">
            <td>${genre.id}</td>
            <td>${genre.genre}</td>
            <td>${genre.description}</td>
            <td><a href="delete/${genre.id}"><button>Delete</button></a></td>
            <td><a href="edit/${genre.id}"><button>Edit</button></a></td>
        </tr>
    </#list>
    </table>
    <a href="create"><button>Create</button></a>
</div>

</body>
</html>