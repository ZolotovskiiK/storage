<?php

namespace Classes;

interface BookInterface
{
    public const PUBLISHING_HOUSE = 'Дрофа';
    public function setAuthor(string $author);
    public function getAuthor() : string;
    public function setPagesCount(int $pagesCount);
    public function getPagesCount() : int;
}