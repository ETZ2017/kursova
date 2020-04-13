<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Building</title>
</head>
<body>
<form name="building" action="" method="POST">
    Building name:<@spring.formInput "culturalBuildingForm.name", "", "text"/>
    <br>
    Building type:<@spring.formSingleSelect "culturalBuildingForm.type", type, ""/>
    <br>
    Building special features:<@spring.formSingleSelect "culturalBuildingForm.specials", specials, ""/>
    <br>
    Building special feature's value:<@spring.formInput "culturalBuildingForm.value", "", "text"/>
    <br>
    Building description:<@spring.formInput "culturalBuildingForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>