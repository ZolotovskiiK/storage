<?php

namespace Classes;

interface BookInterface
{

    /**
     * Метод возвращает контент
     * @return string
     */
    public function getContent(): string;

    /**
     * Метод возвращает автора
     * @return string
     */
    public function getAuthor(): string;

    /**
     * Метод возвращает кол-во страниц
     * @return int
     */
    public function getQuantityPages(): int;

}