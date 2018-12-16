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

if (isset($_GET['submit'])) {
    $maxWeight = (int)$_GET['maxWeight'] * 1000;
    $minWeight = (int)$_GET['minWeight'] * 1000;


    if (!empty($_GET['maxWeight']) && !empty($_GET['minWeight'])) {
        $maxWeight = (int)$_GET['maxWeight'] * 1000;
        $minWeight = (int)$_GET['minWeight'] * 1000;
        $endOfQuery = 'AND animals.weight BETWEEN :minWeight AND :maxWeight';
        $queryArray = array(':minWeight' => $minWeight, ':maxWeight' => $maxWeight);
    }

    if (empty($_GET['minWeight'])) {
        $maxWeight = (int)$_GET['maxWeight'] * 1000;
        $endOfQuery = 'AND animals.weight < :maxWeight';
        $queryArray = array(':maxWeight' => $maxWeight);
    }

    if (empty($_GET['maxWeight'])) {
        $maxWeight = (int)$_GET['minWeight'] * 1000;
        $endOfQuery = 'AND animals.weight > :minWeight';
        $queryArray = array(':minWeight' => $minWeight);
    }

    if (empty($_GET['maxWeight']) && empty($_GET['minWeight'])) {
        $endOfQuery = '';
        $queryArray = null;
    }
    $sql = 'SELECT animals.name, animals.weight/1000, type.typeRussianName, type.typeLatinName FROM animals, type 
 WHERE animals.species = type.typeRussianName ' . "$endOfQuery";

    $sth = $dbh->prepare($sql, array(PDO::ATTR_CURSOR => PDO::CURSOR_FWDONLY));
    $sth->execute($queryArray);
    $result = $sth->fetchAll(PDO::FETCH_ASSOC);
}


?>
<html>
<body>
<form method="get" action="/PDO/index.php">
<p>Введите максимальный вес, кг</p>
<p><input type="text" name="maxWeight"></p>
<p>Введите минимальный вес, кг</p>
<p><input type="text" name="minWeight"></p>
<p><input type="submit" name="submit" value="Поиск"></p>
</form>
</body>
</html>


<?php

if (isset($result) > 0) {

    echo '<table border="1" width="70%" >';
    echo '<tr><th>Имя</th><th>Вес, кг</th><th>Русское название вида</th><th>Латинское название вида</th></tr>';

    foreach ($result as $item) {
        echo '<tr>';

        foreach ($item as $key => $value) {
            echo '<td>' . $value . '</td>';
        }

        echo '</tr>';
    }
    echo '</table>';
}
?>
