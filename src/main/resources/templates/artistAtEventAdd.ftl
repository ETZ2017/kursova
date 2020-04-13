<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Artist at event</title>
</head>
<body>
<form name="artistAtEvent" action="" method="POST">
    Artist :<@spring.formSingleSelect "artistAtEventForm.artist", mavs, ""/>
    <br>
    Artist's event:<@spring.formSingleSelect "artistAtEventForm.event", event, ""/>
    <br>
   <#-- Artist's contest:<@spring.formSingleSelect "artistAtEventForm.contest", contest, ""/>
    <br>-->
    <input type="submit" value="Create"/>
</form>

</body>
</html>