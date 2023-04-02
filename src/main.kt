fun main () {

    val strings = listOf("Linah", "Wambui", "Ann", "Faith", "Ken", "Hello", "Money", "Kenya", "Uganda", "Tanzania")
    val evenStrings = stringAtEvenIndices(strings)
    println(evenStrings)
    val heights = listOf(2.54, 3.45, 1.84, 5.42, 2.15, 4.25)
    val (averageHeight, totalHeight) = heightStatistics(heights)
    println("Average height: $averageHeight meters")
    println("Total height : $totalHeight meters")
    persons()
    person()
    println(cars())
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun stringAtEvenIndices(strings: List<String>): List<String> {
    return strings.filterIndexed { index, _ -> index % 2 == 0 }
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightStatistics(heights: List<Double>): Pair<Double, Double> {
    val totalHeight = heights.sum()
    val averageHeight = heights.average()
    return Pair(averageHeight, totalHeight)
}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun persons(){
    val person1= Person("Milcah",23,5.18,50.90)
    val person2=Person("Faith",47,5.25,56.00)
    val person3=Person("Sally",17,4.20,72.30)
    var people= listOf(person1,person2,person3)
    var sortedAges=people.sortedByDescending { people-> people.age }
    println(sortedAges)
}
//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class  Persons(var name:String, var age:Int, var height:Double, var weight:Double)
fun person(){
    val newPerson1 = Person("Brandon", 47, 5.4, 68.5)
    val newPerson2 = Person("Samuel", 27, 5.7, 55.7)
    var persons = listOf(newPerson1, newPerson2)
    println(persons.joinToString { persons-> persons.toString() })
}
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration: String, var mileage: Int)
fun cars():Int{
    var car1 = Car("KAX", 1500)
    var car2 = Car("KDH", 1200)
    var calc = listOf(car1,car2)
    val mileagecalc = calc.sumOf { x -> x.mileage } / calc.size
    return mileagecalc












}