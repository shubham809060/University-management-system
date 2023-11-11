SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone="+00:00";

CREATE TABLE  `attendance_student`(
    `rollno` varchar(30) NOT NULL,
    `Date` varchar(30) NOT NULL,
    `first` varchar(30) NOT NULL,
    `second` varchar(30) NOT  NULL
)
ENGINE =InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `attendance_student`(`rollno`,`Date`,`first`,`second`) VALUES
('15333347', 'Fri Mar 11 16:42:48 CST 2022', 'Present', 'Present');


CREATE TABLE `attendance_teacher` (
  `emp_id` varchar(30) NOT NULL,
  `Date` varchar(30) NOT NULL,
  `first` varchar(30) NOT NULL,
  `second` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `fee` (
  `rollno` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `fathers_name` varchar(50) NOT NULL,
  `course` varchar(30) NOT NULL,
  `branch` varchar(20) NOT NULL,
  `semester` varchar(30) NOT NULL,
  `fee_paid` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `fee` (`rollno`, `name`, `fathers_name`, `course`, `branch`, `semester`, `fee_paid`) VALUES
('15333347', 'Angel Jude Suarez', 'Michael Suarez', 'B.Tech', 'Mechanical', '1st', '1000');


CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');


CREATE TABLE `marks` (
  `rollno` varchar(50) NOT NULL,
  `marks1` varchar(50) NOT NULL,
  `marks2` varchar(50) NOT NULL,
  `marks3` varchar(50) NOT NULL,
  `marks4` varchar(50) NOT NULL,
  `marks5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



CREATE TABLE `student` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `class_x` varchar(30) NOT NULL,
  `class_xii` varchar(30) NOT NULL,
  `aadhar` varchar(30) NOT NULL,
  `rollno` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `branch` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `student` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `aadhar`, `rollno`, `course`, `branch`) VALUES
('Angel Jude Suarez', 'Michael Suarez', '26', '11/02/1996', 'Himamaylan City', '09272777334', 'suarez@gmail.com', '90', '90', '100', '15333347', 'Bsc', 'Civil');


CREATE TABLE `subject` (
  `rollno` varchar(30) NOT NULL,
  `subject1` varchar(50) NOT NULL,
  `subject2` varchar(50) NOT NULL,
  `subject3` varchar(50) NOT NULL,
  `subject4` varchar(50) NOT NULL,
  `subject5` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `teacher` (
  `name` varchar(250) NOT NULL,
  `fathers_name` varchar(250) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(30) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `class_x` varchar(30) NOT NULL,
  `class_xii` varchar(30) NOT NULL,
  `aadhar` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `emp_id` varchar(20) NOT NULL,
  `dep` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


ALTER TABLE `login`
ADD PRIMARY KEY(`id`);



 ALTER TABLE `login`
 MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
 COMMIT;
