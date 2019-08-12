<!--Airwave Fesival App by Matthew Johnston Student no 40247362-->

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
    
    <script>
    $(function() {
    
            // ajax call for Monster Energy Stage
            $.ajax({
                type: "GET",
                url: "http://mjohnston77.lampt.eeecs.qub.ac.uk/Airwave/Airwave/www/processschedule.php?stageID=1",
                success: function(data){
                    console.log(data)

                    var result = $.parseJSON(data);

                    string = ' ';
                    
                    //schedule table joins to stage table and artist table on each of the corrosponding id's
                    //loop through schedule table where the stage id matches the id passed through the url to the processschdule page printing it once as a header
                    $.each( result, function( key, value ) {
                          // amend string value to print stage name with html
                          string += "<div class= 'p-3 mb-2 bg-secondary text-white artistbox' style= 'text-align: center'><h1>"+value['stage']+"</h1>"
                              return false;      // break out of loop      
                    });
                    string += "<br>"

                    // loop through schedule table returning artist names and stage time information where the stage id matches the id passed through the url
                    $.each( result, function( key, value ) { 
                       
                         // apply css to div
                        string += "<div class = 'graybackground'>"
                        
                        // print out information on each artist realing to the above stage
                        string += "<h3>"+value['name'] + "</h3><p>"+value['startTime']+" - "+value['endTime']+"</p> ";
                        // get artistID and new start time and send to php processing page
                        string += "<div class='row justify-content-center text-center mb-3'><form class='form-inline my-2' action='processupdate.php' method='get'>"
                                // adds value of artistID as an input to form
                                string += "<input class='form-control' name= 'artistID' value='"+value['artistID']+"'type='hidden'>";
                                // adds the input of type time
                                string += "<input class='form-control-sm'  name='newtime' type='time' placeholder='New Start Time'>";
           
                                string += "<button type='submit' class='btn btn-light btn-sm text-dark ml-3'>Update</button>";
                                
                        string += "</form></div>";


                        // close div
                        string += "</div>"
                    });

                    string += "</div>"
                    

                $("#schedule").html(string);

                }
            }); 

            // ajax call for Jagermeister Stage
            $.ajax({
                type: "GET",
                url: "http://mjohnston77.lampt.eeecs.qub.ac.uk/Airwave/Airwave/www/processschedule.php?stageID=2",
                success: function(data){
                    console.log(data)

                    var result = $.parseJSON(data);

                    string = ' ';
                    
                    //schedule table joins to stage table and artist table on each of the corrosponding id's
                    //loop through schedule table where the stage id matches the id passed through the url to the processschdule page printing it once as a header
                    $.each( result, function( key, value ) {
                          // amend string value to print stage name with html
                          string += "<div class= 'p-3 mb-2 bg-secondary text-white artistbox' style= 'text-align: center'><h1>"+value['stage']+"</h1>"
                              return false;      // break out of loop      
                    });

                    string += "<br>"
                    
                    // loop through schedule table returning artist names and stage time information where the stage id matches the id passed through the url
                    $.each( result, function( key, value ) {      
                        // apply css to div
                        string += "<div class = 'graybackground'>"
                        
                        // print out information on each artist realing to the above stage
                        string += "<h3>"+value['name'] + "</h3><p>"+value['startTime']+" - "+value['endTime']+"</p> ";
                        // get artistID and new start time and send to php processing page
                        string += "<div class='row justify-content-center text-center mb-3'><form class='form-inline my-2' action='processupdate.php' method='get'>"
                                // adds value of artistID as an input to form
                                string += "<input class='form-control' name= 'artistID' value='"+value['artistID']+"'type='hidden'>";
                                // adds the input of type time
                                string += "<input class='form-control-sm'  name='newtime' type='time' placeholder='New Start Time'>";
           
                                string += "<button type='submit' class='btn btn-light btn-sm text-dark ml-3'>Update</button>";
                                
                        string += "</form></div>";


                        // close div
                        string += "</div>" 
                        
                        
                    });

                    string += "</div>"

                    $("#schedule2").html(string);

                }
            }); 

            // ajax call for Impericon stage
            $.ajax({
                type: "GET",
                url: "http://mjohnston77.lampt.eeecs.qub.ac.uk/Airwave/Airwave/www/processschedule.php?stageID=3",
                success: function(data){
                    console.log(data)

                    var result = $.parseJSON(data);

                    string = ' ';
                    
                    //schedule table joins to stage table and artist table on each of the corrosponding id's
                    //loop through schedule table where the stage id matches the id passed through the url to the processschdule page printing it once as a header
                    $.each( result, function( key, value ) {
                          // amend string value to print stage name with html
                          string += "<div class= 'p-3 mb-2 bg-secondary text-white artistbox' style= 'text-align: center'><h1>"+value['stage']+"</h1>"
                              return false;      // break out of loop      
                    });

                    string += "<br>"
                    
                    // loop through schedule table returning artist names and stage time information where the stage id matches the id passed through the url
                    $.each( result, function( key, value ) {      
                       // apply css to div
                       string += "<div class = 'graybackground'>"
                        
                        // print out information on each artist realing to the above stage
                        string += "<h3>"+value['name'] + "</h3><p>"+value['startTime']+" - "+value['endTime']+"</p> ";
                        // get artistID and new start time and send to php processing page
                        string += "<div class='row justify-content-center text-center mb-3'><form class='form-inline my-2' action='processupdate.php' method='get'>"
                                // adds value of artistID as an input to form
                                string += "<input class='form-control' name= 'artistID' value='"+value['artistID']+"'type='hidden'>";
                                // adds the input of type time
                                string += "<input class='form-control-sm'  name='newtime' type='time' placeholder='New Start Time'>";
           
                                string += "<button type='submit' class='btn btn-light btn-sm text-dark ml-3'>Update</button>";
                                
                        string += "</form></div>";


                        // close div
                        string += "</div>"         
                    });

                    string += "</div>"

                $("#schedule3").html(string);



                }
            }); 

            // ajax call for marshall stage
            $.ajax({
                type: "GET",
                url: "http://mjohnston77.lampt.eeecs.qub.ac.uk/Airwave/Airwave/www/processschedule.php?stageID=4",
                success: function(data){
                    console.log(data)

                    var result = $.parseJSON(data);

                    string = ' ';
                    
                    //schedule table joins to stage table and artist table on each of the corrosponding id's
                    //loop through schedule table where the stage id matches the id passed through the url to the processschdule page printing it once as a header
                    $.each( result, function( key, value ) {
                          // amend string value to print stage name with html
                          string += "<div class= 'p-3 mb-2 bg-secondary text-white artistbox' style= 'text-align: center'><h1>"+value['stage']+"</h1>"
                              return false;      // break out of loop      
                    });

                    string += "<br>"
                    
                    // loop through schedule table returning artist names and stage time information where the stage id matches the id passed through the url
                    $.each( result, function( key, value ) {      
                        // apply css to div
                        string += "<div class = 'graybackground'>"
                        
                        // print out information on each artist realing to the above stage
                        string += "<h3>"+value['name'] + "</h3><p>"+value['startTime']+" - "+value['endTime']+"</p> ";
                        // get artistID and new start time and send to php processing page
                        string += "<div class='row justify-content-center text-center mb-3'><form class='form-inline my-2' action='processupdate.php' method='get'>"
                                // adds value of artistID as an input to form
                                string += "<input class='form-control' name= 'artistID' value='"+value['artistID']+"'type='hidden'>";
                                // adds the input of type time
                                string += "<input class='form-control-sm'  name='newtime' type='time' placeholder='New Start Time'>";
           
                                string += "<button type='submit' class='btn btn-light btn-sm text-dark ml-3'>Update</button>";
                                
                        string += "</form></div>";


                        // close div
                        string += "</div>"      
                    });

                    string += "</div>"


                $("#schedule4").html(string);


                }
            }); 

 
    });
    
    </script>
    <title>Update Schedule</title>
</head>
<body>
    <!--body colour set to dark creating a dark mode design-->
    <body class="bg-dark text-white">
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
            

            <div class="container" style= "text-align: center" >
                      <div class="row justify-content-center text-center mt-3">
                        <img src="img/schedule.gif" width="200" height="130" style= "text-align: center" alt="Schedule">
                    </div>  
                    <h3>Update Stage Start Times</h3> 
                        <br>
                    <div id='schedule'></div>
                    <div id='schedule2'></div>
                    <div id='schedule3'></div>
                    <div id='schedule4'></div>
                                               
            </div>
            
    
                <!-- Optional JavaScript -->
                <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
                <script type="text/javascript">
                    alert("Please update start times using HH:MM format");
                    </script>
        </body>
</html>