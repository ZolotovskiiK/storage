<?php


final class DB
{
    protected static $_pdo = null;

    private static $dbHost = '127.0.0.1:3307';
    private static $dbName = 'clinic';
    private static $dbUser = 'root';
    private static $dbPass = '';

    protected function __construct()
    {
    }

    protected function __clone()
    {
    }

    protected function __wakeup()
    {
    }

    public static function pdo()
    {
        if (is_null(self::$_pdo)) {
            echo 'Creating new connection<br>';
            self::$_pdo = new PDO(
                'mysql:host=' . self::$dbHost . 'dbname=' . self::$dbName,
                self::$dbUser,
                self::$dbPass);

        }
        return self::$_pdo;
    }
}