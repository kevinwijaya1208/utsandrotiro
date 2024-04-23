package uts.c14210047.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val target = intent.getStringExtra(target)
        val nama = intent.getStringExtra(nama)
        val nomor = intent.getStringExtra(nomor)
        val email = intent.getStringExtra(email)

        var textNama = findViewById<TextView>(R.id.nama)
        textNama.text = nama

        var textNomor = findViewById<TextView>(R.id.nomor)
        textNomor.text = nomor

        var textEmail = findViewById<TextView>(R.id.email)
        textEmail.text = email

        val backButton = findViewById<Button>(R.id.backtohome)
        backButton.setOnClickListener {
            val intent = Intent(this@Details, MainActivity::class.java)
            startActivity(intent)
        }

        val saveButton = findViewById<Button>(R.id.edit)
        saveButton.setOnClickListener {
            val intentWithData = Intent(this@Details, Edit::class.java).apply {
                putExtra(MainActivity.target, target)
                putExtra(MainActivity.nomorBaru, nomor)
                putExtra(MainActivity.emailBaru, email)
            }
            startActivity(intentWithData)
        }
    }

    companion object{
        const val target = "GETDATA"
        const val nama = "GETDATA1"
        const val nomor = "GETDATA2"
        const val email = "GETDATA3"
    }
}