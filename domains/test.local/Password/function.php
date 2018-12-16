<?php

function auth($login, $pass)
{
    $trueLogin = 'admin';
    $truePass = 11;

    if ($login == $trueLogin && $pass == $truePass) {
        $_SESSION['login'] = $login;
        $_SESSION['pass'] = $pass;
        return true;
    };
    return false;
}

