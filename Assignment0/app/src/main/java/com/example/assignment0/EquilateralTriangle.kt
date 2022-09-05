package com.example.assignment0

import java.util.*
import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side: Double = 0.00
    private var s: Double = 0.00

    override fun setDimensions() {
        print("Please enter the length for all three sides of the triangle and press enter: ")
        val reader = Scanner(System.`in`)
        side = reader.nextDouble()
    }

    override fun getArea(): Double {
        s = (.5 * (side * 3))
        return (sqrt(s * (s-side) * (s-side) * (s-side)))
    }

    override fun printDimensions() {
        println("The dimensions of the triangle are:\nSide One: $side\nSide Two: $side\n" +
                "Side Three: $side")
    }
}