
<?php

// connect to database
include('conn.php');

// retriving stageID from url using GET method
$getstageid = $_GET['stageID'];

// read from schedule table joined to artist and stage on their ID's where the stageID is equal to the id passed in by the get method
$read = "SELECT schedule.scheduleID, artist.name, stage.stageID, stage.stage, schedule.startTime, schedule.endTime, artist.artistID
FROM `schedule` 
INNER JOIN 
artist 
ON
schedule.artistID = artist.artistID 
INNER JOIN 
stage 
ON 
schedule.stageID = stage.stageID
WHERE
stage.stageID = '$getstageid'";

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