<?php
header('Content-Type: text/html;charset=utf-8');
session_start();

require_once __DIR__ . '/function.php';
$error = null;

if (count($_POST) > 0) {
    $login = $_POST['login'];
    $pass = $_POST['pass'];

    if (auth($login, $pass) === true) {
        header('Location: /Password/home.php');
        exit();

    } else {

        $error = 'Введите верные данные';
        session_destroy();
    }
}

if (isset($_SESSION['login']) && isset($_SESSION['pass'])) {
    $login = $_SESSION['login'];
    $pass = $_SESSION['pass'];

    if (auth($login, $pass) === true) {
        header('Location: /Password/home.php');
    }
}
?>

<p><?= $error ?></p>
<form method="post" action="/Password/index.php">
    <p>Введите логин</p>
    <p><input type="text" name="login"></p>
    <p>Введите пароль</p>
    <p><input type="password" name="pass"></p>
    <p><input type="submit" value="Login"></p>
</form>
