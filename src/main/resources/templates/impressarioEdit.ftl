<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: rgba(151,178,219,0.5)">
<head>
    <meta charset="UTF-8">
    <title>Edit Impressario</title>
</head>
<body>
<form name="impressario" action="" method="POST">
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
            Edit impressario
        </li>
        <li style="margin: 10px">
            Impressario name:<@spring.formInput "impressarioForm.firstname" "" "text"/>
        </li>
        <li style="margin: 10px">
            Impressario genre:<@spring.formSingleSelect "impressarioForm.genre", genre, ""/>
        </li>
        <li style="margin: 10px">
            Impressario description:<@spring.formInput "impressarioForm.description", "", "text"/>
        </li>
        <li style="margin: 10px; text-align: center">
            <input type="submit" value="Edit" style="width: 100px; height: 30px; margin-top: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>
        </li>
    </ul>
    <#--Impressario name:<@spring.formInput "impressarioForm.firstname" "" "text"/>
    <br>
    &lt;#&ndash;Impressario artist:<@spring.formSingleSelect "impressarioForm.artist", artist, ""/>
    <br>&ndash;&gt;
    Impressario genre:<@spring.formSingleSelect "impressarioForm.genre", genre, ""/>
    <br>
    Impressario description:<@spring.formInput "impressarioForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>-->
</form>
</body>
</html>