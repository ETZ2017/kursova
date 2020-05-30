<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Event</title>
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
    function myCalendar() {
        let x = document.getElementById("calendar");
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
        <h1 style="text-align: center; margin-bottom: 10px;">Event List
            <svg xmlns="http://www.w3.org/2000/svg" width="36" height="36" viewBox="0 0 36 36" fill="none" stroke="currentColor"
                 stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-search"
                 onclick="myFunction()">
                <circle cx="11" cy="11" r="8"/><line x1="23" y1="23" x2="18.65" y2="18.65"/></svg>
            <#--<svg style="margin-left: -12px" xmlns="http://www.w3.org/2000/svg"
                height="36" version="1.1" width="36" onclick="myCalendar()">
                <g transform="translate(0 -1028.4)">
                    <path d="m5 1032.4c-1.1046 0-2 0.9-2 2v14c0 1.1 0.8954 2 2 2h6 2 6c1.105 0 2-0.9 2-2v-14c0-1.1-0.895-2-2-2h-6-2-6z"
                          fill="#bdc3c7"/><path d="m5 3c-1.1046 0-2 0.8954-2 2v14c0 1.105 0.8954 2 2 2h6 2 6c1.105 0 2-0.895 2-2v-14c0-1.1046-0.895-2-2-2h-6-2-6z" fill="#ecf0f1" transform="translate(0 1028.4)"/><path d="m5 3c-1.1046 0-2 0.8954-2 2v3 1h18v-1-3c0-1.1046-0.895-2-2-2h-6-2-6z" fill="#e74c3c" transform="translate(0 1028.4)"/><path d="m7 5.5a1.5 1.5 0 1 1 -3 0 1.5 1.5 0 1 1 3 0z" fill="#c0392b" transform="translate(.5 1028.4)"/><path d="m6 1c-0.5523 0-1 0.4477-1 1v3c0 0.5523 0.4477 1 1 1s1-0.4477 1-1v-3c0-0.5523-0.4477-1-1-1z" fill="#bdc3c7" transform="translate(0 1028.4)"/><path d="m7 5.5a1.5 1.5 0 1 1 -3 0 1.5 1.5 0 1 1 3 0z" fill="#c0392b" transform="translate(12.5 1028.4)"/><g fill="#bdc3c7"><path d="m18 1029.4c-0.552 0-1 0.4-1 1v3c0 0.5 0.448 1 1 1s1-0.5 1-1v-3c0-0.6-0.448-1-1-1z"/><path d="m5 1039.4v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2z"/><path d="m5 1042.4v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2z"/><path d="m5 1045.4v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2zm3 0v2h2v-2h-2z"/></g><path d="m40 18a6 6 0 1 1 -12 0 6 6 0 1 1 12 0z" fill="#34495e" transform="matrix(.82491 0 0 .82491 -9.5468 1032.1)"/><path d="m18.5 14c-0.276 0-0.5 0.224-0.5 0.5v0.5 3 0.5c0 0.276 0.224 0.5 0.5 0.5h0.5 2 0.5c0.276 0 0.5-0.224 0.5-0.5s-0.224-0.5-0.5-0.5h-0.5-2v-3-0.5c0-0.276-0.224-0.5-0.5-0.5z" fill="#bdc3c7" transform="translate(0 1028.4)"/><path d="m18.5 1041.4c-3.038 0-5.5 2.4-5.5 5.5 0 3 2.462 5.5 5.5 5.5s5.5-2.5 5.5-5.5c0-3.1-2.462-5.5-5.5-5.5zm0 1c2.485 0 4.5 2 4.5 4.5 0 2.4-2.015 4.5-4.5 4.5s-4.5-2.1-4.5-4.5c0-2.5 2.015-4.5 4.5-4.5z" fill="#7f8c8d"/><path d="m27 17.5c0 0.276-0.224 0.5-0.5 0.5s-0.5-0.224-0.5-0.5 0.224-0.5 0.5-0.5 0.5 0.224 0.5 0.5z" fill="#95a5a6" transform="translate(-8 1029.4)"
                    /></g>
            </svg>-->
            <svg version="1.1" id="Capa_1" x="0px" y="0px" width="23px" height="23px" viewBox="0 0 36.447 36.447" style="enable-background:new 0 0 36.447 36.447; margin-left: -12px; margin-top: -10px" xml:space="preserve" onclick="myCalendar()">
                <g>
                    <g>
                        <path d="M30.224,3.948h-1.098V2.75c0-1.517-1.197-2.75-2.67-2.75c-1.474,0-2.67,1.233-2.67,2.75v1.197h-2.74V2.75    c0-1.517-1.197-2.75-2.67-2.75c-1.473,0-2.67,1.233-2.67,2.75v1.197h-2.74V2.75c0-1.517-1.197-2.75-2.67-2.75    c-1.473,0-2.67,1.233-2.67,2.75v1.197H6.224c-2.343,0-4.25,1.907-4.25,4.25v24c0,2.343,1.907,4.25,4.25,4.25h24    c2.344,0,4.25-1.907,4.25-4.25v-24C34.474,5.855,32.567,3.948,30.224,3.948z M25.286,2.75c0-0.689,0.525-1.25,1.17-1.25    c0.646,0,1.17,0.561,1.17,1.25v4.896c0,0.689-0.524,1.25-1.17,1.25c-0.645,0-1.17-0.561-1.17-1.25V2.75z M17.206,2.75    c0-0.689,0.525-1.25,1.17-1.25s1.17,0.561,1.17,1.25v4.896c0,0.689-0.525,1.25-1.17,1.25s-1.17-0.561-1.17-1.25V2.75z M9.125,2.75    c0-0.689,0.525-1.25,1.17-1.25s1.17,0.561,1.17,1.25v4.896c0,0.689-0.525,1.25-1.17,1.25s-1.17-0.561-1.17-1.25V2.75z     M31.974,32.198c0,0.965-0.785,1.75-1.75,1.75h-24c-0.965,0-1.75-0.785-1.75-1.75v-22h27.5V32.198z"/>
                        <rect x="6.724" y="14.626" width="4.595" height="4.089"/>
                        <rect x="12.857" y="14.626" width="4.596" height="4.089"/>
                        <rect x="18.995" y="14.626" width="4.595" height="4.089"/>
                        <rect x="25.128" y="14.626" width="4.596" height="4.089"/>
                        <rect x="6.724" y="20.084" width="4.595" height="4.086"/>
                        <rect x="12.857" y="20.084" width="4.596" height="4.086"/>
                        <rect x="18.995" y="20.084" width="4.595" height="4.086"/>
                        <rect x="25.128" y="20.084" width="4.596" height="4.086"/>
                        <rect x="6.724" y="25.54" width="4.595" height="4.086"/>
                        <rect x="12.857" y="25.54" width="4.596" height="4.086"/>
                        <rect x="18.995" y="25.54" width="4.595" height="4.086"/>
                        <rect x="25.128" y="25.54" width="4.596" height="4.086"/>
                    </g>
                </g>
                </svg>
            </h1>
</div>

<div id="calendar" style="display:none;">
    <form name="search" action="" method="POST" style="margin: 5px">
        <fieldset>
            <legend style="margin: 5px">Enter starting date:</legend>
            Day:<@spring.formInput "searchForm.dayBeg", "", "text"/>
            Month:<@spring.formInput "searchForm.monthBeg", "", "text"/>
            Year:<@spring.formInput "searchForm.yearBeg", "", "text"/>
            <br>
            <legend style="margin: 5px">Enter ending date:</legend>
            Day:<@spring.formInput "searchForm.dayEnd", "", "text"/>
            Month:<@spring.formInput "searchForm.monthEnd", "", "text"/>
            Year:<@spring.formInput "searchForm.yearEnd", "", "text"/>
            <br>
        </fieldset>
        <br>
        <input type="submit" value="Search" class="btn btn-dark" style="margin-top: 10px; margin-bottom: 10px"/>
    </form>
</div>


    <div id="search" style="display:none;">
        <form name="search" action="" method="POST" style="margin: 5px">
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Name</legend>
                Event's name:<@spring.formInput "searchForm.searchField", "", "text"/>
                <br>
        </fieldset>
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Building</legend>
                Building:<@spring.formInput "searchForm.searchFieldReserve", "", "text"/>
                <br>
            </fieldset>
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Type</legend>
                Type of Event:<@spring.formInput "searchForm.searchFieldReserve2", "", "text"/>
                <br>
            </fieldset>
            <fieldset style="display: inline">
                <legend style="margin: 5px">Find by Organiser</legend>
                Organiser:<@spring.formInput "searchForm.searchFieldReserve3", "", "text"/>
                <br>
            </fieldset>
            <fieldset style="display: inline">
            <legend style="margin: 5px">Find by Contest</legend>
                Contest:<@spring.formInput "searchForm.searchFieldReserve4", "", "text"/>
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
                <th class="align-middle">Name
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
                <th class="align-middle">Building</th>
                <th class="align-middle">Type Of Event</th>
                <th class="align-middle">Organiser</th>
                <th class="align-middle">Contest</th>
                <th class="align-middle">Data</th>
                <th class="align-middle">Edit</th>
                <th class="align-middle">Delete</th>
            </tr>

            <#list events as event>
                <tr class="" style="font-size: larger">
                    <td>${event.id}</td>
                    <td>${event.name}</td>
                    <td>${event.building.name}</td>
                    <td>${event.typeOfEvent.type}</td>
                    <td>${event.organizer.firstName}</td>
                    <td>${event.contest.name}</td>
                    <td>${event.data}</td>
                    <td class="align-middle" style="width:1%; white-space:nowrap;"><a href="edit/${event.id}"><button class="btn btn-outline-dark">Edit</button></a></td>
                    <td><a href="delete/${event.id}"><button class="btn btn-outline-dark">Delete</button></a></td>
                </tr>
            </#list>
        </table>
    </div>
</div>
</body>
</html>