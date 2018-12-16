<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);
class Stadium
{
    public $location;
    public $name;
    public $capacity;

    const TICKET_PRICE = 1230;

    public function __construct($location, $name, $capacity)
    {
        $this->location = $location;
        $this->name = $name;
        $this->capacity = $capacity;
    }

    public function playMatch($team1, $team2)
    {
        return $team1 . ' 1-0 ' . $team2 . ' На матче присутствовало ' . $this->capacity;
    }

    public function setCapacity($capacity)
    {
        $this->capacity = $capacity;
    }

    public function getCapacity()
    {
        return $this->capacity;
    }

    public static function getTicketPrice()
    {
        return self::TICKET_PRICE;
    }

    public static function getClassName()
    {
        return __CLASS__;
    }

    public function __toString()
    {
        return 'Hello world';
    }

}

$stadium = new Stadium('Moscow', 'Luzhniki', '81000');

echo $stadium->getCapacity() . '<br>';

$stadium->setCapacity(90000);

echo $stadium->getCapacity() . '<br>';
echo Stadium::TICKET_PRICE . '<br>';
echo Stadium::getTicketPrice() . '<br>';
echo Stadium::getClassName() . '<br>';
echo $stadium;