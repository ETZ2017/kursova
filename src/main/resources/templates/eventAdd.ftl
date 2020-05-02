<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="event" action="" method="POST">
    Event name:<@spring.formInput "eventForm.name", "", "text"/>
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
    <input type="submit" value="Create"/>
</form>
</body>
</html>