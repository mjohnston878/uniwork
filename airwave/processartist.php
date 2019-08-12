<?php



// connect to database
include('conn.php');

// read from artist where festivalID is equal to one sorted alphabetically by artist name
$read = "SELECT * FROM artist WHERE festivalID = '1' ORDER BY `artist`.`name` ASC";

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