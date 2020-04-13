<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Type Of Event</title>
</head>
<body>
<form name="typeOfEvent" action="" method="POST">
    Type Of Event type:<@spring.formInput "typeOfEventForm.type", "", "text"/>
    <br>
    Type Of Event description:<@spring.formInput "typeOfEventForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>