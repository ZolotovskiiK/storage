<?php
session_start();
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
require_once __DIR__ . '/function.php';

if (isset($_SESSION['login']) && isset($_SESSION['pass'])) {
    $login = $_SESSION['login'];
    $pass = $_SESSION['pass'];

    if (auth($login, $pass) === false) {
        session_destroy();
        header('Location: /Password/index.php');
        exit();
    }
} else {
    header('Location: /Password/index.php');
    exit();
}

if (isset($_POST['send']) && isset($_POST['firstNumber']) && isset($_POST['secondNumber']) && isset($_POST['operation'])) {
    $a = (double)$_POST['firstNumber'];
    $b = (double)$_POST['secondNumber'];
    $operation = $_POST['operation'];
    $result = '';
    $true_sign = array('+', '-', '/', '*');

    if (in_array($operation, $true_sign, true) == true) {

        if ($operation == '+') {

            $result = $a + $b;

        } elseif ($operation == '-') {

            $result = $a - $b;

        } elseif ($operation == '/') {

            if ($b == 0) {

                $result = "На 0 делить нельзя";

            } else {

                $result = $a / $b;
            }

        } elseif ($operation == '*') {

            $result = $a * $b;
        }

    } else {

        $result = "Введие корректные данные";
    }

    $text = "$a" . " $operation " . "$b = $result\n";
    file_put_contents(__DIR__ . '/data.txt', $text, FILE_APPEND);
}

if (isset($_POST['exit'])) {
    session_destroy();
    header('Location: /Password/index.php');
    exit();
}
?>
<html>
<body>
<form action="/Password/home.php" method="post">

    <span>Первое число</span>

    <input type="text" name="firstNumber"
           value="<?= isset($_POST['firstNumber']) ? htmlspecialchars(($_POST['firstNumber'])) : '' ?>">

    <select name="operation">
        <?php
        $select = $_POST['operation'];
        ?>
        <option value="+"<?php if ($select === '+') {
            echo " selected";
        } ?>> +
        </option>
        <option value="-"<?php if ($select === '-') {
            echo " selected";
        } ?>>-
        </option>
        <option value="*"<?php if ($select === '*') {
            echo " selected";
        } ?>>*
        </option>
        <option value="/"<?php if ($select === '/') {
            echo " selected";
        } ?>>/
        </option>
    </select>

    <span>Второе число</span>

    <input type="text" name="secondNumber"
           value="<?= isset($_POST['secondNumber']) ? htmlspecialchars($_POST['secondNumber']) : null ?>">

    <input type="submit" name="send" value="=">
</form>

<p>Ответ: <?= isset($result) ? $result : '' ?></p>

<form action="/Password/home.php" method="post">
    <input type="submit" name="exit" value="Выйти">
</form>
</body>
</html>

