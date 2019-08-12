<?php
    include("conn.php");
    
    MySQLi_select_db($conn, 'user');
	
	$userfield = $conn->real_escape_string($_POST['userfield']);
	$passfield = $conn->real_escape_string($_POST['passfield']);
	$emailfield = $conn->real_escape_string($_POST['emailfield']); 
    $namefield = $conn->real_escape_string($_POST['namefield']);
    $phonefield = $conn->real_escape_string($_POST['phonefield']);
    $twitterfeild = $conn->real_escape_string($_POST['twitterfield']);
    $universityfield = $conn->real_escape_string($_POST['universityfield']);

    $pic = $_FILES["image"] ["name"];
				$pictemp = $_FILES["image"] ["tmp_name"];

                $move = move_uploaded_file($pictemp, "upload/$pic");
                
	$addUser = "INSERT INTO user (userName, uName, userPhone, userImage, userEmail, pw, twitter, universityID) VALUES ('$userfield', '$namefield', '$phonefield','$pic',
      '$emailfield', '$passfield','$twitterfeild', $universityfield)";
	
	echo "<p> $addUser </p> ";
	
	//insert form data into MySQL database
    $resultinsert = $conn->query($addUser);
    
    

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
            

        
            <div class='container container-back'>
                <div class='row'>

                <h4>Successfully Registered User</h4>

			 	<?php

 				if(!$resultinsert){
 					echo $conn->error;
 				}else{
 					echo "<p>User Added!</p>";
 				}
 				?>
	 		
	 		
                       
                </div>
            </div>
        
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>