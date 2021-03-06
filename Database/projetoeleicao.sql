-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 16-Fev-2019 às 19:47
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projetoeleicao`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE `administrador` (
  `cod_admin` int(11) NOT NULL,
  `senha` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `administrador`
--

INSERT INTO `administrador` (`cod_admin`, `senha`) VALUES
(1, 1234);

-- --------------------------------------------------------

--
-- Estrutura da tabela `candidato`
--

CREATE TABLE `candidato` (
  `cod_candidato` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `votos` int(11) NOT NULL,
  `num_eleicao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `eleicao`
--

CREATE TABLE `eleicao` (
  `num_eleicao` int(11) NOT NULL,
  `nome_eleicao` varchar(150) NOT NULL,
  `data` varchar(11) NOT NULL,
  `organizador` varchar(150) NOT NULL,
  `nulos` int(11) NOT NULL,
  `brancos` int(11) NOT NULL,
  `validos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `padroes`
--

CREATE TABLE `padroes` (
  `cod` int(11) NOT NULL,
  `tpOrganizador` varchar(250) NOT NULL,
  `tpPleito` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `padroes`
--

INSERT INTO `padroes` (`cod`, `tpOrganizador`, `tpPleito`) VALUES
(1, 'Administrator', 'Election');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`cod_admin`);

--
-- Indexes for table `eleicao`
--
ALTER TABLE `eleicao`
  ADD PRIMARY KEY (`num_eleicao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
