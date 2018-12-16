<?php

namespace Classes;

class BookCacheDecorator
{
    protected $cache = [];
    protected $book;

    public function __construct(CacheInterface $cache, BookInterface $book)
    {
        $this->book = $book;
        $this->cache = $cache;
    }

    public function getBook()
    {
        if (array_key_exists($this->book, $this->cache) == true) {
            return $this->cache;
        } else {
            return $this->cache[$book] = $book->getAuthor();

        }
    }
}