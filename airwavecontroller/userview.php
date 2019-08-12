<?php

    session_start();
    
        include('conn.php');

        $userName = $_SESSION['name'];
        $userID = $_SESSION['adminID'];
       

        if (!isset($userName)) {
		    header("Location:index.php");
        } else {
	       echo "Signed in as $userName";
        }

        if (isset($_POST["destroy"])) {
	        session_unset();
	        header("Location:/index.php");
        }

    

?>
<!--Airwave Fesival App by Matthew Johnston Student no 40247362-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="css/style.css" type="text/css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
    <title>Admin Log In</title>
</head>

<body>
    <!--body colour set to dark creating a dark mode design-->
    
     <!--Start of Nav bar-->
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                    
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav">
                <li class="nav-item active">
                  <a class="nav-link" href="schedule.php">Update Stage Time</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="userview.php">User View</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="logout.php">Log Out</a>
                </li>
              </ul>
            </div>
            
    </nav>
    <!--End of Nav Bar-->
    <body class="bg-dark text-white">
                  
            <div class="container" style= "text-align: center">
                <h2>User View</h2>
                <iframe src="http://mjohnston77.lampt.eeecs.qub.ac.uk/airwave/index.html" style="border:3px #ffffff solid;" name="myiFrame" scrolling="yes" frameborder="1" marginheight="3px" marginwidth="3px" height="600px" width="300px" allowfullscreen></iframe>
            </div>
            
                    
                    
          
          
    

    
                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script> -->
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            
        </body>
</html>