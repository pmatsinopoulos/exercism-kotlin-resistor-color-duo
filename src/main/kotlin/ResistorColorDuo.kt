import kotlin.math.pow

object ResistorColorDuo {
    fun value(vararg colors: Color) = colors.take(2).reversed().foldIndexed(0) { index, acc, color ->
        acc + color.ordinal * 10.toDouble().pow(index.toDouble()).toInt()
    }
}
