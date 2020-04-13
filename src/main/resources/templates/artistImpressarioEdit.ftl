<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Artist Impressario</title>
</head>
<body>
<form name="artistImpressario" action="" method="POST">
    Artist :<@spring.formSingleSelect "artistImpressarioForm.artist", artist, ""/>
    <br>
    Impressario:<@spring.formSingleSelect "artistImpressarioForm.impressario", impressario, ""/>
    <br>
    <input type="submit" value="Edit"/>
</form>

</body>
</html>