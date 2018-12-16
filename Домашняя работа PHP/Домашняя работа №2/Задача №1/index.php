<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
?>
<?php


if (empty($_GET['computerNumber'])) {
    $_GET['computerNumber'] = rand(1, 100);
}


if (isset($_GET['send']) && !empty($_GET['userNumber'])) {
    $userNumber = $_GET['userNumber'];

    if ($userNumber > $_GET['computerNumber']) {
        $message = "Много";
    } elseif ($userNumber < $_GET['computerNumber']) {
        $message = "Мало";
    } else {
        echo "Вы угадали<br>";
        echo '<a href="index.php">Новая игра</a>';
        exit();
    }
} else {
    $message = "Введите число";
}

?>
<html>
<body>

<form method="get">
    <input type="text" name="userNumber" value="<?= isset($_GET['userNumber']) ? htmlspecialchars($_GET['userNumber']) : '' ?>">
    <input type="hidden" name="computerNumber" value="<?= $_GET['computerNumber'] ?>">
    <input type="submit" name="send" value="ok">
</form>
<p><?= isset($message) ? $message : '' ?></p>
</body>
</html>
