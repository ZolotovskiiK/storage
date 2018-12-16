<?php

namespace Classes;

class Book extends Good implements BookInterface
{
    protected $author;
    protected $quantityPages;

    /**
     * Book constructor.
     * @param string $author - Автор
     * @param int $quantityPages - Кол-во страниц
     * @param float $cost - Цена
     * @param string $book - Название книги
     */
    public function __construct(string $author, int $quantityPages, float $cost, string $book)
    {
        parent::__construct($cost, $book);
        $this->author = $author;
        $this->quantityPages = $quantityPages;
    }


    /**
     * Метод возвращает контент
     * @return string
     */
    public function getContent(): string
    {
        return 'Автор: ' . $this->author . ', Книга: ' . $this->book;
    }

    /**
     * Метод возвращает автора
     * @return string
     */
    public function getAuthor(): string
    {
        return $this->author;
    }

    /**
     * Метод возвращает кол-во страниц
     * @return int
     */
    public function getQuantityPages(): int
    {
        return $this->quantityPages;
    }
}