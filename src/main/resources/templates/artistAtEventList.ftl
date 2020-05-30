<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Artist At Event</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

<script>
    function myFunction() {
        let x = document.getElementById("search");
        if (x.style.display === "none") {
            x.style.display = "block";
        } else {
            x.style.display = "none";
        }
    }
</script>
<div class="container-fluid">
    <div>
        <a href="/web" style="float: left; margin-top: 7px;">
            <img src="https://img.icons8.com/ios-glyphs/24/000000/circled-left-2.png" style="width: 28px;"/>
        </a>
        <h1 style="text-align: center; margin-bottom: 10px;">Artist at Event List
            <svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" viewBox="0 0 36 36" fill="none" stroke="currentColor"
                 stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-search"
                 onclick="myFunction()">
                <circle cx="11" cy="11" r="8"/><line x1="23" y1="23" x2="18.65" y2="18.65"/></svg>
        </h1>
    </div>




    <div id="search" style="display:none;">
        <form name="search" action="" method="POST" style="margin: 5px">
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Artist</legend>
                Artist's name:<@spring.formInput "searchForm.searchField", "", "text"/>
                <br>
<#--                <input type="submit" value="Search" class="btn btn-outline-dark" style="margin-top: 5px"/>-->
            </fieldset>
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Event</legend>
                Event:<@spring.formInput "searchForm.searchFieldReserve", "", "text"/>
                <br>
            </fieldset>
            <br>
            <input type="submit" value="Search" class="btn btn-dark" style="margin-top: 10px; margin-bottom: 10px"/>
        </form>
    </div>


    <a href="create" style="float: right; margin: 5px"><button class="btn btn-outline-dark">Create</button></a>

    <div class="table-responsive-md">
        <table class="table table-sm table-striped table-bordered" style="vertical-align: center; border: 3px solid #31373e">
            <tr class="bg-dark text-light">
                <th class="align-middle">Id</th>
                <th class="align-middle">Artist
                    <a style="margin-left: 3px" href="/web/artistatevent/sorted" type="button" class="btn btn-outline-light">
                        <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24"
                             fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round"
                             stroke-linejoin="round" class="feather feather-filter">
                            <polygon points="22 3 2 3 10 12.46 10 19 14 21 14 12.46 22 3"/></svg></a>
                    <a href="/web/artistatevent/list" type="button" class="btn btn-outline-light">
                        <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none"
                             stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"
                             class="feather feather-rotate-ccw"><polyline points="1 4 1 10 7 10"/>
                            <path d="M3.51 15a9 9 0 1 0 2.13-9.36L1 10"/></svg>
                        Undo sort</a></th>
                <th class="align-middle">Event</th>
                <th class="align-middle">Edit</th>
                <th class="align-middle">Delete</th>
                <#--<th>Last Name</th>
                <th>Patronymic</th>-->
            </tr>
            <#list artistAtEvents as artistAtEvent>
                <tr class="" style="font-size: larger">
                    <td class="align-middle">${artistAtEvent.id}</td>
                    <td class="align-middle">${artistAtEvent.artist.firstName}</td>
                    <td class="align-middle">${artistAtEvent.event.name}</td>
    <#--                <td>${artistAtEvent.contest.name}</td>-->
                    <td class="align-middle" style="width:1%; white-space:nowrap;"><a href="edit/${artistAtEvent.id}"><button class="btn btn-outline-dark">Edit</button></a></td>
                    <td class="align-middle" style="width:1%; white-space:nowrap;"><a href="delete/${artistAtEvent.id}"><button class="btn btn-outline-dark">Delete</button></a></td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>

