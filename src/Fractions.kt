fun main() {

    val f1 = Fraction(5, 10)
    val f2 = Fraction(4, 20)

    println(f1.normalize())
    println(f1.plus(f2))
    println(f1.times(f2))

}

class Fraction(n: Int, d: Int) {

    private var numerator: Int = n
    private var denominator: Int = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun normalize(): Fraction{

        for(x in 100 downTo 1){
            if(numerator % x == 0 && denominator % x == 0){
                numerator /= x
                denominator /= x
            }
        }

        return Fraction(numerator, denominator)
    }

    fun plus(other: Fraction): Fraction {

        numerator = numerator*other.denominator + denominator*other.numerator
        denominator = denominator*other.denominator

        val f3 = Fraction(numerator, denominator).normalize()


        return f3
    }

    fun times(other: Fraction): Fraction {

        numerator = numerator * other.numerator
        denominator = denominator * other.denominator

        var f3 = Fraction(numerator, denominator).normalize()

        return f3
    }


}