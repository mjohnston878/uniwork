<?php
    // connection to database
    include('conn.php');

    // read item table from database
    $read = "SELECT * FROM item";
  
    $result = $conn->query($read);
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
                    <a class="navbar-brand" href="index.php">
                        <img src="img/elmtreelogo.png" width="30" height="30"  alt="">
                        ElmTree
                    </a>
                    <div class="col-auto">
                        <form class="form-inline my-2 my-sm-2">
                            <input class="form-control-sm mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-dark text-light" type="submit">Search</button>
                        </form>
                    </div>

                    <div class="col-auto">

                    
                            <a class="btn btn-outline-dark text-light" href="register.php" role="button">Register</a>
                   
                            <a class="btn btn-outline-dark text-light float-right" href="logout.php" role="button">Log out</a>
                        
                    </div>

                    
                    
                </div>
                   
                </div>

            </nav> 
            <!--End of navigation bar-->
            <div class='container container-back'>
                <div class='col-8 columnitem'> 
                    <form action="registerprocess.php" method="post" enctype="multipart/form-data">
                        <div class="row">
                            <div class="form-group col-6">
                                <input  id="userfield" name="userfield" type="text" class="form-control" maxlength="50" required="required" value="" placeholder="Username">
                                </div>
                           
                            <div class="form-group col-6">
                                <input id="emailfield" name="emailfield" type="email" class="form-control" maxlength="70" required="required" placeholder="Email">
                            </div>
                        </div>

                        <div class="row">
                            <div class="form-group col-6">
                                <input id="namefield" name="namefield" type="text" class="form-control"  required="required"  placeholder="Name">
                            </div>
                            <div class="form-group col-6">
                                <input  id="phonefield" name="phonefield" type="text" class="form-control" maxlength="50" required="required" value="" placeholder="Phone Number">
                                </div>
                        </div>

                        <div class="row">
                            <div class="form-group col-6">
                                
                                <select class="form-control" name="universityfield" id="universityfield" placeholder="University">
                                <option value="1">Queens University</option>
                                <option value="2">Ulster University</option>
                                </select>
                            </div>
                        </div>

                        <div class="row">
                            <div class="form-group col-6">
                                <input id="twitterfield" name="twitterfield" type="text" class="form-control" maxlength="50" placeholder="Twitter @name">
                            </div>
                        </div>
                        <div class="row">
                            <div class="form-group col-6">
                                <label for="profilepicture">Upload Profile Image</label>
                                <input type="file" class="form-control-file" name="image" id="image">
                            </div>
                        </div>
                        <div class="row">                           
                            <div class="form-group col-6">
                                <input  id="passfield" name="passfield" type="password" class="form-control" maxlength="50" required="required" value="" placeholder="Password">
                            </div>
                           
                            <div class="form-group col-6">
                                <input  id="passfield" name="passfield-repeat" type="password" class="form-control" maxlength="50" required="required" value="" placeholder="Verify Password">
                            </div>
                        </div> 
                        
                        <button name="register-submit" id="submit" type="submit" class="btn btn-dark">Register</button>
                    </form>
                </div>
            </div>
   


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>