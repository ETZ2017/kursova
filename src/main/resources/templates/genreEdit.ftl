<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="genre" action="" method="POST">
    Genre name:<@spring.formInput "genreForm.name", "", "text"/>
    <br>
    Genre description:<@spring.formInput "genreForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>
</form>
</body>
</html>