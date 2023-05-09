fun main() {
    numbers()
    println(identity("miriam","mercy","jane").contentToString())

}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum =numbers[2]+numbers[5]
    println(sum)
    println(numbers.sum())
    println(numbers.indexOf(158))
    println(numbers.sorted())


}


//2. Given a list of Person objects, each with the attributes, name, age, height, and weight.
// Sort the list in order of descending age (2 points)
data class pERSON(var name:String,var age:Int,var height:Double,var weight:Double)
fun person1=Person("miriam")


//3. Create a function that takes in 3 names and returns a string array containing all 3 names. (2 points)
fun identity(name1: String,name2: String,name3: String):Array<String>{
    var names= arrayOf(name1,name2,name3)
    return names

}
//4. Write a function that takes in a list of Car objects each with a registration and mileage
// attribute and returns the average mileage of all the vehicles in the list. (3 points)
data class Car(var registration: String,var miliage:Double )
fun carIdentificatin(car: List<Car>):Double{
    var miliage=0.0
    for (car in car){
        miliage+=car.miliage
    }
    return miliage/car.size
}













