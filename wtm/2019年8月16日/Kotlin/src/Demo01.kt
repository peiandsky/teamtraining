import com.sun.org.apache.bcel.internal.generic.NEW
import java.io.BufferedReader
import java.util.*

//Kotlin 中表达式和语句
class Num() {
    fun read(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            return
        }
        println(number)
    }
}

fun main(args: Array<String>) {
    Num()
}


