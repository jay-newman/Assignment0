package com.example.assignment0

fun main(args: Array<String>){

    val circle: Shape = Circle("Jay's Circle")
    circle.setDimensions()

    val area = circle.getArea()
    println("The circle area of ${circle.name} is $area")
}