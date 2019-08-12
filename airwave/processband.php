
<?php

// connect to database
include('conn.php');

// retriving artistID from url using GET method
$getid = $_GET['artistID'];

// read from artist table joined to genre on genreID where artistID is equal to the id passed though the url
$read = "SELECT schedule.scheduleID, artist.name, stage.stage, schedule.startTime, schedule.endTime, artist.artistID, artist.img, artist.similarArtists, artist.spotify, artist.twitter, genre.genre
FROM `schedule` 
INNER JOIN 
artist 
ON
schedule.artistID = artist.artistID 
INNER JOIN 
stage 
ON 
schedule.stageID = stage.stageID
INNER JOIN
genre
ON
artist.genreID = genre.genreID
WHERE
artist.artistID = $getid ";

 

$result = $conn->query($read);

	if(!$result){
	 echo $conn->error;	// error handling.
    }

    // create an array
    $dataresult = array();
    
    // loop through results and add them to the array
    while($row = $result->fetch_assoc()){
        
        array_push($dataresult, $row);
     
    }
    
    // Returns a string containing the JSON representation of the supplied value.
    echo json_encode($dataresult);


?>