<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
?>
<pre>
<?php
define("NAME", "Константин");
if (defined("NAME")) {
    echo 'Константа существует' . PHP_EOL;
} else {
    echo 'Констаната не существует' . PHP_EOL;
}
echo 'Константе присвоено значение ' . NAME;
//NAME = 'Василий';
/* При попытке изменения значения констаты выводится ошибка структурного анализа в которой указано, что допущена
синтаксическая ошибка.*/
?>
</pre>