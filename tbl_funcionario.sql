-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Tempo de geração: 07/05/2024 às 17:05
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `pousada`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `tbl_funcionario`
--

CREATE TABLE `tbl_funcionario` (
  `id` int(3) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `ddd` int(3) NOT NULL,
  `celular` int(9) NOT NULL,
  `email` varchar(50) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `cargo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `tbl_funcionario`
--

INSERT INTO `tbl_funcionario` (`id`, `nome`, `cpf`, `ddd`, `celular`, `email`, `senha`, `cargo`) VALUES
(1, 'Ana Julia', '23476141824', 11, 986413256, 'anajulia@gmail.com', '@recepcao', 'recepcao'),
(2, 'Luis Carlos', '26526717222', 12, 976231523, 'luiscarlos@gmail.com', '@gerente', 'gerente'),
(3, 'Paulo Gustavo', '28916205612', 11, 965122419, 'paulogustavo@gmail.com', '@assistent', 'assistente');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tbl_funcionario`
--
ALTER TABLE `tbl_funcionario`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
