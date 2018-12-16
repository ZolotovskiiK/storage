<?php
require_once __DIR__ . '/autoload.php';

use Classes\Bicycle;
use Classes\Car;
use Classes\User1;


$bicycle = new Bicycle('green', 20, 'GT');
$bicycle->setDistance(100);

echo $bicycle->getTravelTime() . '<br>';
echo $bicycle->getCountOfBurnedCalories() . '<br>';

$user = new User1('Vasya', 19);
$car = new Car('black',100,'BMW',10,$user);
$car->setDistance(1000);

echo $car->getTravelTime().'<br>';
echo $car->getFuelConsumption().'<br>';