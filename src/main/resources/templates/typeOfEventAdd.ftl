<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Add Type Of Event</title>
</head>
<body>
<form name="typeOfEvent" action="" method="POST">
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
            Add type of event
        </li>
        <li style="margin: 10px">
            Type Of Event type:<@spring.formInput "typeOfEventForm.type", "", "text"/>
        </li>
        <li style="margin: 10px">
            Type Of Event description:<@spring.formInput "typeOfEventForm.description", "", "text"/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Create" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>
    <#--Type Of Event type:<@spring.formInput "typeOfEventForm.type", "", "text"/>
    <br>
    Type Of Event description:<@spring.formInput "typeOfEventForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>-->
</form>

</body>
</html>