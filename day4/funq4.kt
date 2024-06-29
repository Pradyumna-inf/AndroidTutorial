fun main() {
    println(factorial(5))
}
fun factorial(num:Int):Int{
    if (num==0 || num==1)
    {
        return 1
    }
    else
    {
        return num*factorial(num-1)
    }
}
