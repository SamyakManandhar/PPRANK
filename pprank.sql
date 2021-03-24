-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2018 at 02:35 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pprank`
--

-- --------------------------------------------------------

--
-- Table structure for table `friend`
--

CREATE TABLE `friend` (
  `fromusername` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `auth` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `friend`
--

INSERT INTO `friend` (`fromusername`, `username`, `email`, `phone_number`, `auth`) VALUES
('user1', 'user2', 'da@gmail.com', '8892056022', 1),
('user3', 'user2', 'da@gmail.com', '8892056022', 1),
('user1', 'user3', 'dk@gmail.com', '9066869301', 1),
('user4', 'user2', 'da@gmail.com', '8892056022', 1),
('user5', 'user2', 'da@gmail.com', '8892056022', 1),
('user1', 'user5', 'gari@g.com', '9066869301', 1),
('user1', 'user4', 'ds@gmail.com', '789280038', 0),
('user2', 'user1', 'dg@gmail.com', '9066869301', 0),
('user2', 'user3', 'dk@gmail.com', '9066869301', 0),
('user2', 'user4', 'ds@gmail.com', '789280038', 0),
('user2', 'user5', 'gari@g.com', '9066869301', 1),
('user3', 'user1', 'dg@gmail.com', '9066869301', 0);

-- --------------------------------------------------------

--
-- Table structure for table `pricerecommendfriend`
--

CREATE TABLE `pricerecommendfriend` (
  `fromusername` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pricerecommendfriend`
--

INSERT INTO `pricerecommendfriend` (`fromusername`, `username`, `productname`, `description`, `date`, `category`, `price`) VALUES
('user1', 'user2', 'lenovo', 'smartphone', '2017-12-02', 'Electronics', '20000');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productname` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productname`, `description`, `date`, `category`, `price`) VALUES
('ponds', 'cosmetics for winter', '2018-04-05', 'Cosmetics', '500'),
('lenovophone', 'it is nice smartphone', '2018-04-04', 'Electronics', '8000'),
('bag', 'stationary abg', '2018-04-05', 'Stationary', '250'),
('hplaptop', 'a good laptop', '2018-04-25', 'Electronics', '50,000'),
('pencil', 'used for writing', '2018-04-19', 'Stationary', '10'),
('Harry potter book', 'great book', '2018-04-18', 'Books', '250'),
('TWO STATES', 'chethan bhagat novel', '2018-04-26', 'Books', '500'),
('vaseline', 'a petroleum jelly', '2018-04-19', 'Cosmetics', '50'),
('fair and lovely', 'fairness cream', '2018-04-25', 'Cosmetics', '500'),
('bajaj almonds oil', 'its an oil shampoo', '2018-04-27', 'Cosmetics', '700'),
('lenovolaptop', 'great batterybackup', '2018-04-27', 'Electronics', '45000'),
('natarajpencil', 'used for writing', '2018-04-24', 'Stationary', '15'),
('classmatenotebook', 'notebook where notes are written', '2018-04-26', 'Stationary', '35'),
('chartpapers', 'used for creative drawing', '2018-05-01', 'Stationary', '15'),
('3 mistakes of my life', 'book by chethan bhagat', '2018-04-25', 'Books', '500'),
('The Alchemist', 'paul coelho book', '2018-04-19', 'Books', '250'),
('The White Tiger', 'book ', '2018-04-27', 'Books', '450'),
('LG GOLD', 'Refrigerator', '2018-04-29', 'Electronics', '25000'),
('SONY TV', 'TV to watch', '2018-05-19', 'Electronics', '25000'),
('vaselinebodylotion', 'keeps your skin soft', '2018-04-30', 'Cosmetics', '250'),
('dettolhandwash', 'handwash for cleansing', '2018-04-27', 'Cosmetics', '45'),
('TWILIGHT:THE DARK SAGA', 'awesome novel', '2018-04-25', 'Books', '780');

-- --------------------------------------------------------

--
-- Table structure for table `productrating`
--

