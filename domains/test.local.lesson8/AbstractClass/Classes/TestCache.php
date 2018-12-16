<?php

namespace Classes;

class TestCache implements CacheInterface
{
    protected $cache = [];


    /**
     * Метод возвращает кэш по ключу, проверяет есть ли данные в массиве $cache с заданным ключом,
     * иначе возвращает null
     * @param $book - Название книги
     * @return mixed
     */
    public function getCacheByKey(string $book)
    {
        if (!empty($this->cache[$book])) {
            return $this->cache[$book];
        }
        return false;
    }

    /**
     * Метод принимает и устанавливает кэш по ключу
     * @param $book - Название книги
     * @param $author - Автор
     */
    public function setCacheByKey(string $book, string $author)
    {
        $this->cache[$book] = $author;
    }

    /**
     * Метод провереят существование кэша по ключу, возвращает ,булево значение
     * @param $book - Название книги
     * @return bool
     */
    public function hasCacheByKey(string $book): bool
    {
        if (array_key_exists($book, $this->cache)) {
            return true;
        }
        return false;
    }
}