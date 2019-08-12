<?php
    // connection to database
    include('conn.php');

    // read item table from database

    
   
    if(isset($_GET['itemid'])){
        $getid = $_GET['itemid'];
   

    $read = " SELECT item.itemID, item.itemName, item.itemImg, item.itemImg, item.itemPrice, item.itemDescription, item.dateAdded, item.userID, category.categoryName 
    FROM `item` 
    INNER JOIN
    category ON
    item.categoryID = category.categoryID WHERE itemID = '$getid' ";
  
    $result = $conn->query($read);

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
                <div class='container'>
                    <div class="row">
                        <a class="navbar-brand" align-middle href="index.php">
                            <img src="img/elmtreelogo.png" width="30" height="30"  alt="">
                            ElmTree
                        </a>
                        <div class="col-3.5 ">
                            <form class="form-inline my-2" action="search.php" method="post" enctype="multipart/form-data">
                                <input class="form-control-sm" type="search" name="search" placeholder="Search" aria-label="Search">
                                <button class="btn btn-outline-dark text-light" type="submit" name="submit-search">Search</button>
                            </form>
                        </div>

                        <div class="col-4.5 inline">

                            <form class="form-inline my-2 " action="sign.php" method="post" enctype="multipart/form-data">
                                    
                                    <input class="form-control-sm"  name="userfield" type="text" placeholder="Username">          
                                
                                    <input class="form-control-sm" name="passfield" type="password" placeholder="Password">
                                            
                                    <button type="submit" class="btn btn-outline-dark text-light" name="login">Log In</button>
                            </form>

                            
                   
                            <?php
                            
                                if(isset($_SESSION['40247362_userID']) && !empty($_SESSION['40247362_userID']) ){
                                
                                echo "<a class='btn btn-outline-dark text-light' href='logout.php' role='button'>Log out</a>
                                ?>";
                                }
                            ?>
                        </div>

                        <div class='col-1.5'>
                                <a class="btn btn-outline-dark text-light align-middle" href="register.php" role="button">Register</a>
                            </div>

                            

                        
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
                        //get product id from row 'id'
                        $itemid = $row['itemID'];
                        //get product image from row 'itemImg'
                        $itemimg = $row['itemImg'];
                        //get product name from row 'itemName'
                        $itemname = $row['itemName'];
                        //get product price from row 'itemPrice'
                        $itemprice = $row['itemPrice'];
                        //get date added row 'dateAdded'
                        $dateAdded = $row['dateAdded'];
                            // change format to dmy
                            $dateAdded = date('d-m-Y', strtotime($dateAdded));
                        // get product description form row 'itemDescription'
                        $itemDescription = $row['itemDescription'];
                        $itemCategory = $row['categoryName'];

                        $userID = $row['userID'];
                        
                        echo " <div class='row columnitem'> 
                                    <div class='col-4' float-right>
                                      
                                        <img src='upload/$itemimg' class='img-fluid' alt='Responsive image'/>
                                    </div>
                                    <div class='col-8' infocol>
                                        <div>
                                            <br>
                                            <p><h4>$itemname</h4></p>
                                            <p> Price: &pound$itemprice</p>
                                            <p> Date added: $dateAdded</p>
                                            <p> Description: $itemDescription</p>
                                            <p> Category: $itemCategory</p>
                                        </div>
                                        <div>
                                        <a class='btn btn-dark' href='user.php?userID=$userID' role='button'>Contact Seller</a>
                                    </div>
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