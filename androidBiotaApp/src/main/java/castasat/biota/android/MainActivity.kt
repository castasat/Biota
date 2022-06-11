package castasat.biota.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import castasat.biota.Greeting
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv: TextView = findViewById(R.id.text_view)
        tv.text = Greeting().greeting()
    }
}