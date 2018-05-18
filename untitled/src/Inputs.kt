fun main(args: Array<String>) {
    print("Enter the name:")
    var name = readLine()
    print("Enter the Age:")
    var age: Int = readLine()!!.toInt()

    print("Your name is:" + name);

    print("Your Age is:" + age)
}