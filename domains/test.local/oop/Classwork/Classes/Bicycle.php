<?php
namespace Classes;
require_once __DIR__ . '/Vehicle.php';

class Bicycle extends Vehicle
{
    const CALORIES_PER_HOUR = 500;

    public function getTravelTime(): float
    {
        return parent::getTravelTime() * 1.5;
    }

    public function getCountOfBurnedCalories(): int
    {
        return parent::getTravelTime() * self::CALORIES_PER_HOUR;
    }
}