<?php
require_once __DIR__ . '/autoload.php';

use Classes\Book;
use Classes\TestCache;

$book = new Book('Толкин', 1000, 2500, 'Властелин колец');
echo $book->getName() . '<br>';
echo $book->getAuthor() . '<br>';
echo $book->getCost() . '<br>';
echo $book->getQuantityPages() . '<br>';
echo $book->getContent() . '<br>';

$cache = new TestCache();
$cache->setCacheByKey('Война и мир', 'Толстой');
echo $cache->hasCacheByKey('Война и мир') . '<br>';
echo $cache->hasCacheByKey('Властелин колец') . '<br>';
echo $cache->getCacheByKey('Война и мир') . '<br>';
echo $cache->getCacheByKey('Властелин колец') . '<br>';
print_r($cache);
echo '<br>';
$bookCacheDecorator = new \Classes\BookCacheDecorator($cache, $book);
echo $bookCacheDecorator->getBook('Война и мир'). '<br>';