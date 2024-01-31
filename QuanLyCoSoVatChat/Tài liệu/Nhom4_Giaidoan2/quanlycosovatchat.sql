-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 31, 2024 at 02:00 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlycosovatchat`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieumuon`
--

CREATE TABLE `chitietphieumuon` (
  `maphieumuon` int(11) NOT NULL,
  `matbmuon` varchar(50) NOT NULL DEFAULT '',
  `trangthai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dangky`
--

CREATE TABLE `dangky` (
  `madangky` int(11) NOT NULL,
  `ngaymuon` date NOT NULL,
  `maphong` varchar(50) NOT NULL,
  `idloaitb` int(11) NOT NULL,
  `masvmuon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loaithietbi`
--

CREATE TABLE `loaithietbi` (
  `idloaitb` int(11) NOT NULL,
  `loaitb` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `loaithietbi`
--

INSERT INTO `loaithietbi` (`idloaitb`, `loaitb`) VALUES
(1, '23');

-- --------------------------------------------------------

--
-- Table structure for table `muonthietbi`
--

CREATE TABLE `muonthietbi` (
  `maphieumuon` int(11) NOT NULL,
  `ngaymuon` date NOT NULL,
  `maphong` varchar(50) NOT NULL,
  `masvmuon` varchar(50) NOT NULL,
  `manvxuat` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `manhanvien` varchar(50) NOT NULL,
  `tennhanvien` varchar(50) NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioitinh` bit(1) NOT NULL,
  `diachi` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `chucvu` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `maphong` varchar(50) NOT NULL,
  `tenphong` varchar(50) NOT NULL,
  `dayphong` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`maphong`, `tenphong`, `dayphong`) VALUES
('2B12', 'asd', '2');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `masinhvien` varchar(50) NOT NULL,
  `tensinhvien` varchar(50) NOT NULL,
  `ngaysinh` date NOT NULL,
  `gioitinh` bit(1) NOT NULL,
  `diachi` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`masinhvien`, `tensinhvien`, `ngaysinh`, `gioitinh`, `diachi`, `email`) VALUES
('qwe', 'qwe', '2024-01-26', b'1', 'sadf', 'as');

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `email` varchar(50) NOT NULL,
  `matkhau` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`email`, `matkhau`) VALUES
('as', 's');

-- --------------------------------------------------------

--
-- Table structure for table `thietbi`
--

CREATE TABLE `thietbi` (
  `mathietbi` varchar(50) NOT NULL,
  `tenthietbi` varchar(50) NOT NULL,
  `maphong` varchar(50) NOT NULL,
  `idloaitb` int(11) NOT NULL,
  `trangthai` int(11) NOT NULL,
  `thuoctinhtb` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD PRIMARY KEY (`maphieumuon`),
  ADD KEY `matbmuon` (`matbmuon`);

--
-- Indexes for table `dangky`
--
ALTER TABLE `dangky`
  ADD PRIMARY KEY (`madangky`),
  ADD KEY `maphong` (`maphong`),
  ADD KEY `masvmuon` (`masvmuon`),
  ADD KEY `idloaitb` (`idloaitb`);

--
-- Indexes for table `loaithietbi`
--
ALTER TABLE `loaithietbi`
  ADD PRIMARY KEY (`idloaitb`);

--
-- Indexes for table `muonthietbi`
--
ALTER TABLE `muonthietbi`
  ADD PRIMARY KEY (`maphieumuon`),
  ADD KEY `maphong` (`maphong`),
  ADD KEY `masvmuon` (`masvmuon`),
  ADD KEY `manvxuat` (`manvxuat`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`manhanvien`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`maphong`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`masinhvien`),
  ADD KEY `sinhvien_ibfk_1` (`email`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `thietbi`
--
ALTER TABLE `thietbi`
  ADD PRIMARY KEY (`mathietbi`),
  ADD KEY `maphong` (`maphong`),
  ADD KEY `idloaitb` (`idloaitb`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dangky`
--
ALTER TABLE `dangky`
  MODIFY `madangky` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `muonthietbi`
--
ALTER TABLE `muonthietbi`
  MODIFY `maphieumuon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD CONSTRAINT `chitietphieumuon_ibfk_1` FOREIGN KEY (`maphieumuon`) REFERENCES `muonthietbi` (`maphieumuon`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `chitietphieumuon_ibfk_2` FOREIGN KEY (`matbmuon`) REFERENCES `thietbi` (`mathietbi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `dangky`
--
ALTER TABLE `dangky`
  ADD CONSTRAINT `dangky_ibfk_1` FOREIGN KEY (`maphong`) REFERENCES `phong` (`maphong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `dangky_ibfk_2` FOREIGN KEY (`masvmuon`) REFERENCES `sinhvien` (`masinhvien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `dangky_ibfk_3` FOREIGN KEY (`idloaitb`) REFERENCES `loaithietbi` (`idloaitb`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `muonthietbi`
--
ALTER TABLE `muonthietbi`
  ADD CONSTRAINT `muonthietbi_ibfk_1` FOREIGN KEY (`maphong`) REFERENCES `phong` (`maphong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `muonthietbi_ibfk_2` FOREIGN KEY (`masvmuon`) REFERENCES `sinhvien` (`masinhvien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `muonthietbi_ibfk_3` FOREIGN KEY (`manvxuat`) REFERENCES `nhanvien` (`manhanvien`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`email`) REFERENCES `taikhoan` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `sinhvien_ibfk_1` FOREIGN KEY (`email`) REFERENCES `taikhoan` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `thietbi`
--
ALTER TABLE `thietbi`
  ADD CONSTRAINT `thietbi_ibfk_1` FOREIGN KEY (`maphong`) REFERENCES `phong` (`maphong`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `thietbi_ibfk_2` FOREIGN KEY (`idloaitb`) REFERENCES `loaithietbi` (`idloaitb`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
