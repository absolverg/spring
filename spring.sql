USE `web`;

CREATE TABLE IF NOT EXISTS `member_table` (
    `id` int(20) NOT NULL AUTO_INCREMENT,
    `member_email` varchar(255) DEFAULT NULL,
    `member_password` varchar(255) DEFAULT NULL,
    `member_name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `member_table` (`id`, `member_email`, `member_password`, `member_name`) VALUES
    (1, 'test1@google.com', 'password1', '테스트1'),
    (2, 'test2@google.com', 'password2', '테스트2'),
    (3, 'test3@google.com', 'password3', '테스트3'),
    (4, 'test4@google.com', 'password4', '테스트4'),
    (5, 'test5@google.com', 'password5', '테스트5'),
    (6, 'test6@google.com', 'password6', '테스트6'),
    (7, 'test7@google.com', 'password7', '테스트7'),
    (8, 'test8@google.com', 'password8', '테스트8'),
    (9, 'test9@google.com', 'password9', '테스트9'),
    (10, 'test10@google.com', 'password10', '테스트10');