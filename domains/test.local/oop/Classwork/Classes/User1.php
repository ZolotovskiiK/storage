<?php
namespace Classes;

class User1
{
    public $name;
    public $age;

    public function __construct($name, $age)
    {
        $this->name = $name;
        $this->age = $age;
    }

    public function isCanDriveCar()
    {
        if ($this->age < 18) {
            throw new \Exception('Вы не можете управлять автомобилем');
        }
        return true;
    }
}