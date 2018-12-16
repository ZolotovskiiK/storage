<?php


namespace Classes;


interface CacheInterface
{
    /**
     * Метод возвращает кэш по ключу, проверяет есть ли данные в массиве $cache с заданным ключом,
     * иначе возвращает null
     * @param $name - Название книги
     * @return mixed
     */
    public function getCacheByKey(string $name);

    /**
     * Метод принимает и устанавливает кэш по ключу
     * @param $name - Название книги
     * @param $author - Автор
     */
    public function setCacheByKey(string $name, string $author);

    /**
     * Метод провереят существование кэша по ключу, возвращает ,булево значение
     * @param $name
     * @return bool
     */
    public function hasCacheByKey(string $name): bool;
}