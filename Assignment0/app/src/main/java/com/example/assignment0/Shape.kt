package com.example.assignment0

abstract class Shape (_name : String) : Dimensionable{
    var name = _name

    open fun getArea() : Double {
        return 0.00
    }

    override fun printDimensions() {
        println("Here are the shapes dimensions")
    }
    // Put function here because all shapes need dimensions to be set
    override fun setDimensions(){
        println("Please enter the dimensions of the shape")
    }
}