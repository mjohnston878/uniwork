<?php

$pw = "PZnLBltzc4bkhVP1";

$user = "mjohnston77";

$webserver = "mjohnston77.lampt.eeecs.qub.ac.uk";

$db = "mjohnston77";

$conn = new mysqli($webserver, $user, $pw, $db);

if ($conn->connect_error) {
  echo "Connection failed: ". $conn->connect_error;
}
