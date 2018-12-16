<?php

namespace Classes;

abstract class Good
{
    protected $cost;

    abstract public function sell() : string;
    abstract public function buy() : string;

    public function __construct($cost)
    {
        $this->cost = $cost;
    }

    public function getCost()
    {
        return $this->cost;
    }

    public function setCost($cost): Good
    {
        $this->cost = $cost;
        return $this;
    }


}