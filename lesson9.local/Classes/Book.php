<?php

namespace Classes;

class Book extends Good implements BookInterface
{
    use DiscountTrait, AdditionalDiscount {
        AdditionalDiscount::getDiscount insteadof DiscountTrait;
        DiscountTrait::getDiscount as public;
        DiscountTrait::Test as public;
    }

    function Test(): int
    {
        return 100;
    }

    protected $name;
    protected $author;
    protected $pagesCount;

    public function __construct(int $cost, string $name, string $author)
    {
        parent::__construct($cost);
        $this->name = $name;
        $this->author = $author;
    }



    public function sell(): string
    {
        return 'Book was sold';
    }

    public function buy(): string
    {
        return 'Book was bought';
    }

    public function setAuthor(string $author)
    {
        $this->author = $author;
    }
    public function getAuthor(): string
    {
        return $this->author;
    }
    public function setPagesCount(int $pagesCount)
    {
        $this->pagesCount = $pagesCount;
    }
    public function getPagesCount(): int
    {
        return $this->pagesCount;
    }


}