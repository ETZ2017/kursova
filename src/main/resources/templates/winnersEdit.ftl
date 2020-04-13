<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Winners</title>
</head>
<body>
<form name="winners" action="" method="POST">
    Winners Artist:<@spring.formSingleSelect "winnersForm.artist", artist, ""/>
    <br>
    Winners Place:<@spring.formSingleSelect "winnersForm.place", places, ""/>
    <br>
    Winners description:<@spring.formSingleSelect "winnersForm.contest", contest, ""/>
    <br>
    Winners description:<@spring.formInput "winnersForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit
"/>
</form>

</body>
</html>