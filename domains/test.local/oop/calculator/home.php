<?php
session_start();
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
require_once __DIR__ . '/classes.php';

$session = new Session();
$user = new User();
if (isset($_SESSION['login']) && isset($_SESSION['password'])) {

    $login = $session->get('login');
    $password = $session->get('password');

    if ($user->check($login, $password) === false) {
        $session->destroy();
    }

} else {

    header('Location: /oop/calculator/index.php');
    exit();
}

if (isset($_POST['send']) && isset($_POST['firstNumber']) && isset($_POST['secondNumber']) && isset($_POST['operation'])) {

    $a = (double)$_POST['firstNumber'];
    $b = (double)$_POST['secondNumber'];
    $operation = $_POST['operation'];
    $result = '';
    $trueSign = array('+', '-', '/', '*');

    if (in_array($operation, $trueSign, true) == true) {

        $calculator = new Calculator();

        if ($operation == '+') {

            $result = $calculator->addition($a, $b);

        } elseif ($operation == '-') {

            $result = $calculator->subtraction($a, $b);

        } elseif ($operation == '/') {

            $result = $calculator->division($a, $b);

        } elseif ($operation == '*') {

            $result = $calculator->multiplication($a, $b);
        }

    } else {

        $result = "Введие корректные данные";
    }
}

if (isset($_GET['logout'])) {
    $user->logout();
}

?>
<html>
<body>
<form action="/oop/calculator/home.php" method="post">

    <span>Первое число</span>

    <input type="text" name="firstNumber"
           value="<?= isset($_POST['firstNumber']) ? htmlspecialchars(($_POST['firstNumber'])) : '' ?>">

    <select name="operation">
        <?php
        $select = $_POST['operation'];
        ?>
        <option value="+"<?php if ($select == '+') {
            echo " selected";
        } ?>>+
        </option>
        <option value="-"<?php if ($select == '-') {
            echo " selected";
        } ?>>-
        </option>
        <option value="*"<?php if ($select == '*') {
            echo " selected";
        } ?>>*
        </option>
        <option value="/"<?php if ($select == '/') {
            echo " selected";
        } ?>>/
        </option>
    </select>

    <span>Второе число</span>

    <input type="text" name="secondNumber"
           value="<?= isset($_POST['secondNumber']) ? htmlspecialchars($_POST['secondNumber']) : '' ?>">

    <input type="submit" name="send" value="=">
</form>

<p>Ответ: <?= isset($result) ? $result : '' ?></p>
<p><a href="/oop/calculator/home.php?logout=true">logout</a></p>
</body>
</html>





