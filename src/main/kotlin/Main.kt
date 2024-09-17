package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    fun main() {
        val text  = "teresa"
        for (char in text){
            //string template
            print("$char ")


        }

        //Escaped String
        val statement = "Kotlin is \"Awesome!\""
        println("\nstatement")

        //unicode
        val unicode = "Unicode test: \u00A9"
        println(unicode)

        //RawString
        val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

        print(line)



    }

    /*
      output : The 4th character of the Dicoding is o
    */

