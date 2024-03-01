-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-02-2024 a las 21:53:33
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistema_ventas`
--
CREATE DATABASE IF NOT EXISTS `sistema_ventas` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `sistema_ventas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `tipo_categoria` varchar(100) DEFAULT NULL,
  `estado` enum('activo','inactivo') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` varchar(50) NOT NULL,
  `tipoIdenificacion` int(60) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `idDisrito` int(50) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `fechaIngreso` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(50) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio_unitario` double NOT NULL,
  `descripcion` varchar(300) NOT NULL,
  `porcentajeIva` int(11) NOT NULL,
  `marca` varchar(200) NOT NULL,
  `estado` enum('activo','inactivo') NOT NULL,
  `id_categoria` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `nombre` varchar(200) DEFAULT NULL,
  `empresa` varchar(200) DEFAULT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefono` int(20) DEFAULT NULL,
  `rut` int(50) DEFAULT NULL,
  `estado` enum('activo','inactivo') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registros`
--

CREATE TABLE `registros` (
  `Id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL,
  `correo` varchar(600) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registros`
--

INSERT INTO `registros` (`Id`, `nombre`, `password`, `correo`) VALUES
(1, 'Brayan', '12345', 'brayanjosephruedapreciado@gmail.com'),
(2, 'Mogollon', '1234567', ''),
(3, 'pasto', '2313', 'pasto123@gmail.com'),
(4, 'fran', '3423', 'fran@gmail.com'),
(5, 'maikol', '2323', 'maikol@gmail.com'),
(6, 'games', '3434', 'games@gmail.com'),
(7, 'marlon', '3425', 'marlon@gmail.com'),
(8, 'felipe', '12345', 'felipe@gmail.com'),
(9, 'sasu', 'w0KIVOB1PLmrTNnD/K9ygQ==', 'brayanjosephruedapreciado@gmail.com'),
(10, 'marlon', 'pVCpJqkdnuBYjtHdmb7KpQ==', 'brayanjosephruedapreciado@gmail.com'),
(11, 'maritza', 'hola123', 'palma1999bp@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- Indices de la tabla `registros`
--
ALTER TABLE `registros`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registros`
--
ALTER TABLE `registros`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
