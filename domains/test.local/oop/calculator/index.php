<?php
session_start();
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
require_once __DIR__ . '/classes.php';

$error = null;
$session = new Session();
$user = new User();

if (count($_POST) > 0) {

    $login = $_POST['login'];
    $password = $_POST['password'];

    if ($user->check($login, $password) === true) {

        $session->set('login', $login);
        $session->set('password', $password);
        header('Location: /oop/calculator/home.php');
        exit();

    } else {

        $error = 'Введите верные данные';

    }
}

if (isset($_SESSION['login']) && isset($_SESSION['password'])) {

    $login = $session->get('login');
    $password = $session->get('password');

    if ($user->check($login, $password) === true) {
        header('Location: /oop/calculator/home.php');
        exit();
    }
}
?>
<p><?= $error ?></p>
<form action="/oop/calculator/index.php" method="post">
    <p>Введите логин</p>
    <p><input type="text" name="login"></p>
    <p>Введите пароль</p>
    <p><input type="password" name="password"></p>
    <p><input type="submit" value="Login"></p>
</form>
