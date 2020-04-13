<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="contest" action="" method="POST">
    Contest name:<@spring.formInput "contestForm.contest", "", "text"/>
    <br>
    Contest description:<@spring.formInput "contestForm.description", "", "text"/>
    <br>
    <input type="submit" value="Create"/>
</form>
</body>
</html>