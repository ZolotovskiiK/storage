<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);

$dsn = 'mysql:dbname=clinic; host=127.0.0.1:3307';
$user = 'root';

try {
    $dbh = new PDO($dsn, $user);
} catch (PDOException $e) {
    echo 'Подключение не удалось: ' . $e->getMessage();
}