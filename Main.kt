fun main(){
/* */
    //Create a mutable dictionary
    val World = mutableMapOf<String,String>()

    println("Would you give us a country and capital, please?")
//After user has entered 3 pairs,
for (i in 0..2) {
    //Ask users to enter a country and save it as the key
    print("Country: ")
    var country = readLine()!!.toString()
    //Ask user to enter a capital and save it as the value
    print("Capital: ")
    var capital = readLine()!!.toString()

    World.put(country, capital)
}

    //print each country and its capital
    for (i in World){
        println("${i.key}'s capital is  ${i.value}")
    }
}