object ResistorColorDuo {
    fun value(vararg colors: Color) = "${colors[0].ordinal}${colors[1].ordinal}".toInt()
}
