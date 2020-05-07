<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Add Building</title>
</head>
<body>
<form name="building" action="" method="POST">
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
            Add building
        </li>
        <li style="margin: 10px">
            Building name:<@spring.formInput "culturalBuildingForm.name", "", "text"/>
        </li>
        <li style="margin: 10px">
            Building type:<@spring.formSingleSelect "culturalBuildingForm.type", type, ""/>
        </li>
        <li style="margin: 10px">
            Building special features:<@spring.formSingleSelect "culturalBuildingForm.specials", specials, ""/>
        </li>
        <li style="margin: 10px">
            Building special feature's value:<@spring.formInput "culturalBuildingForm.value", "", "text"/>
        </li>
        <li style="margin: 10px">
            Building description:<@spring.formInput "culturalBuildingForm.description", "", "text"/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Create" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>

    <#--Building name:<@spring.formInput "culturalBuildingForm.name", "", "text"/>
    <br>
    Building type:<@spring.formSingleSelect "culturalBuildingForm.type", type, ""/>
    <br>
    Building special features:<@spring.formSingleSelect "culturalBuildingForm.specials", specials, ""/>
    <br>
    Building special feature's value:<@spring.formInput "culturalBuildingForm.value", "", "text"/>
    <br>
    Building description:<@spring.formInput "culturalBuildingForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>-->

</form>
</body>
</html>