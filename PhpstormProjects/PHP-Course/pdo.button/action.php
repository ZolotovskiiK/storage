<?php
require_once __DIR__ . '/connect.php';
if (isset($_GET['id'])) {
    $id = $_GET['id'];

    if (!empty($id)) {

        $query = 'DELETE FROM animals WHERE id =' . "$id";
        $delete = $dbh->exec($query);
        header('Location: /pdo.button/index.php');
        exit();


    }
}
if (isset($_GET['add']) && isset($_GET['name']) && isset($_GET['species']) && isset($_GET['weight']) && isset($_GET['gender'])) {

    $name = htmlspecialchars($_GET['name']);
    $species = htmlspecialchars($_GET['species']);
    $weight = (double)$_GET['weight'] * 1000;
    $gender = htmlspecialchars($_GET['gender']);

    $query = 'INSERT INTO animals(name, species, weight, gender) VALUE (' . $dbh->quote($name) . ',' . $dbh->quote($species) . ',' . $dbh->quote($weight) . ',' . $dbh->quote($gender) . ')';
    $add = $dbh->exec($query);
    header('Location: /pdo.button/index.php');
    exit();
}