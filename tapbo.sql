-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 12, 2022 at 03:37 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `tapbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`) VALUES
('admin', '21232f297a57a5a743894a0e4a801fc3');

-- --------------------------------------------------------

--
-- Table structure for table `inventaris`
--

CREATE TABLE `inventaris` (
  `id` varchar(32) NOT NULL,
  `nama` varchar(64) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `sumber` varchar(32) NOT NULL,
  `keadaan` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventaris`
--

INSERT INTO `inventaris` (`id`, `nama`, `jumlah`, `sumber`, `keadaan`) VALUES
('X0001', 'Keyboard (psr s-900)', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0002', 'Stand Keyboard ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0003', 'Ampli Mic (Roland Kb550) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0004', 'Speaker Aktif (Mackie T) ', 1, 'APBN', 'Layak Pakai'),
('X0005', 'Microphone (Behringer xm 1800 set) ', 3, 'Kas UKM', 'Layak Pakai'),
('X0006', 'Microphone Wireless (Shure SVX) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0007', 'Stand Mic ', 2, 'Kas UKM', 'Layak Pakai'),
('X0008', 'Mixer Kecil (Yamaha MG166CX) ', 1, 'Kas UKM', 'Layak Pakai'),
('X0009', 'Mixer Besar (MPG 32X H) ', 1, 'APBN', 'Layak Pakai'),
('X0010', 'Stand Partitur ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0011', 'Drum (Rolling) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0012', 'Drum (Tama Swing Star) ', 1, 'APBN', 'Layak Pakai'),
('X0013', 'Cajon ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0014', 'Stik Drum ', 1, 'Kas UKM', 'Layak Pakai'),
('X0015', 'Strap Gitar  ', 2, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0016', 'Stand Gitar Double ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0017', 'Stand Gitar ', 2, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0018', 'Gitar Elektrik (Ibanez) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0019', 'Gitar Elektrik (Epiphone) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0020', 'Gitar Elektrik (Ibanez GRX-55b-VRD) ', 1, 'APBN', 'Layak Pakai'),
('X0021', 'Gitar Elektrik (Legacy JEM replica) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0022', 'Ampli Gitar (Stagg guitar Amp) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0023', 'Ampli Gitar (Marshall guitar Amp) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0024', 'Ampli Gitar (Vox VT 80+) ', 1, 'APBN', 'Layak Pakai'),
('X0025', 'Efek Gitar (Zoom g1xn) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0026', 'DI BOX samson ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0027', 'Bass Elektrik (Cort) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0028', 'Bass Elektrik (Ibanez TMB 100-K) ', 1, 'APBN', 'Layak Pakai'),
('X0029', 'Ampli Bass (Marshall bass Amp) ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0030', 'Ampli Bass (Ampeg 112 v2) ', 1, 'APBN', 'Layak Pakai'),
('X0031', 'Kabel Jack ', 6, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0032', 'Kabel Jack Akai ', 8, 'APBN', 'Layak Pakai'),
('X0033', 'Lemari Besar ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai'),
('X0034', 'Loker 4 Pintu ', 1, 'IMB (sumber dana kurang jelas)', 'Layak Pakai');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id` int(11) NOT NULL,
  `nama` varchar(64) NOT NULL,
  `nim` varchar(64) NOT NULL,
  `angkatan` int(11) NOT NULL,
  `gender` varchar(64) NOT NULL,
  `role` varchar(64) NOT NULL,
  `keanggotaan` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id`, `nama`, `nim`, `angkatan`, `gender`, `role`, `keanggotaan`) VALUES
(1, 'Yusril Dicky Khoridwan', '222011270', 62, 'L', 'Bass', 'HPD'),
(9, 'Huda M. Fajar', '212011457', 62, 'L', 'Vokal', 'Ketua'),
(10, 'Ronald Hutajulu', '212011540', 62, 'L', 'Gitar', 'Wakil Ketua'),
(11, 'Aqila Nisalwa Ahkam', '212011495', 62, 'P', 'Vokal', 'Sekretaris'),
(12, 'Kinanthi Ilham Pradastika', '212011680', 62, 'P', 'Vokal', 'Bendahara'),
(13, 'Abdul Azis Daffa Yanuar', '212011660', 62, 'L', 'Bass', 'PSDM'),
(14, 'Fajar Surya Baskara', '212011483', 62, 'L', 'Gitar', 'HPD'),
(15, 'Satya Indra Kusworo', '212011615', 62, 'L', 'Gitar', 'Perlengkapan'),
(16, 'Afysha Diadara', '222011463', 62, 'P', 'Vokal', 'HPD'),
(17, 'Amadea Putri Deffare Sembiring', '212011608', 62, 'P', 'Vokal', 'PSDM'),
(18, 'Bayu Aji Bachtiar', '212011594', 62, 'L', 'Piano', 'HPD'),
(19, 'Erfangga Bayu Kurniawan', '212011668', 62, 'L', 'Drum', 'PSDM'),
(20, 'Fika Sabila Haq', '212011354', 62, 'P', 'Drum', 'Perlengkapan'),
(21, 'Isra Syukria Herida', '212011386', 62, 'P', 'Vokal', 'PSDM'),
(22, 'Julia Ivone Poluan', '112011827', 62, 'P', 'Vokal', 'PSDM'),
(23, 'Kautsar Hilmi Izzuddin', '212011497', 62, 'L', 'Bass', 'PSDM'),
(24, 'Mayrlan Rante Palalangan', '112011440', 62, 'L', 'Vokal', 'Perlengkapan'),
(25, 'Nadiva Fitri Adristi', '212011584', 62, 'P', 'Vokal', 'Perlengkapan'),
(26, 'Norvan Bagus Ramadhan', '212011796', 62, 'L', 'Gitar', 'HPD'),
(27, 'Rijal Simamora', '212011619', 62, 'L', 'Bass', 'Perlengkapan'),
(28, 'Disa Puspa Deswinta', '212011571', 62, 'P', 'Vokal', 'PSDM'),
(29, 'Aliefta Zulvansyah Bahyperdana', '222111873', 63, 'L', 'Bass', 'Anggota'),
(30, 'Ari Bahagia Sinaga', '112111918', 63, 'L', 'Gitar', 'Anggota'),
(31, 'Bagas Setyawan', '222111947', 63, 'L', 'Vokal', 'Anggota'),
(32, 'Claudia Janefer Romora Sitanggang', '212111974', 63, 'P', 'Vokal', 'Anggota'),
(33, 'Elgresia Egita Br Perangin-angin', '222112010', 63, 'P', 'Vokal', 'Anggota'),
(34, 'Ezra Eric Santoso', '212112027', 63, 'L', 'Drum', 'Anggota'),
(35, 'Insan Dienuari', '212112113', 63, 'P', 'Vokal', 'Anggota'),
(36, 'Jerry Kevin Seprilando Silitonga', '112112120', 63, 'L', 'Bass', 'Anggota'),
(37, 'Natalie Merry Angelina', '222112243', 63, 'P', 'Piano', 'Anggota'),
(38, 'Pretty Melati Pardede', '212112287', 63, 'P', 'Vokal', 'Anggota'),
(39, 'Regita Pramiswari Hadi Maharani', '222112311', 63, 'P', 'Vokal', 'Anggota'),
(40, 'Shania Wulan Suluh', '112112362', 63, 'P', 'Vokal', 'Anggota'),
(41, 'Syawalgi Wahyu Imani', '212112391', 63, 'L', 'Gitar', 'Anggota'),
(42, 'Yaulanda Fadhila', '212011341', 63, 'P', 'Gitar', 'Anggota');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inventaris`
--
ALTER TABLE `inventaris`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;
COMMIT;
