<?php
require_once __DIR__ . '/autoload.php';

use Classes\Teacher;
use Classes\Builder;

$teacher = new Teacher('Andrey', 30, 15);
$teacher->setQuantityWorkedDays(25);
echo $teacher->calculateSalary();
echo '<br>';

$builder = new Builder('Ivan', 30);
$builder->setQuantityWorkedDays(25);
echo $builder->calculateSalary();

