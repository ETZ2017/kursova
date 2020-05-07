<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Add Artist at event</title>
</head>
<body>
<form name="artistAtEvent" action="" method="POST">

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
            Add artist at event
        </li>
        <li style="margin: 10px">
            Artist :<@spring.formSingleSelect "artistAtEventForm.artist", mavs, ""/>
        </li>
        <li style="margin: 10px">
            Artist's event:<@spring.formSingleSelect "artistAtEventForm.event", event, ""/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Create" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>
    <#--Artist :<@spring.formSingleSelect "artistAtEventForm.artist", mavs, ""/>
    <br>
    Artist's event:<@spring.formSingleSelect "artistAtEventForm.event", event, ""/>
    <br>
   &lt;#&ndash; Artist's contest:<@spring.formSingleSelect "artistAtEventForm.contest", contest, ""/>
    <br>&ndash;&gt;
    <input type="submit" value="Create"/>-->
</form>

</body>
</html>