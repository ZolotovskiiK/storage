<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
?>
<pre>
<?php
$name = 'Константин';
$age = 29;
echo 'Меня зовут: ' . $name . PHP_EOL;
//echo 'Мне ' . $age . ' лет';
if ($age % 10 == 0 || $age % 10 >= 5 || ($age % 100 >= 10 && $age % 100 <= 19)) {
    echo("Мне " . $age . " лет");
} elseif ($age % 10 >= 2 && $age % 10 <= 4) {
    echo("Мне " . $age . " года");
} else {
    echo("Мне " . $age . " год");
}
/* Если удалить переменную $age будет сгенерирована ошибка уровня Notice, в которой будет сказанно что в определенных
строках присутствует неопределенная переменная. При поппытке вывода результата на эран, если мы используем в коде строку
echo 'Мне ' . $age . ' лет' выедеться 'Мне лет'. Если использовать модифицированный вариант программы, то ничего не отобрбажаться
не будет, так как программа не зайдет в условие выбора корректного текста. */
?>
</pre>

