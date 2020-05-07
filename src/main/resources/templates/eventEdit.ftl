<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Edit Event</title>
</head>
<body>
<form name="event" action="" method="POST">
    <ul style="font-size: large;
               list-style-type: none;
               padding: 25px;
               background: #97b2db;
               border-radius: 3px;
               position: fixed; top: 50%; left: 50%;
               -webkit-transform: translate(-50%, -50%);
               -ms-transform: translate(-50%, -50%);
               transform: translate(-50%, -50%);">
        <li style="font-size: x-large; text-align: center">
            Edit event
        </li>
        <li style="margin: 10px">
            Event name:<@spring.formInput "eventForm.name", "", "text"/>
        </li>
        <li style="margin: 10px">
            Event building:<@spring.formSingleSelect "eventForm.building", building, ""/>
        </li>
        <li style="margin: 10px">
            Event type:<@spring.formSingleSelect "eventForm.typeOfEvent", type, ""/>
        </li>
        <li style="margin: 10px">
            Event organiser:<@spring.formSingleSelect "eventForm.organiser", organiser, ""/>
        </li>
        <li style="margin: 10px">
            Event contest:<@spring.formSingleSelect "eventForm.contest", contest, ""/>
        </li>
        <li style="margin: 10px">
            Day:<@spring.formInput "eventForm.day", "", "text"/>
            Month:<@spring.formInput "eventForm.month", "", "text"/>
            <br>
            Year:<@spring.formInput "eventForm.year", "", "text"/>
        </li>
        <li style="margin: 10px">
            Event description:<@spring.formInput "eventForm.description", "", "text"/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Edit" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>
    <#--Event name:<@spring.formInput "eventForm.name", "", "text"/>
    <br>
    Event building:<@spring.formSingleSelect "eventForm.building", building, ""/>
    <br>
    Event type:<@spring.formSingleSelect "eventForm.typeOfEvent", type, ""/>
    <br>
    Event organiser:<@spring.formSingleSelect "eventForm.organiser", organiser, ""/>
    <br>
    Event contest:<@spring.formSingleSelect "eventForm.contest", contest, ""/>
    <br>
    Day:<@spring.formInput "eventForm.day", "", "text"/>
    Month:<@spring.formInput "eventForm.month", "", "text"/>
    Year:<@spring.formInput "eventForm.year", "", "text"/>
    <br>
    Event description:<@spring.formInput "eventForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>-->
</form>
</body>
</html>