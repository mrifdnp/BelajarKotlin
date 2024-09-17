package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    fun main() {
        val mixArray: Array<Any?> = arrayOfNulls(5)
        println(mixArray.size)
        for(i in 0 until mixArray.size){
            println(mixArray[i])
        }
    }

