package uts.c14210047.app

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val target = intent.getStringExtra(target)?.toInt()
        val nama = intent.getStringExtra(nama)
        val nomorEditable = SpannableStringBuilder(intent.getStringExtra(nomor))
        val emailEditable = SpannableStringBuilder(intent.getStringExtra(email))

        var textNomor = findViewById<EditText>(R.id.text1)
        textNomor.text = nomorEditable

        var textEmail = findViewById<EditText>(R.id.text2)
        textEmail.text = emailEditable

        var textNama = findViewById<TextView>(R.id.text3)
        textNama.text = nama

        val backButton = findViewById<Button>(R.id.backtohome)
        backButton.setOnClickListener {
            val intent = Intent(this@Edit, MainActivity::class.java)
            startActivity(intent)
        }

        val saveButton = findViewById<Button>(R.id.save)
        saveButton.setOnClickListener {
            val intentWithData = Intent(this@Edit, MainActivity::class.java).apply {
                putExtra(MainActivity.target, target)
                putExtra(MainActivity.nomorBaru,textNomor.text.toString())
                putExtra(MainActivity.emailBaru ,textEmail.text.toString())
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