package com.example.test1

class Calculator {
    fun plus(num1 : Int, num2 : Int): Int {
        var res = num1+num2
        return res
    }
    fun min(num1 : Int, num2 : Int) : Int {
        var res = num1-num2
        return res
    }
    fun div(num1 : Int, num2 : Int): Int {
        var res = num1/num2
        return  res
    }
    fun mult(num1 : Int, num2 : Int): Int {
        var res = num1*num2
        return res
    }
}