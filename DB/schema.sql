CREATE DATABASE IF NOT EXISTS `seat`;
USE `seat`;

  
DROP TABLE IF EXISTS employee;     
DROP TABLE IF EXISTS seatingchart;   

CREATE TABLE `seatingchart`(
`floor_seat_seq` INT PRIMARY KEY AUTO_INCREMENT,
`floor_no` VARCHAR(3)  NOT NULL,
`seat_no` VARCHAR(5)   NOT NULL
);

INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '1樓', '座位1');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '1樓', '座位2');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '1樓', '座位3');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '1樓', '座位4');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '2樓', '座位1');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '2樓', '座位2');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '2樓', '座位3');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '2樓', '座位4');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '3樓', '座位1');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '3樓', '座位2');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '3樓', '座位3');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '3樓', '座位4');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '4樓', '座位1');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '4樓', '座位2');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '4樓', '座位3');
INSERT INTO`seatingchart`(`floor_no`, `seat_no`)VALUES( '4樓', '座位4');




CREATE TABLE `employee`(
`emp_id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
`name` VARCHAR(10) NOT NULL,
`e_mail` VARCHAR(50) UNIQUE KEY NOT NULL,
`floor_seat_seq` int,
foreign key(`floor_seat_seq`)REFERENCES `seatingchart`(`floor_seat_seq`) 
)AUTO_INCREMENT = 10001;	


INSERT INTO `employee`(`name`, `e_mail`, `floor_seat_seq`) VALUES
('錢夫人', 'qian@example.com', 1),
('王先生', 'wang@example.com', 2),
('張小姐', 'zhang@example.com', 3),
('李先生', 'li@example.com', 4),
('小杰', 'jay@example.com', null),
('小綠', 'green@example.com', null),
('小白', 'white@example.com', null)
;