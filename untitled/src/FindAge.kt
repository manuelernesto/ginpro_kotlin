import java.time.Year
import java.util.*

fun main(args: Array<String>) {
    print("Enter your beathday year:")
    var myyear: Int
    myyear =  readLine()!!.toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age : Int = year - myyear
    println("Your age is: $age")

}