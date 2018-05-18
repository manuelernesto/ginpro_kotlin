fun main(args: Array<String>) {
    print("Enter n1:")
    var n1: Float = readLine()!!.toFloat()
    print("Enter n2:")
    var n2: Float = readLine()!!.toFloat()

    var sum: Float?
    var sub: Float?
    var div: Float?
    var mult: Float?

    sum = n1 + n2
    div = n1 / n2
    mult = n1 * n2
    sub = n1 - n2

    println("*********RESULT***********")
    println("The Sum is $sum")
    println("The Division is $div")
    println("The Subtract is $sub")
    println("The Multplication is $mult")
}