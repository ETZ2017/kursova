<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Edit Contest</title>
</head>
<body>
<form name="contest" action="" method="POST">
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
            Edit contest
        </li>
        <li style="margin: 10px">
            Contest name:<@spring.formInput "contestForm.contest", "", "text"/>
        </li>
        <li style="margin: 10px">
            Contest description:<@spring.formInput "contestForm.description", "", "text"/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Edit" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>
    <#--Contest name:<@spring.formInput "contestForm.contest", "", "text"/>
    <br>
    Contest description:<@spring.formInput "contestForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>-->
</form>
</body>
</html>