<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Type Of Building</title>
</head>
<body>
<form name="typeOfBuilding" action="" method="POST">
    Type Of Building type:<@spring.formInput "typeOfBuildingForm.type", "", "text"/>
    <br>
    Type Of Building description:<@spring.formInput "typeOfBuildingForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>
</form>

</body>
</html>