package com.example.assignment0

import java.util.*
import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    private var side1: Double = 0.00
    private var side2: Double = 0.00
    private var side3: Double = 0.00
    private var s: Double = 0.00

    override fun setDimensions() {
        println("Please enter the length of all three sides of the triangle and press enter.")
        val reader = Scanner(System.`in`)
        print("Enter the length of the first side: ")
        side1 = reader.nextDouble()
        print("Enter the length of the second side: ")
        side2 = reader.nextDouble()
        print("Enter the length of the third side: ")
        side3 = reader.nextDouble()
        while((side1 + side2) <= side3) {
                print("Enter the length of the third side: ")
                side3 = reader.nextDouble()
        }
        s = (.5 * (side1 + side2 + side3))
     }

    override fun getArea(): Double {
        return (sqrt(s * (s-side1) * (s-side2) * (s-side3)))
    }

    override fun printDimensions() {
        println("The dimensions of the triangle are:\nSide One: $side1\nSide Two: $side2\nSide Three: $side3")
    }
}