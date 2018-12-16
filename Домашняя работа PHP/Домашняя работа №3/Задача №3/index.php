<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
?>
<html>
<body>
<form action="" method="post">
    <input type="text" name="number" value="<?= isset($_POST['number']) ? htmlspecialchars($_POST['number']) : '' ?>">
    <input type="submit" name="submit" value="OK">
</form>
</body>
</html>

<?php
$number = htmlspecialchars($_POST['number']);

function Prime($number) {
    if (isset($_POST['submit'])) {
        ;
        for ($i = 2; $i <= $number; $i++) {
            $isPrime = true;

            for ($j = 2; $j < $i; $j++) {
                if ($i % $j == 0) {
                    $isPrime = false;
                    break;
                }
            }
            if ($isPrime) {
                echo $i . ' ';
            }
        }
    }
}
echo "Prime";
?>
