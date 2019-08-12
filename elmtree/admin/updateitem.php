<?php

    session_start();
    
    

    // connection to database

   include('../conn.php');

    // read item table from database
    $read = "SELECT * FROM item";
  
    $result = $conn->query($read);

    $ID = $_GET['itemid'];
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
                    <div class="row">
                    <a class="navbar-brand" href="../index.php">
                        <img src="../img/elmtreelogo.png" width="30" height="30"  alt="">
                        ElmTree
                    </a>
                 

                    <div class="col-auto">

                            <a class="btn btn-outline-dark text-light float-right" href="myitems.php" role="button" name="myitems">My Items</a>

                            <a class="btn btn-outline-dark text-light" href="additem.php" role="button">Sell Item</a>

                            <a class="btn btn-outline-dark text-light float-right" href="logout.php" role="button" name="destroy">Log out</a>
                        
                    </div>

                    
                    
                </div>
                   
                </div>

            </nav>
            

        
            <div class='container container-back'>
                    <div class='col-10 columnitem'> 
                            <form name="updateprocess" method="POST" action="updateprocess.php" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="form-group col-6">
                                        <label for="itemName">Name</label> 
                                        <input class="form-control" type="text" name="itemName" required="required" placeholder="Name of item"/>
                                    </div>
                                </div>
                            
                                <div class="row">
                                    <div class="form-group col-6">
                                        <label for="itemPrice">Price</label> 
                                        <input class="form-control" type="text" name="itemPrice" placeholder="Price of item"/>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="form-group col-6">
                                        <label for="itemdescription">Description</label>
                                        <input class="form-control" name="itemdescription" type="text" required="required" rows="5" placeholder="Description">
                                    </div> 
                                </div>
                                
                                <div class="row">
                                    <div class="form-group col-6">
                                        <label for="itemCategory">Catagory</label>
                                            <select class="form-control" name="itemcategory" id="itemcategory">
                                                <option value="1">Art & Collectables</option>
                                                <option value="2">Electronics</option>
                                                <option value="3">Fashion & Accessories</option>
                                                <option value="4">Health & Beauty</option>
                                                <option value="5">Home & Garden</option>
                                                <option value="6">Miscellaneous </option>
                                                <option value="7">Music</option>
                                                <option value="8">Sport & Fitness</option>
                                            </select>
                                    </div>
                                </div>
                                
                                <div class="row">
                                    <div class="form-group col-4">
                                        <label for="itemImage">Image</label>
                                        <input type="file" class="form-control-file" name="image" id="image">
                                        
                                    </div>

                                    <div class="form-group col-4" style="display: none;">
                                        <label for="itemImage">Image</label>
                                        <input type="text" class="form-control-file" name="itemid" id="itemid" value=<?php echo "'$ID'"; ?>>
                                        
                                    </div>

                                    <div class="form-group col-2">
                                        <button name="submit-item" id="submit" type="submit" class="btn btn-dark">Add Item</button>	
                                    </div>
                                
                                   
                                </div>
                                
                                		
                            </form>
                    </div> 
            </div>
        
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>