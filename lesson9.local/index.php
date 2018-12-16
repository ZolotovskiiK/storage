<?php

use Classes\LordKingBook;
use Classes\LordRingsBookFactory as Factory;

require_once __DIR__ . '/autoload.php';

$factory = new Factory();

$book = $factory->create('Две башни', 'Толкин', LordKingBook::REGULAR_EDITION);

echo $book->getDiscount() . '<br>';
echo $book->getCostWithDiscount($book->getCost()) . '<br>';
echo $book->sell() . '<br>';