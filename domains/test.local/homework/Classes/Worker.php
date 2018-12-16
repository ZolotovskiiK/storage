<?php

class Worker
{
    public $name;
    public $payPerDay;
    public $quantityWorkedDay;

    public function __construct(string $name, int $payPerDay)
    {
        $this->name = $name;
        $this->payPerDay = $payPerDay;
    }

    public function setQuantityWorkedDay(int $quantityWorkedDay)
    {
        $this->quantityWorkedDay = $quantityWorkedDay;
    }

    public function getQuantityWorkedDay()
    {
        if ($this->quantityWorkedDay == 0) {
            throw new \Exception('Не указанно кол-во рабочих дней');
        }
        return $this->quantityWorkedDay;
    }

    public function calculateSalary()
    {
        try {
            return $this->payPerDay * $this->getQuantityWorkedDay();
        } catch (\Exception $e) {
            echo $e->getMessage();
            exit();
        }


    }

}
