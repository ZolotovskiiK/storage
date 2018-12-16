<?php
header('Content-Type: text/html;charset=utf-8');
error_reporting(E_ALL);

class User
{
    private $login = 'admin';
    private $password = 11;

    public function check($login, $password)
    {
        if ($this->login == $login && $this->password == $password) {

            return true;
        };
        return false;
    }

    public function logout()
    {
        $session = new Session();
        $session->destroy();
    }
}

class Session
{
    public function destroy()
    {
        session_destroy();
        header('Location: /oop/calculator/index.php');
        exit();
    }

    public function set($key, $value)
    {
        $_SESSION[$key] = $value;
    }

    public function get($key)
    {
        return $_SESSION[$key];
    }
}

class Calculator
{
    private $way = __DIR__.'/data.txt';

    public function addition($a, $b)
    {
        $result = $a + $b;
        $text = "$a" . " + " . "$b = $result\n";
        file_put_contents( $this->way, $text, FILE_APPEND);
        return $result;
    }

    public function subtraction($a, $b)
    {
        $result = $a - $b;
        $text = "$a" . " - " . "$b = $result\n";
        file_put_contents( $this->way, $text, FILE_APPEND);
        return $result;
    }

    public function multiplication($a, $b)
    {
        $result = $a * $b;
        $text = "$a" . " * " . "$b = $result\n";
        file_put_contents( $this->way, $text, FILE_APPEND);
        return $result;
    }

    public function division($a, $b)
    {

        if ($b == 0) {
            $result = "На 0 делить нельзя";
            $text = "$a" . " / " . "$b = $result\n";
            file_put_contents(__DIR__ . $this->way, $text, FILE_APPEND);
            return $result;
        }
        $result = $a / $b;
        $text = "$a" . " / " . "$b = $result\n";
        file_put_contents(__DIR__ . $this->way, $text, FILE_APPEND);
        return $result;
    }
}

