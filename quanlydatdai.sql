-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th6 05, 2023 lúc 05:27 PM
-- Phiên bản máy phục vụ: 5.7.25
-- Phiên bản PHP: 7.1.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlydatdai`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `datdai`
--

CREATE TABLE `datdai` (
  `maDat` int(11) NOT NULL,
  `tenDat` text NOT NULL,
  `dienTich` int(11) NOT NULL,
  `giaDat` int(11) NOT NULL,
  `viTri` text NOT NULL,
  `trangThai` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `datdai`
--

INSERT INTO `datdai` (`maDat`, `tenDat`, `dienTich`, `giaDat`, `viTri`, `trangThai`) VALUES
(1, 'Thu Duc', 500, 5000, 'Thu Duc', 'Chua Ban'),
(2, 'Thu Thiem 1', 600, 6000, 'HCM', 'Chua Ban'),
(3, 'Thu Thiem 2', 700, 7000, 'HCM', 'Chua Ban'),
(4, 'TDC', 800, 8000, 'Thu Duc', 'Da Ban'),
(5, 'VinCom', 450, 20000, 'Thu Duc', 'Da Ban'),
(6, 'VinPearl', 2000, 90000, 'Thu Duc', 'Da Ban'),
(101, 'KTX', 7900, 5500, 'Binh Duong', 'Chua Ban'),
(104, 'Hong Ha', 4589, 5800, 'Trung Tam HCM', 'Chua Ban'),
(105, 'Cu Chi', 950, 9000, 'HCM', 'Chua Ban'),
(108, '1', 1, 1, '1', 'Chua Ban'),
(107, '7', 77, 7, '7', 'Chua Ban'),
(100, 'a', 101, 100, 'a', 'Chua Ban'),
(1111, 'Tien Giang', 7899, 2222, 'qwe', 'Chua Ban'),
(107, '7', 77, 7, '7', 'Chua Ban');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giohang`
--

CREATE TABLE `giohang` (
  `maDat` int(11) NOT NULL,
  `tenDat` int(11) NOT NULL,
  `dienTich` int(11) NOT NULL,
  `giaDat` int(11) NOT NULL,
  `viTri` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `Pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`ID`, `Pass`) VALUES
(1, '1'),
(1111, '1111');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
