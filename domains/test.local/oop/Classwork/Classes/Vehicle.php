<?php

namespace Classes;

class Vehicle
{
    protected $color;
    protected $speed;
    protected $brand;
    protected $distance;

    public function __construct(string $color, int $speed, string $brand)
    {
        $this->color = $color;
        $this->speed = $speed;
        $this->brand = $brand;
    }

    public function getDistance(): int
    {
        return $this->distance;
    }

    public function setDistance(int $distance)
    {
        $this->distance = $distance;
    }

    public function getSpeed(): int
    {
        return $this->speed;
    }

    public function getTravelTime(): float
    {
        return $this->getDistance() / $this->getSpeed();
    }


}