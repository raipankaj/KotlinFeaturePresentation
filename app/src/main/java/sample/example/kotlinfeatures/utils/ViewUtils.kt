package sample.example.kotlinfeatures.utils

import android.widget.EditText
import android.widget.TextView

/**
 * Get the text from edit text and return the trimmed text.
 */
fun EditText.trimmedText() = this.text.toString().trim()

/**
 * Capitalize the first character of the sentence.
 */
fun TextView.capitailze() = this.text.toString().capitalize()

/**
 * Make all the characters uppercase.
 */
fun TextView.upperCase() = this.text.toString().toUpperCase()

/**
 * Make all the character lowercase.
 */
fun TextView.lowerCase() = this.text.toString().toLowerCase()