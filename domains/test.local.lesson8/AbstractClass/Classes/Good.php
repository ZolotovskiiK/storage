<?php

namespace Classes;

abstract class Good
{
    protected $cost;
    protected $book;

    /**
     * Good constructor.
     * @param float $cost - цена
     * @param string $book - название
     */
    public function __construct(float $cost, string $book)
    {
        $this->cost = $cost;
        $this->book = $book;
    }

    /**
     * Метод возвращает цену
     * @return mixed
     */
    public function getCost(): float
    {
        return $this->cost;
    }

    /**
     * Метод принимает и устанавливает цену
     * @param mixed $cost
     */
    public function setCost($cost)
    {
        $this->cost = $cost;
    }

    /**
     * Метод возвращает название
     * @return mixed
     */
    public function getName(): string
    {
        return $this->book;
    }

    /**
     * Метод принимает и устанавливает название
     * @param mixed $book
     */
    public function setName($book)
    {
        $this->book = $book;
    }


}