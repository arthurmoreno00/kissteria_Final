-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3304
-- Tempo de geração: 30-Nov-2023 às 18:24
-- Versão do servidor: 10.4.28-MariaDB
-- versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `kissteria`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_batalha`
--

CREATE TABLE `tb_batalha` (
  `id_batalha` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  `data_hora` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_guerreiro`
--

CREATE TABLE `tb_guerreiro` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `pontosVida` int(11) DEFAULT NULL,
  `pontosAtaque` int(11) DEFAULT NULL,
  `pontosDefesa` int(11) DEFAULT NULL,
  `forca` int(11) DEFAULT NULL,
  `velocidade` int(11) DEFAULT NULL,
  `tipoPersonagem` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_guerreiro`
--

INSERT INTO `tb_guerreiro` (`id`, `nome`, `pontosVida`, `pontosAtaque`, `pontosDefesa`, `forca`, `velocidade`, `tipoPersonagem`) VALUES
(1, 'arthur', 100, 17, 15, 4, 7, 'Magico');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_item`
--

CREATE TABLE `tb_item` (
  `id_item` int(11) NOT NULL,
  `descricao` varchar(255) NOT NULL,
  `personagem` varchar(255) NOT NULL,
  `modalidade` varchar(255) NOT NULL,
  `preco` int(11) NOT NULL,
  `bonus_defesa` int(11) NOT NULL,
  `bonus_ataque` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_mistico`
--

CREATE TABLE `tb_mistico` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `pontosVida` int(11) NOT NULL,
  `pontosAtaque` int(11) NOT NULL,
  `pontosDefesa` int(11) NOT NULL,
  `tipoPersonagem` varchar(255) NOT NULL,
  `inteligencia` int(11) NOT NULL,
  `recuperacao` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `tb_mistico`
--

INSERT INTO `tb_mistico` (`id`, `nome`, `pontosVida`, `pontosAtaque`, `pontosDefesa`, `tipoPersonagem`, `inteligencia`, `recuperacao`) VALUES
(1, 'mariagu', 100, 17, 10, 'demonio', 4, 8);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_theddemon`
--

CREATE TABLE `tb_theddemon` (
  `id_thedDemon` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `ponto_vida` int(11) NOT NULL,
  `ponto_ataque` int(11) NOT NULL,
  `ponto_defesa` int(11) NOT NULL,
  `forca` int(11) NOT NULL,
  `velocidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_guerreiro`
--
ALTER TABLE `tb_guerreiro`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `tb_mistico`
--
ALTER TABLE `tb_mistico`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_guerreiro`
--
ALTER TABLE `tb_guerreiro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tb_mistico`
--
ALTER TABLE `tb_mistico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
