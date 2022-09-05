package com.example.assignment0
import java.util.Scanner

class Circle(_name: String) : Shape(_name) {
    private var length: Double = 0.00
    private var height: Double = 0.00
    override fun setDimensions() {

        println("Please enter the length and height for a circle and press enter.");
        val reader = Scanner(System.`in`)
        print("Enter the length: ")
        // nextInt() reads the next integer from the keyboard
        length = reader.nextDouble()
        println("You entered: $length")
        print("Enter the height: ")
        height = reader.nextDouble()
        println("You entered: $height")
    }

     override fun getArea(): Double {
        return (length * height)
    }
}