
<?php

// connect to database
include('conn.php');

// retriving search from url using GET method
$getsearchid = mysqli_real_escape_string($conn, $_GET['submit-search']);

// read from artist where name or similarArtists is similar to search
$read = "SELECT * 
FROM artist 
WHERE artist.name 
LIKE '%$getsearchid%' 
OR artist.similarArtists 
LIKE '%$getsearchid%'";

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