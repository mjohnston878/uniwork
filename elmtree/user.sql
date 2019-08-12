-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 02, 2019 at 09:01 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.0.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mjohnston77`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userID` int(11) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `uName` varchar(150) NOT NULL,
  `userPhone` varchar(150) NOT NULL,
  `userImage` varchar(150) NOT NULL DEFAULT 'tempuserimage.jpg',
  `userEmail` varchar(100) NOT NULL,
  `pw` varchar(100) NOT NULL,
  `twitter` varchar(100) NOT NULL,
  `universityID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `userName`, `uName`, `userPhone`, `userImage`, `userEmail`, `pw`, `twitter`, `universityID`) VALUES
(1, 'will123', 'William Wright', '07922646109', 'person.jpg', 'will@email.com', '1234', '@will123', 1),
(2, 'matt123', 'Paul Scott', '07875498027', 'person.jpg', 'paul@email.com', '12345', '@pauls', 1),
(3, 'test2', 'john smith', '07542598434', 'person.jpg', 'js@email.com', 'password', '@johnsmith', 2),
(4, 'test3', 'spiderman', '02825649213', 'person.jpg', 'pg@gmail.com', 'password123', '@spiderman', 1),
(5, 'mattjohnston', 'Matt Johnston', '07822446653', 'profile.jpg', 'mjohnston77@qub.ac.uk', 'password', '@mattj', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`),
  ADD KEY `FK_universityID` (`universityID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK_universityID` FOREIGN KEY (`universityID`) REFERENCES `university` (`universityID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
