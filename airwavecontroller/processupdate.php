
<?php

// connect to database
include('conn.php');

// retriving artistID and new start time from url using GET method
$gettime = rawurldecode($_GET['newtime']);
$getartistid = rawurldecode($_GET['artistID']);

// update startTime in schedule table where artistID matches the one passed thought the url
$read = "UPDATE schedule
SET startTime = '$gettime'
WHERE artistID = '$getartistid'";

 

$result = $conn->query($read);

	if(!$result){
	 echo $conn->error;	// error handling.
    }

    header("Location:schedule.php")


?>