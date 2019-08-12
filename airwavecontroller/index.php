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
    <body class="bg-dark text-white">
                  
            <div class="container" style= "text-align: center" >
                       <!--Logo for app-->
                       <div class="row justify-content-center text-center mt-3">
                            <img src="img/logo.png" width="250" height="250" style= "text-align: center" alt="AirWave">
                        </div>
                    
                        <h3>Airwave Controller</h3>

                        
                            <form action='signinprocess.php' method='post' enctype='multipart/form-data'>

                                     
                                      <input type="text" class="form-control" id="exampleInputEmail1" name='name' aria-describedby="emailHelp" placeholder="Stage">
                                      <small id="emailHelp" class="form-text text-muted">Please enter a valid Stage Log in</small>
                                      <label for="exampleInputPassword1">Password</label>
                                      <input type="password" class="form-control" id="exampleInputPassword1" name='password' placeholder="Password">
                                      <button type="submit" class="btn btn-light mt-2" >Submit</button>

                                
                            </form>
                        
                                 
            </div>

            
                    
                    
          
          
    

    
                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script> -->
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            
        </body>
</html>