CREATE TABLE `productrating` (
  `productname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `rating` int(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `message` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productrating`
--

INSERT INTO `productrating` (`productname`, `username`, `rating`, `title`, `message`, `date`) VALUES
('lenovo', 'user1', 3, 'Nice', 'very good', '2018-04-10'),
('ponds', 'user3', 4, 'good', 'excellent', '2018-04-12'),
('ponds', 'user3', 4, 'good', 'excellent', '2018-04-12'),
('fair and lovely', 'user2', 3, 'nice', 'A VERY GOOD COSMETIC', '2018-05-02'),
('Harry potter book', 'user2', 5, 'EXCELLENT BOOK', 'AWESOME NOVEL.....WAT A MASTERPIECE', '2018-05-01');

-- --------------------------------------------------------

--
-- Table structure for table `recommendfriend`
--

CREATE TABLE `recommendfriend` (
  `fromusername` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  `auth` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `recommendfriend`
--

INSERT INTO `recommendfriend` (`fromusername`, `username`, `productname`, `description`, `date`, `category`, `price`, `auth`) VALUES
('user1', 'user2', 'ponds', 'cosmetics for winter', '2018-04-05', 'Cosmetics', '500', 1),
('user2', 'user1', 'lenovophone', 'it is nice smartphone', '2018-04-04', 'Electronics', '8000', 1),
('user3', 'user1', 'bag', 'stationary abg', '2018-04-05', 'Stationary', '250', 0);

-- --------------------------------------------------------

--
-- Table structure for table `usersignup`
--

CREATE TABLE `usersignup` (
  `username` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `hobbies` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `auth` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usersignup`
--

INSERT INTO `usersignup` (`username`, `firstname`, `lastname`, `phone_number`, `email`, `hobbies`, `location`, `password`, `auth`) VALUES
('user1', 'abhay', 'a', '9066869301', 'dg@gmail.com', 'Reading', 'Bangalore', '123', 1),
('user2', 'sam', 'k', '8892056022', 'da@gmail.com', 'Dancing', 'Mumbai', '123', 1),
('user3', 'gari', 'd', '9066869301', 'dk@gmail.com', 'Swimming', 'Chennai', '123', 1),
('user4', 'asma', 'banu', '789280038', 'ds@gmail.com', 'Adventure', 'Bangalore', '123', 1),
('user5', 'seema', 'singh', '9066869301', 'gari@g.com', 'Reading', 'Mumbai', '123', 1),
('user6', 'aaa', 'a', '9066869301', 'dg@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user7', 'abhay', 's', '9066869301', 'dg@gmail.com', 'Dancing', 'Mumbai', '456', 0),
('user8', 'varun', 'a', '9066869301', 'dg@gmail.com', 'Adventure', 'Bangalore', '456', 0),
('user9', 'maithli', 'k', '8553635248', 'gari@g.com', 'Reading', 'Chennai', '456', 0),
('user10', 'krupa', 'nk', '7822548935', 'km@gmail.com', 'Swimming', 'Bangalore', '123', 0),
('user12', 'a', 'a', '9066869301', 'dg@gmail.com', 'Reading', 'Bangalore', '123', 0),
('user14', 'a', 'a', '9066869301', 'dg@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user15', 'varun', 'a', '9066869301', 'dg@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user15', 'vatan', 'a', '9066869301', 'dg@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user16', 'aishk', 'GARIMA', '9066869301', 'gari@gmail.com', 'Adventure', 'Bangalore', '123', 0),
('user17', 'a', 'a', '9066869301', 'dg@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user18', 'meena', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user19', 'a', 'a', '9066869301', 'dg@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user20', 'GARIMA', 'GARIMA', '9066869301', 'gari@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user21', 'kaira', 'GARIMA', '9066869301', 'gari@gmail.com', 'Reading', 'Chennai', '123', 0),
('user22', 'seema', 'GARIMA', '9066869301', 'gari@gmail.com', 'Reading', 'Chennai', '123', 0),
('user23', 'maira', 'a', '9066869301', 'dg@gmail.com', 'Adventure', 'Mumbai', '123', 0),
('user24', 'a', 'a', '9066869301', 'dg@gmail.com', 'Adventure', 'Chennai', '123', 0),
('user25', 'GARIMA', 'GARIMA', '9066869301', 'gari@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user26', 'GARIMA', 'GARIMA', '9066869301', 'gari@gmail.com', 'Reading', 'Mumbai', '123', 0),
('user27', 'shashank', 'GARIMA', '9066869301', 'gari@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user28', 'pooja', 'a', '9066869301', 'dg@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user29', 'rakesh', 'a', '9066869301', 'dg@gmail.com', 'Swimming', 'Bangalore', '123', 0),
('user30', 'shaamen', 'GARIMA', '9066869301', 'gari@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user31', 'prashanth', 'a', '9066869301', 'dg@gmail.com', 'Reading', 'Mumbai', '123', 0),
('user32', 'honey', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Bangalore', '123', 0),
('user33', 'ankit', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Bangalore', '123', 0),
('user34', 'asha', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user35', 'saroj', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Mumbai', '123', 0),
('user36', 'sureshpal', 'GARIMA', '9066869301', 'gari@gmail.com', 'Reading', 'Mumbai', '123', 0),
('user37', 'kiran', 'a', '9066869301', 'dg@gmail.com', 'Dancing', 'Mumbai', '123', 0),
('user38', 'adil', 'GARIMA', '9066869301', 'gari@gmail.com', 'Adventure', 'Bangalore', '123', 0),
('user39', 'aditya', 'GARIMA', '9066869301', 'gari@gmail.com', 'Swimming', 'Chennai', '123', 0),
('user40', 'reena', 'GARIMA', '9066869301', 'gari@gmail.com', 'Adventure', 'Bangalore', '123', 0);

-- --------------------------------------------------------

--
-- Table structure for table `vendorsignup`
--

CREATE TABLE `vendorsignup` (
  `username` varchar(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `phone_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendorsignup`
--

INSERT INTO `vendorsignup` (`username`, `firstname`, `lastname`, `phone_number`, `email`, `location`, `password`) VALUES
('vendor2', 'dsad', 'dfsfds', '8618369380', 'ad@g.com', 'Mumbai', '753'),
('vatan', 'dsad', 'dsfsd', '9066869301', 'dg@g.com', 'Bangalore', '123'),
('vendor1', 'abhay', 'a', '9066869301', 'dg@gmail.com', 'Mumbai', '123');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
