<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Artist in genre</title>
</head>
<body>
<form name="artistInGenre" action="" method="POST">
    Artist :<@spring.formSingleSelect "artistInGenreForm.artist", mavs, ""/>
    <br>
    Artist's genre:<@spring.formSingleSelect "artistInGenreForm.genre", genre, ""/>
    <br>
    <input type="submit" value="Edit"/>
</form>

</body>
</html>