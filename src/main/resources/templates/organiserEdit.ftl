<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Organiser</title>
</head>
<body>
<form name="organiser" action="" method="POST">
    Organiser name:<@spring.formInput "organiserForm.firstname" "" "text"/>
    <br>
    Organiser description:<@spring.formInput "organiserForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>
</form>

</body>
</html>