<?php
/**
 * Created by PhpStorm.
 * User: user
 * Date: 24.11.2018
 * Time: 10:20
 */

namespace Classes;


interface BookInterface
{
    public const PUBLISHING_HOUSE = 'Дрофа';

    public function setAuthor(string $author);

    public function getAuthor(): string;

    public function setPageCount(int $pageCount);

    public function getPageCount(): int;
}

