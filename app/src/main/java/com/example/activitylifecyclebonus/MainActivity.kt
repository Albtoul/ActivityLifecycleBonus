package com.example.activitylifecyclebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    var stats= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv=findViewById(R.id.textview)

    }

    override fun onResume() {
        super.onResume()
        stats="${tv.text} \n Online!!"
        tv.text = "$stats"
    }

    override fun onPause() {
        super.onPause()
        val date= SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        stats = "${tv.text} \n Last Seen $date"
        tv.text="$stats"
    }


}