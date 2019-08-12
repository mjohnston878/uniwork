<?php
        $host = "mjohnston77.lampt.eeecs.qub.ac.uk";
        $user = "mjohnston77";
        $pw = "PZnLBltzc4bkhVP1";
        $db = "mjohnston77";
 
        $conn = new mysqli($host, $user, $pw, $db);
 
        if($conn->connect_error) {
          echo "Failed to connect to MySQL: " . $conn->connect_error;
        }
 