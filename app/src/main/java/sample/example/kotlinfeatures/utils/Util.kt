package sample.example.kotlinfeatures.utils

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Inflate fragment layout
 */
fun LayoutInflater.inflateLayout(layoutId: Int, viewGroup: ViewGroup?, parent: Boolean = false): View? {
    return inflate(layoutId, viewGroup, parent)
}

/**
 * Load fragment by replacing existing fragment
 */
fun AppCompatActivity.loadFragment(layoutId: Int, fragment: Fragment, backStack: String? = null) {
    supportFragmentManager
            ?.beginTransaction()
            ?.replace(layoutId, fragment)
            ?.addToBackStack(backStack)
            ?.commit()
}

inline fun AppCompatActivity.fragmentLoader(fragmentFunc: FragmentTransaction.() -> FragmentTransaction) {
    supportFragmentManager
            ?.beginTransaction()
            ?.fragmentFunc()
            ?.commit()
}

/**
 * Load layout for recycler view adapter
 */

fun ViewGroup.inflateAdapterLayout(layoutId: Int): View? {
    return LayoutInflater.from(this.context).inflate(layoutId, this, false)
}

