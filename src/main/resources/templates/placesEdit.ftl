<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Places</title>
</head>
<body>
<form name="places" action="" method="POST">
    Places place:<@spring.formInput "placesForm.place", "", "text"/>
    <br>
    Places description:<@spring.formInput "placesForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>
</form>
</body>
</html>