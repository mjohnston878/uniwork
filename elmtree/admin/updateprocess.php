<?php
    session_start();

    include("../conn.php");

    $userID = $_SESSION['40247362_userID'];

    
    
    MySQLi_select_db($conn, 'item');

    $read = "SELECT * FROM item";
  
    $result = $conn->query($read);
        if(!$result){
            echo $conn->error;
        }

        $row=$result->fetch_assoc();

    $_SESSION['40247362_userID'] = $row['userID']; 
	
	$itemfield = $conn->real_escape_string($_POST['itemName']);
	$pricefield = $conn->real_escape_string($_POST['itemPrice']);
	$descriptionfield = $conn->real_escape_string($_POST['itemdescription']); 
    $categoryfield = $conn->real_escape_string($_POST['itemcategory']);
    $itemID = $conn->real_escape_string($_POST['itemid']);

   
    

    $pic = $_FILES["image"] ["name"];
				$pictemp = $_FILES["image"] ["tmp_name"];

                $move = move_uploaded_file($pictemp, "../upload/$pic");
                
	$updateItem = "UPDATE 'item' SET (itemName, itemImg, itemPrice, itemDescription, categoryID) VALUES ('$itemfield', '$pic', '$pricefield','$descriptionfield', $categoryfield) WHERE itemID = '$itemID'";
	
	echo "<p> $updateItem </p> ";
	
	//insert form data into MySQL database
    $result = $conn->query($updateItem);
    
    

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
        <link rel="icon" href="../favicon.ico">
    </head>
    <body>  
            <!--navigation bar-->
            <nav class="navbar navbar-dark bg-dark">
                <div class = "container">
                    <a class="navbar-brand" href="index.php">
                        <img src="../img/elmtreelogo.png" width="30" height="30" class="d-inline-block align-top" alt="">
                        ElmTree
                    </a>
                    <div class="col-7">
                        <form class="form-inline my-2 my-lg-0">
                            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-dark text-light" type="submit">Search</button>
                        </form>
                    </div>
                    
                    <div class="col-auto">

                        <a class="btn btn-outline-dark text-light float-right" href="userhome.php" role="button" name="myitems">Profile</a>

                        <a class="btn btn-outline-dark text-light float-right" href="myitems.php" role="button" name="myitems">My Items</a>

                        <a class="btn btn-outline-dark text-light" href="additem.php" role="button">Sell Item</a>

                        <a class="btn btn-outline-dark text-light float-right" href="logout.php" role="button" name="destroy">Log out</a>

                    </div>

            </nav>
            

        
            <div class='container container-back'>
                <div class='row'>

                <h4>Item Successfully Updated</h4>

			 	<?php

 				if(!$result){
 					echo $conn->error;
 				}else{
                     echo "<p>Item Updated!</p>";
                     header("Location: userhome.php");
 				}
 				?>
	 		
	 		
                       
                </div>
            </div>
        
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>