package sample.example.kotlinfeatures.utils

/**
 * Convert string to int and in case value is null return 0
 */
fun String.convertToInt(): Int {
    return this.toIntOrNull() ?: 0
}
