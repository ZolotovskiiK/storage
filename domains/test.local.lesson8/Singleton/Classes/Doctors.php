<?php
/**
 * Created by PhpStorm.
 * User: user
 * Date: 08.12.2018
 * Time: 12:06
 */

class Doctors
{
    private $id;
    private $lastName;
    private $name;
    private $phone;
    private $salary;
    private $employmentDate;

    /**
     * Doctors constructor.
     * @param $id
     * @param $lastName
     * @param $name
     * @param $phone
     * @param $salary
     * @param $employmentDate
     */
    protected function __construct($id, $lastName, $name, $phone, $salary, $employmentDate)
    {
        $this->id = $id;
        $this->lastName = $lastName;
        $this->name = $name;
        $this->phone = $phone;
        $this->salary = $salary;
        $this->employmentDate = $employmentDate;
    }
    public function find($id)
    {

    }


    public function save()
    {

    }

    public function delete()
    {

    }

}