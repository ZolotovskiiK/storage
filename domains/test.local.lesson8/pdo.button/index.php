<?php
require_once __DIR__ . '/connect.php';

$sql = 'SELECT id, name, species, weight, gender FROM animals';
$sth = $dbh->prepare($sql);
$sth->execute();


echo '<table border="1" width="70%">';
echo '<tr>';
echo '<th>Имя</th>';
echo '<th>Вид</th>';
echo '<th>Вес, кг</th>';
echo '<th>Пол</th>';
echo '</tr>';
while ($row = $sth->fetch()) {

    echo '<tr>';
    echo '<td>' . $row['name'] . '</td>';
    echo '<td>' . $row['species'] . '</td>';
    echo '<td>' . $row['weight'] / 1000 . '</td>';
    echo '<td>' . $row['gender'] . '</td>';
    echo "<td><a href=\"/PDO/button/action.php?id=" . $row['id'] . "\">Удалить</a></td>";
    echo '</tr>';
}
echo '</table>';
?>
<html>
<body>
<br>
<form action="/pdo.button/action.php" method="get">
    <span>Имя</span>
    <input type="text" name="name">

    <span>Вид</span>
    <input type="text" name="species">

    <span>Вес, кг</span>
    <input type="text" name="weight">

    <span>Пол</span>
    <input type="text" name="gender">

    <input type="submit" name="add" value="Добавить">
</form>
</body>
</html>
