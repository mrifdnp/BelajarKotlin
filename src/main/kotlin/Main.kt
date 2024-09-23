package com.dicoding.kotlin
import com.dicoding.oop.utils.*


data class DataUser(val name:String, val age:Int){
    fun intro(){
        println("$name, $age")

    }
}
fun main() {
    val dataUser = DataUser("Teresa", 21)
    val dataUser2 = DataUser("Teresa", 21)
    val dataUser3 = DataUser("ikeda", 21)
    val dataUser4 = dataUser.copy(name="sheng")




  dataUser4.intro()
    dataUser.intro()

}
