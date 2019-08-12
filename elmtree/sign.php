<?php
session_start();
include("conn.php");


    // get users login and store as variables
    $username = $conn->real_escape_string($_POST['userfield']);
    $password = $conn->real_escape_string($_POST['passfield']);

    //query database for user table where login matches
    $checkuser="SELECT * FROM user WHERE userName='$username' AND pw='$password'";
    $result = $conn->query($checkuser);
    $row = $result->fetch_assoc();

    if(!$result) {
        echo $conn->error;
    }
    // get number of returned rows
    $rows = $result->num_rows;
    // if user exists start session
    if($rows > 0) {
       
        $_SESSION['40247362_userID'] = $row['userID']; 
        $_SESSION['40247362_userName'] = $row['userName'];

        echo "logged in";

        header("Location: ../elmtree/admin/userhome.php");
    }else{

        echo "not allowed";
        header("Location: index.php");
    }


?>