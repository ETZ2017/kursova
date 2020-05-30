<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en" style="background-color: #31373e">
<head>
    <meta charset="UTF-8">
    <title>Edit Winner</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<form name="winners" action="" method="POST">
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
            Edit winner
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Winner:
            <br>
            <@spring.formSingleSelect "winnersForm.artist", artist, ""/>
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Winner's Place:
            <br>
            <@spring.formSingleSelect "winnersForm.place", places, ""/>
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Winner's contest:
            <br>
            <@spring.formSingleSelect "winnersForm.contest", contest, ""/>
        </li>
        <li style="font-size: 1.25em; margin: 8px; background-color: transparent; border-radius: 60px">
            Winner's description:
            <br>
            <@spring.formInput "winnersForm.description", "", "text"/>
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
   <#-- Winners Artist:<@spring.formSingleSelect "winnersForm.artist", artist, ""/>
    <br>
    Winners Place:<@spring.formSingleSelect "winnersForm.place", places, ""/>
    <br>
    Winners description:<@spring.formSingleSelect "winnersForm.contest", contest, ""/>
    <br>
    Winners description:<@spring.formInput "winnersForm.description", "", "text"/>
    <br>
    <input type="submit" value="Edit"/>-->
</form>

</body>
</html>