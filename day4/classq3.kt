interface Drawable {
    fun drawInfo()
}

class Square(val sideLength: Double) : Drawable {
    override fun drawInfo() {
        val area = sideLength * sideLength
        val perimeter = 4 * sideLength
        println("Square:")
        println("Side Length: $sideLength")
        println("Area: $area")
        println("Perimeter: $perimeter")
    }
}

class Triangle(val base: Double,  val height: Double) : Drawable {
    override fun drawInfo() {
        val area = 0.5 * base * height
        val perimeter = base + 2 * Math.sqrt((0.25 * base * base) + (height * height))
        println("Triangle:")
        println("Base: $base")
        println("Height: $height")
        println("Area: $area")
        println("Perimeter: $perimeter")
    }
}

fun main() {
    val square = Square(5.0)
    val triangle = Triangle(4.0, 3.0)

    square.drawInfo()
    println()
    triangle.drawInfo()
}

