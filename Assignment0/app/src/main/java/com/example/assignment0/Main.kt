package com.example.assignment0

fun main(args: Array<String>){
    val circle = Circle("JaysCircle");
    val area = circle.getArea();
    println("The circle area of ${circle.name} is $area");
}