<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: #31373e">
<head>
    <meta charset="UTF-8">
    <title>Edit Event</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<form name="event" action="" method="POST">
    <ul class="list-group" style="font-size: large;
               font-family: 'Source Code Pro';
               list-style-type: none;
               text-decoration: none;
               padding: 18px;
               background: #f4f4f4;
               border: 1px solid #31373e;
               border-radius: 3px;
               position: fixed; top: 50%; left: 50%;
               -webkit-transform: translate(-50%, -50%);
               -ms-transform: translate(-50%, -50%);
               transform: translate(-50%, -50%);">
        <li style="font-size: 1.8em; text-align: center; background-color: transparent;">
            Edit event
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event name:
            <br>
            <@spring.formInput "eventForm.name", "", "text"/>
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event building:
            <br>
            <@spring.formSingleSelect "eventForm.building", building, ""/>
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event type:
            <br>
            <@spring.formSingleSelect "eventForm.typeOfEvent", type, ""/>
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event organiser:
            <br>
            <@spring.formSingleSelect "eventForm.organiser", organiser, ""/>
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event contest:
            <br>
            <@spring.formSingleSelect "eventForm.contest", contest, ""/>
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px;">
                <div style="margin-bottom: 2px">
                    Day:<@spring.formInput "eventForm.day", "", "text"/>
                </div>
                <div style="margin-bottom: 2px">
                    Month:<@spring.formInput "eventForm.month", "", "text"/>
                </div>
                <div style="margin-bottom: 2px">
                    Year:<@spring.formInput "eventForm.year", "", "text"/>
                </div>
<#--            Day:<@spring.formInput "eventForm.day", "", "text"/>-->
<#--            <br>-->
<#--            Month:<@spring.formInput "eventForm.month", "", "text"/>-->
<#--            <br>-->
<#--             Year:<@spring.formInput "eventForm.year", "", "text"/>-->
        </li>
        <li style="font-size: 1em; margin: 5px; background-color: transparent; border-radius: 60px">
            Event description:
            <br>
            <@spring.formInput "eventForm.description", "", "text"/>
        </li>
        <li style="font-size: 1em; margin: 5px; text-align: center; background-color: transparent;">
            <#--            <input type="submit" value="Edit" style="width: 100px; height: 30px; margin-top: 5px;-->
            <#--            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>-->
            <button class="btn btn-dark" type="submit" style="margin-top: 5px;
                                                              width: 86px;
                                                              font-size: larger;
                                                              font-family: 'Source Code Pro';">
                Edit</button>
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