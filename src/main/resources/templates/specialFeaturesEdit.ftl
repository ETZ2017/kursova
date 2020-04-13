<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Special Features</title>
</head>
<body>
<form name="specialFeatures" action="" method="POST">
    Special Features type:<@spring.formInput "specialFeaturesForm.type", "", "text"/>
    <br>
   <#-- Special Features value:<@spring.formInput "specialFeaturesForm.value", "", "text"/>
    <br>-->
    Special Features description:<@spring.formInput "specialFeaturesForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>
</form>
</body>
</html>