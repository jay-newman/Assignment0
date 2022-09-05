package com.example.assignment0
import java.util.Scanner
import kotlin.math.*

class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.00

    override fun setDimensions() {
        println("Please enter the radius of the circle.");
        val reader = Scanner(System.`in`)
        print("Enter the radius: ")
        radius = reader.nextDouble()
        println("You entered: $radius")
    }

    override fun getArea(): Double {
        return (PI * (radius * radius))
    }

    override fun printDimensions() {
        println("The radius of the circle is: $radius")
    }


}