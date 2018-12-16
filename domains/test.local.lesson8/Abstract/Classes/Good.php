<?php

abstract class Good
{
    protected $cost;

    public function __construct($cost)
    {
        return $this->cost = $cost;
    }

    abstract public function sell(): string;

    abstract public function buy(): string;

    public function getCost()
    {
        return $this->cost;
    }

    public function setCost($cost)
    {
$this->cost = $cost;
return $this;
    }
}