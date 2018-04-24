package sample.example.kotlinfeatures

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sample.example.kotlinfeatures.utils.fragmentLoader
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var user:String by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentLoader {
            replace(R.id.frameDemo, KotlinFragment())
            addToBackStack("demo")
        }


//        loadFragment(R.id.frameDemo, KotlinFragment())

    }
}
