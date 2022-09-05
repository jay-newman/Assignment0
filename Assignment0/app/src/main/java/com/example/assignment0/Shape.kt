// Jay Newman
// TUID:
package com.example.assignment0

abstract class Shape (_name : String) : Dimensionable{
    var name = _name
    // Returns Double
    fun getArea() : Double {
        return 10.00;
    }

    override fun printDimensions() {
        TODO("Not yet implemented")
    }
}