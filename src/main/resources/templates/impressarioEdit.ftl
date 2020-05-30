<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: #31373e">
<head>
    <meta charset="UTF-8">
    <title>Edit Impressario</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<form name="impressario" action="" method="POST">
    <ul class="list-group" style="font-size: large;
               font-family: 'Source Code Pro';
               list-style-type: none;
               text-decoration: none;
               padding: 18px;
               background: #f4f4f4;
               border: 1px solid #31373e;
               border-radius: 3px;
               position: fixed; top: 50%; left: 50%;
               -webkit-transform: translate(-50%, -50%);
               -ms-transform: translate(-50%, -50%);
               transform: translate(-50%, -50%);">
        <li style="font-size: 2.5em; text-align: center; background-color: transparent;">
            Edit impressario
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Impressario name:
            <br>
            <@spring.formInput "impressarioForm.firstname" "" "text"/>
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Impressario genre:
            <br>
            <@spring.formSingleSelect "impressarioForm.genre", genre, ""/>
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Impressario description:
            <br>
            <@spring.formInput "impressarioForm.description", "", "text"/>
        </li>
        <li style="font-size: 1em; margin: 8px; text-align: center; background-color: transparent;">
            <#--            <input type="submit" value="Edit" style="width: 100px; height: 30px; margin-top: 5px;-->
            <#--            box-shadow: 0 0 10px rgba(0,0,0,0.29)"/>-->
            <button class="btn btn-dark" type="submit" style="margin-top: 5px;
                                                              width: 86px;
                                                              font-size: larger;
                                                              font-family: 'Source Code Pro';">
                Edit</button>
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