<?php

namespace Classes;

class Book extends Good implements BookInterface
{
    use DiscountTrait;

    protected $name;
    protected $author;

    public function __construct(int $cost, string $name, string $author)
    {
        parent::__construct($cost);
        $this->name = $name;
        $this->author = $author;
    }

    public function setAuthor(string $author)
    {
        $this->author = $author;
    }

    public function getAuthor(): string
    {
        return $this->author;
    }

    public function setPageCount(int $pageCount)
    {
        $this->pageCount = $pageCount;
    }

    public function getPageCount(): int
    {
        return $this->pageCount;
    }
}