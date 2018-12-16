<?php
namespace Classes;
require_once __DIR__ . '/Vehicle.php';

class Car extends Vehicle
{
    protected $fuel;

    public function __construct(string $color, int $speed, string $brand, int $fuel, User1 $user)
    {

    try{
        $user->isCanDriveCar();
        parent::__construct($color, $speed, $brand);
        $this->fuel = $fuel;
    } catch (\Exception $e){
        echo $e->getMessage();
    }


    }

    public function getFuelConsumption():float
    {
        return ($this->getTravelTime() * $this->fuel) / 100;
    }
}