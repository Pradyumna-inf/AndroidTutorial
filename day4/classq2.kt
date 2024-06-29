abstract class Shape {
    
    abstract fun area(): Double
}
class Rectangle(val width: Double,val height: Double) : Shape() {
    
    fun perimeter(): Double {
        return 2 * (width + height)
    }
    
    
    override fun area(): Double {
        return width * height
    }
}


class Circle(val radius: Double) : Shape() {
    
    
    fun perimeter(): Double {
        return 2 * 3.14* radius
    }
    
    
    override fun area(): Double {
        return 3.14* radius * radius
    }
}

fun main() {
    val rectangle: Shape = Rectangle(5.0, 3.0)
    val circle: Shape = Circle(7.0)
    
    
    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${(rectangle as Rectangle).perimeter()}")
    println("Circle - Area: ${circle.area()}, Perimeter: ${(circle as Circle).perimeter()}")
}

