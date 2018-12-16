<?php

class Example
{
    function checkWeight($weight = 0)
    {
        return $weight >= 100 && $weight <= 999;
    }

    function featureA()
    {
        echo 'Feature A';
        echo 'Developing feature A';
    }

    function featureB()
    {
        echo 'feature B';
        echo 'feature B - second commit';
    }
}