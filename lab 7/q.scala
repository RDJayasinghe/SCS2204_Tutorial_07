def filterEvenNumbers(numbers1: List[Int]): List[Int] =
{
    numbers1.filter(number => number % 2 == 0)
}
def calculateSquare(numbers2: List[Int]): List[Int] =
{
    numbers2.map (number => number * number)
}

def isPrime(num: Int): Boolean =
{
    if(num <= 1) false
    else if(num == 2) true
    else !(2 to (num - 1)).exists(x => num % x == 0)
}
def filterPrime(numbers3: List[Int]): List[Int] =
{
    numbers3.filter(isPrime)
}

def main(args:Array[String]):Unit=
{
    val input = List(1,2,3,4,5,6,7,8,9,10)
    val output1 = filterEvenNumbers(input)
    val output2 = calculateSquare(input)
    val output3 = filterPrime(input)
    println(output1)
    println(output2)
    println(output3)
}