<?php

namespace Classes;

trait DiscountTrait
{
    abstract protected function Test() : int;

    protected function getDiscount() : int
    {
        return 10;
    }

    public function getCostWithDiscount(int $cost) : int
    {
        return $cost - ($this->getDiscount() * $cost) / 100;
    }
}

trait AdditionalDiscount
{
   protected function getDiscount() : int
    {
        return 20;
    }
}