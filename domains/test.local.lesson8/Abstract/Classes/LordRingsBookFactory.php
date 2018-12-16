<?php
/**
 * Created by PhpStorm.
 * User: user
 * Date: 24.11.2018
 * Time: 10:36
 */

namespace Classes;


class LordRingsBookFactory
{
    public function create($name, $author, $edition): BookInterface
    {
        if (LordKingBook::SPECIAL_EDITION === $edition) {
            return new LordKingBook(LordKingBook::SPECIAL_EDITION_PRICE, $name, $author);
        }
        return new LordKingBook(LordKingBook::REGULAR_EDITION_PRICE, $name, $author);
    }
}