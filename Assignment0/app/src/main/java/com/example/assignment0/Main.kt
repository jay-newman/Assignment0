// Jay Newman
// TUID: 916086743
// Assignment 0
// 9/11/22

package com.example.assignment0

fun main(args: Array<String>){

    val circle: Shape = Circle("Jay's Circle")
    circle.setDimensions()

    val square: Shape = Square("Jay's Square")
    square.setDimensions()

    val triangle: Shape = Triangle("Jay's Triangle")
    triangle.setDimensions()

    val equalTriangle: Shape = EquilateralTriangle("Jay's Equilateral Triangle")
    equalTriangle.setDimensions()

    println()
    circle.printDimensions()
    println("The area of ${circle.name} is ${circle.getArea()}\n")
    square.printDimensions()
    println("The area of ${square.name} is ${square.getArea()}\n")
    triangle.printDimensions()
    println("The area of ${triangle.name} is ${triangle.getArea()}\n")
    equalTriangle.printDimensions()
    println("The area of ${equalTriangle.name} is ${equalTriangle.getArea()}\n")

}