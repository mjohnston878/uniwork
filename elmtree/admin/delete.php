<?php

    session_start();
    
    include('../conn.php');

    if(isset($_GET['itemid'])){
        $getid = $_GET['itemid'];
   

    $read = "DELETE FROM item WHERE itemID='$getid'";
  
    $result = $conn->query($read);

    header('location: myitems.php');

    }

?>