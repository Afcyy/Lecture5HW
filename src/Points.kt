import kotlin.reflect.typeOf

fun main() {
    val n = Point(2,5)
    val m = Point(3 , 5)

    println(n == m)
    n.transfer()
    println(n)

}

class Point(var x: Int,var y: Int){

    override fun toString(): String {
        return "x = $x, y= $y"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point){
            if(x == other.x && y == other.y){
                return true
            }
        }
        return false
    }

    fun transfer(): Point {
        x = -x
        y = -y
        return Point(x, y)
    }
}