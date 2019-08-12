<?php

    
    // connection to database
    include('conn.php');

    // read item table from database

    $userinfo = $conn->real_escape_string($_GET['userID']);
   
    if(isset($_GET['userID'])){
        $userinfo = $_GET['userID'];
   

    $read = "SELECT user.userID, user.userName, user.userEmail, user.uName, user.userPhone, user.userImage, user.twitter, university.universityName 
    FROM `user` 
    INNER JOIN
    university ON
    user.universityID = university.universityID WHERE userID = '$userinfo' ";
  
    $result = $conn->query($read);

  }else{
	  
	  //header('location: index.php');
	  
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

                        <a class="btn btn-outline-dark text-light float-right" href="login.php" role="button">Log In</a>
                    </div>
                </div>

            </nav>
            <!--End of navigation bar-->

        <?php
            echo "<div class='container container-back'>";
           
            if (!$result) {
                echo $conn->error;
             } else {
                        while ($row=$result->fetch_assoc()){
                        
                        $userID = $row['userID'];               
                        $username = $row['userName'];
                        $name = $row['uName'];                
                        $userphone = $row['userPhone'];        
                        $userimage = $row['userImage'];
                        $useremail = $row['userEmail'];
                        $twitter = $row['twitter'];
                        $uni = $row['universityName'];

                        
                        echo " <div class='row columnitem'> 
                                    
                                    <div class='col-8' infocol>
                                        
                                            <p><h4>$name</h4></p>
                                            <img src='upload/$userimage' class='img-thumbnail w-25'  alt='Responsive image'/>
                                            <p> Univeristy: $uni</p>
                                            <p>Please contact $name using information below to buy item</p>
                                            <p> Email: $useremail</p>
                                            <p> Phone: $userphone</p>
                                            <p> Twitter: $twitter</p>
                                        
                                        
                                </div> ";
                                    

                        }
                    }   
           
            echo " </div> ";
        ?>
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>