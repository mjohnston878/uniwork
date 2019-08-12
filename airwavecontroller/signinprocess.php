<?php
session_start();
include("conn.php");


    // get users login and store as variables
    $username = $conn->real_escape_string($_POST['name']);
    $password = $conn->real_escape_string($_POST['password']);

    //query database for user table where login matches
    $checkuser="SELECT * FROM admin WHERE name='$username' AND password='$password'";
    $result = $conn->query($checkuser);
    $row = $result->fetch_assoc();

    if(!$result) {
        echo $conn->error;
    }
    // get number of returned rows
    $rows = $result->num_rows;
    // if user exists start session
    if($rows > 0) {
       
        $_SESSION['adminID'] = $row['adminID']; 
        $_SESSION['name'] = $row['name'];

        echo "logged in";

        header("Location: schedule.php");
    }else{

        echo "not allowed";
        header("Location: index.php");
    }


?>