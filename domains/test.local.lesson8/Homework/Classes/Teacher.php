<?php

namespace Classes;

class Teacher extends Worker
{
    protected $workExperience;

    const PREMIUM = array(1 => 3, 3 => 5, 5 => 10);
    const CONVERSION = 10;
    const DAYS_RATE = 25;


    /**
     * Teacher constructor.
     * @param string $name - имя пользователя.
     * @param float $payPerDay - зарплата в день.
     * @param int $workExperience - стаж работы.
     */
    public function __construct(string $name, float $payPerDay, int $workExperience)
    {
        parent::__construct($name, $payPerDay);
        $this->workExperience = $workExperience;
    }

    /**
     * Возвращает сумму премии из константы PREMIUM исходя из стажа.
     * @return float
     */
    public function getPremium(): float
    {
        if ($this->workExperience > 1 && $this->workExperience < 3) {
            $this->workExperience = 1;
        } elseif ($this->workExperience > 3 && $this->workExperience < 5) {
            $this->workExperience = 3;
        } elseif ($this->workExperience > 5) {
            $this->workExperience = 5;
        }
        return (parent::calculateSalary() / 100) * self::PREMIUM[$this->workExperience];
    }

    /**
     * Возвращает сумму переработки, если пользователь отработал больше 25 дней, иначе возвращает 0.
     * @return float
     */
    public function getConversion(): float
    {
        if ($this->quantityWorkedDays > 25) {
            return (parent::calculateSalary() / 100) * self::CONVERSION;
        }
        return 0;
    }

    /**
     * Возвращает сумму зарплаты с учетом премии и переработки.
     * @return float
     */
    public function calculateSalary(): float
    {
        return parent::calculateSalary() + $this->getPremium() + $this->getConversion();
    }
}

