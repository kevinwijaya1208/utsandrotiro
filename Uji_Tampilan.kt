package uts.c14210047.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Uji_Tampilan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uji_tampilan)

        val btn = findViewById<Button>(R.id.back)
        btn.setOnClickListener {
            val intent = Intent(this@Uji_Tampilan, MainActivity::class.java)
            startActivity(intent)
        }
    }
}