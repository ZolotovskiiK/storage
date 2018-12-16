<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
?>
<?php

if (isset($_GET['send'])) {

    $a = (int)$_GET['firstNumber'];
    $b = (int)$_GET['secondNumber'];
    $operation = $_GET['operation'];
    $result = '';

    if ($operation == '+') {
        $result = $a + $b;

    } elseif ($operation == '-') {
        $result = $a - $b;

    } elseif ($operation == '/') {
        if ($b == 0) {
            echo "На 0 делить нельзя";

        } else {
            $result = $a / $b;
        }

    } else {
        $result = $a * $b;
    }
}
?>
<html>
<body>
<form action="" method="get">
    
    <span>Первое число</span>
    <input type="text" name="firstNumber"
           value="<?= isset($_GET['firstNumber']) ? htmlspecialchars($_GET['firstNumber']) : 0 ?>">

    <select name="operation">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>

    <span>Второе число</span>
    <input type="text" name="secondNumber"
           value="<?= isset($_GET['secondNumber']) ? htmlspecialchars($_GET['secondNumber']) : 0 ?>">
    <input type="submit" name="send" value="=">

</form>
<p>Ответ: <?= isset($result) ? $result : '' ?></p>
</body>
</html>
