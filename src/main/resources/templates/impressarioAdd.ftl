<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="impressario" action="" method="POST">
    Impressario name:<@spring.formInput "impressarioForm.firstname" "" "text"/>
    <br>
    <#--Impressario artist:<@spring.formSingleSelect "impressarioForm.artist", artist, ""/>
    <br>-->
    Impressario genre:<@spring.formSingleSelect "impressarioForm.genre", genre, ""/>
    <br>
    Impressario description:<@spring.formInput "impressarioForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>