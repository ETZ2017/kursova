<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="artist" action="" method="POST">
    Artist name:<@spring.formInput "artistForm.firstname", "", "text"/>
    <br>
    Artist's genre:<@spring.formSingleSelect "artistForm.genre", mavs, ""/>
    <br>
    <#--Artist's impressario:<@spring.formSingleSelect "artistForm.impressario", impressario, ""/>
    <br>-->
    Artist description:<@spring.formInput "artistForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>

</body>
</html>