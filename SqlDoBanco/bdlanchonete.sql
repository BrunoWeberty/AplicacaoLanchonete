-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 01-Maio-2019 às 19:44
-- Versão do servidor: 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdlanchonete`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `bebidas`
--

CREATE TABLE `bebidas` (
  `id` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `bebidas`
--

INSERT INTO `bebidas` (`id`, `descricao`, `valor`) VALUES
(1, 'Refrigerante 1.5l', 5),
(2, 'Refrigerante 2l', 7),
(3, 'Suco', 3),
(4, 'Taí', 4),
(5, 'Fanta 1.5l', 5.5),
(6, 'Fanta 2l', 6),
(7, 'Refrigerante Kuat 2l', 4.5),
(8, 'Refrigerante Kuat 1.5l', 3.5),
(9, 'Dolly', 3.5),
(10, 'Guaraná Jesus 1,5L', 3.5),
(11, 'Bebida Teste', 7.5),
(12, 'Bebida teste 2', 6.5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `lanches`
--

CREATE TABLE `lanches` (
  `id` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `lanches`
--

INSERT INTO `lanches` (`id`, `descricao`, `valor`) VALUES
(1, 'Cachorro Quente', 5),
(2, 'X-Tudo', 12),
(3, 'Hamburguer', 6),
(4, 'Cheeseburger', 10.5),
(5, 'Framburguer', 7),
(6, 'X-Bacon', 11),
(7, 'Bauru', 7.5),
(8, 'Misto', 4),
(9, 'X-Black', 12.5),
(10, 'Bob\'s Picanha', 15);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `valorTotal` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`id`, `nome`, `valorTotal`) VALUES
(1, 'Bruno Weberty', 65),
(2, 'Marieta', 38),
(3, 'Marieta', 41.5),
(4, 'Luiz', 20),
(5, 'Alex', 26),
(6, 'Maria da Silva', 32),
(7, 'Pedro de Alcantra', 18),
(8, 'Santa Luzia', 18),
(9, 'Danielli de Bezerra', 16),
(10, 'Pablo Washigton', 15),
(11, 'Alexsander ', 33.5),
(12, 'Aluísio Chulapa', 12),
(13, 'Maria de Albuquerque Filho', 52),
(14, 'Abigail F. Silva', 34),
(15, 'José Carlos de Oliveira', 26),
(16, 'Maria Helena', 45),
(17, 'Cicero Lima Costa', 26),
(18, 'Larissa', 30),
(19, 'Chico', 38);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bebidas`
--
ALTER TABLE `bebidas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lanches`
--
ALTER TABLE `lanches`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bebidas`
--
ALTER TABLE `bebidas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `lanches`
--
ALTER TABLE `lanches`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
