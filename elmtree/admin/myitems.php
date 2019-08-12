<?php

    session_start();
    
        include('../conn.php');

        $userName = $_SESSION['40247362_userName'];
        $userID = $_SESSION['40247362_userID'];
       

        if (!isset($userName)) {
		    header("Location:../index.php");
        } else {
	       echo "$userName";
        }

        if (isset($_POST["destroy"])) {
	        session_unset();
	        header("Location:../index.php");
        }

        

        $read = "SELECT * FROM item WHERE userID = '$userID' ";
      
        $result = $conn->query($read);
            if(!$result){
                echo $conn->error;
            }

?>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link  rel="stylesheet" href="../styles/gui.css" type="text/css">
        <title>Elm Tree - Student Buy & Sell</title>
        <link rel="icon" href="../favicon.ico">
    </head>
    <body>  
            <!--navigation bar-->
            <nav class="navbar navbar-dark bg-dark">
                <div class = "container">
                    <div class="row">
                    <a class="navbar-brand" href="../index.php">
                        <img src="../img/elmtreelogo.png" width="30" height="30"  alt="">
                        ElmTree
                    </a>
                 

                    <div class="col-auto">

                        <a class="btn btn-outline-dark text-light float-right" href="userhome.php" role="button" name="myitems">Profile</a>

                        <a class="btn btn-outline-dark text-light float-right" href="myitems.php" role="button" name="myitems">My Items</a>

                        <a class="btn btn-outline-dark text-light" href="additem.php" role="button">Sell Item</a>

                        <a class="btn btn-outline-dark text-light float-right" href="logout.php" role="button" name="destroy">Log out</a>

                    </div>

                    
                    
                </div>
                   
                </div>

            </nav>
            
            
            
             
                   

             <div class='container col-10'>


                    <?php

                        echo "<h2> Welcome $userName. Once you have sold an item, please delete it. </h2>";

                        

                        
                                while ($row=$result->fetch_assoc()){
                                //get item id from row 'id'
                                $itemid = $row['itemID'];
                                //get product image from row 'itemImg'
                                $itemimg = $row['itemImg'];
                                //get product name from row 'itemName'
                                $itemname = $row['itemName'];
                                //get product price from row 'itemPrice'
                                $itemprice = $row['itemPrice'];
                                echo " <div class='row'>   
                                            <div class='col'>
                                                <p><h3>$itemname</h3></p>
                                            </div>
                                            <div class='col'>
                                            </div>
                                            <div class='col'>
                                            <a class='btn btn-dark' href='updateitem.php?itemid=$itemid' role='button'>Edit</a>
                                                <a class='btn btn-dark' href='delete.php?itemid=$itemid' role='button'>Delete</a>
                                            </div>
                                    
                                  </div> ";
                                }   
                       

                        ?>

            </div>
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>