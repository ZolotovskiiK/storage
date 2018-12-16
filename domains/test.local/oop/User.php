<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);

 class User1
{
    public $name;
    public $age;
    private $nationality;

    const ARMS_QUANTITY = 2;
    const FOOT_QUANTITY = 2;

    public function __construct($name, $age,$nationality)
    {
        $this->name = $name;
        $this->age = $age;
        $this->nationality = $nationality;
    }

    public function setNationality($nationality)
    {
        $this->nationality = $nationality;
    }

    public function getNationality()
    {
        return $this->nationality;
    }

    public function __toString()
    {
        return 'Невозможное действие';
    }

    public function getName()
    {
        return $this->name;
    }

    public function toGreeting($userName)
    {
        return 'Здравствуйте ' . $userName . '. Меня зовут ' . $this->getName() . '<br>';
    }

    public function getStatus()
    {
        if (0 < $this->age && $this->age < 18) {
            return 'Ребенок';
        } elseif (17 < $this->age && $this->age < 65) {
            return 'Взрослый';
        } else {
            return 'Пенсионер';
        }
    }
}

$user = new User("Konstantin", "29", "Russian");
$userName = "Vasilii";
echo $user->toGreeting($userName);
$userName = "Petr";
echo $user->toGreeting($userName);
echo $user->getStatus().'<br>';
echo $user->getNationality().'<br>';
echo $user;
