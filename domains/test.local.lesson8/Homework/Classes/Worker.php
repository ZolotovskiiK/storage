<?php

namespace Classes;

class Worker
{
    protected $name;
    protected $payPerDay;
    protected $quantityWorkedDays;

    /**
     * Worker constructor.
     * @param string $name - имя пользователя.
     * @param float $payPerDay - зарплата в день.
     */
    public function __construct(string $name, float $payPerDay)
    {
        $this->name = $name;
        $this->payPerDay = $payPerDay;
    }

    /**
     * Принимает и устанавливает кол-во отрабртанных дней.
     * @param int $quantityWorkedDays - кол-во отработаггых дней.
     */
    public function setQuantityWorkedDays(int $quantityWorkedDays)
    {
        $this->quantityWorkedDays = $quantityWorkedDays;
    }

    /**
     * Возвращает кол-во отработанных дней.
     * @return int
     * @throws \Exception - не указанно кол-во рабочих дней.
     */
    public function getQuantityWorkedDays(): int
    {
        if ($this->quantityWorkedDays == 0) {
            throw new \Exception('Не указанно кол-во рабочих дней');
        }
        return $this->quantityWorkedDays;
    }

    /**
     * Пытается подсчитать зарплату, иначе возвращает текст ошибки из исключения.
     * @return float
     */
    public function calculateSalary(): float
    {
        try {
            return $this->payPerDay * $this->getQuantityWorkedDays();
        } catch (\Exception $e) {
            echo $e->getMessage();
            exit();
        }
    }
}

