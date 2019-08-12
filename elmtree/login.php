<?php

    
    // connection to database
    include('conn.php');

    // read item table from database
    $read = "SELECT * FROM item";
  
    $result = $conn->query($read);

    if(isset($_POST["submitlog"])){
        $username = $conn->real_escape_string($_POST["userfield"]);
        $pass = $conn->real_escape_string($_POST["passfield"]);

        $read="SELECT * FROM user WHERE userName='$username' AND pw='$pass'";
        $result = $conn->query($read);
        $rowcount = $result -> num_rows;

        if($rowcount > 0){

       echo "Successfully logged in";

       while($row = $result->fetch_assoc()){
                $_SESSION["mjohnston77_username"] = $row["userName"];
                $_SESSION["mjohnston77_id"] = $row["userID"];
                header("Location:admin/index.php");
        }
   } else {

        echo "Incorrect information entered";
    }
    }
?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link  rel="stylesheet" href="styles/gui.css" type="text/css">
        <title>Elm Tree - Student Buy & Sell</title>
        <link rel="icon" href="favicon.ico">
    </head>
    <body>  
            <!--navigation bar-->
            <nav class="navbar navbar-dark bg-dark">
                <div class = "container">
                    <a class="navbar-brand" href="index.php">
                        <img src="img/elmtreelogo.png" width="30" height="30" class="d-inline-block align-top" alt="">
                        ElmTree
                    </a>
                    <div class="col-7">
                        <form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-dark text-light" type="submit">Search</button>
                        </form>
                    </div>
                    
                    <div class="col-1">
                        <a class="btn btn-outline-dark text-light" href="register.php" role="button">Register</a>
   
                    </div>
                    <div class="col-2 ">

                        <a class="btn btn-outline-dark text-light float-right" href="index.php" role="button">Log In</a>
                    </div>
                </div>

            </nav>
            
            <div class='container container-back'>
                <div class= 'col-6 columnitem'>
                    <div class="row">
                            <h2>Log In</h2>
                    </div>
                    <form action="sign.php" method="post">
                        <div class="form-group col-6">
                            <label for="exampleInputEmail1">User Name</label>
                            <input  name="userfield" type="text"  id="exampleInputEmail1" required="required"  placeholder="Username">          
                        </div>
                                    <div class="form-group col-6">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input name="passfield" type="password" class="form-control" id="exampleInputPassword1" required="required" placeholder="Password">
                                    </div>
                                
                                    <button type="submit" class="btn btn-dark" name="submitlog">Log In</button>

                                </form>
                        </div>
                    </div>
                </div>
            </div>
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>