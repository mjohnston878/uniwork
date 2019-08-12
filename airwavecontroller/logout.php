<?php

session_start();

if (isset($_POST["name"])) {
    session_unset();
   
}
header("Location: index.php");
?>

