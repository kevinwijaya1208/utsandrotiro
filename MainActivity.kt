package uts.c14210047.app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //nama - detail
        var nama = findViewById<TextView>(R.id.nama1)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no1)
            val nama = findViewById<TextView>(R.id.nama1)
            val email = findViewById<TextView>(R.id.email1)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama2)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no2)
            val nama = findViewById<TextView>(R.id.nama2)
            val email = findViewById<TextView>(R.id.email2)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama3)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no3)
            val nama = findViewById<TextView>(R.id.nama3)
            val email = findViewById<TextView>(R.id.email3)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama4)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no4)
            val nama = findViewById<TextView>(R.id.nama4)
            val email = findViewById<TextView>(R.id.email4)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama5)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no5)
            val nama = findViewById<TextView>(R.id.nama5)
            val email = findViewById<TextView>(R.id.email5)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama6)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no6)
            val nama = findViewById<TextView>(R.id.nama6)
            val email = findViewById<TextView>(R.id.email6)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama7)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no7)
            val nama = findViewById<TextView>(R.id.nama7)
            val email = findViewById<TextView>(R.id.email7)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama8)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no8)
            val nama = findViewById<TextView>(R.id.nama8)
            val email = findViewById<TextView>(R.id.email8)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama9)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no9)
            val nama = findViewById<TextView>(R.id.nama9)
            val email = findViewById<TextView>(R.id.email9)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        nama = findViewById<TextView>(R.id.nama10)
        nama .setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no10)
            val nama = findViewById<TextView>(R.id.nama10)
            val email = findViewById<TextView>(R.id.email10)
            val intentWithData = Intent(this@MainActivity, Details::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        //foto - edit
        var foto = findViewById<ImageView>(R.id.foto1)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama1)
            val nomor = findViewById<TextView>(R.id.no1)
            val email = findViewById<TextView>(R.id.email1)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,1)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto2)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama2)
            val nomor = findViewById<TextView>(R.id.no2)
            val email = findViewById<TextView>(R.id.email2)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,2)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto3)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama3)
            val nomor = findViewById<TextView>(R.id.no3)
            val email = findViewById<TextView>(R.id.email3)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,3)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto4)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama4)
            val nomor = findViewById<TextView>(R.id.no4)
            val email = findViewById<TextView>(R.id.email4)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,4)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto5)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama5)
            val nomor = findViewById<TextView>(R.id.no5)
            val email = findViewById<TextView>(R.id.email5)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,5)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto6)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama6)
            val nomor = findViewById<TextView>(R.id.no6)
            val email = findViewById<TextView>(R.id.email6)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,6)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto7)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama7)
            val nomor = findViewById<TextView>(R.id.no7)
            val email = findViewById<TextView>(R.id.email7)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,7)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto8)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama8)
            val nomor = findViewById<TextView>(R.id.no8)
            val email = findViewById<TextView>(R.id.email8)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,8)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto9)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama9)
            val nomor = findViewById<TextView>(R.id.no9)
            val email = findViewById<TextView>(R.id.email9)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,9)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        foto = findViewById<ImageView>(R.id.foto10)
        foto .setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama10)
            val nomor = findViewById<TextView>(R.id.no10)
            val email = findViewById<TextView>(R.id.email10)
            val intentWithData = Intent(this@MainActivity, Edit::class.java).apply {
                putExtra(Edit.target,10)
                putExtra(Edit.nama,nama.text.toString())
                putExtra(Edit.nomor,nomor.text.toString())
                putExtra(Edit.email,email.text.toString())
            }
            startActivity(intentWithData)
        }

        //nomor - telepon
        var number = findViewById<TextView>(R.id.no1)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no1).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no2)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no2).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no3)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no3).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no4)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no4).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no5)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no5).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no6)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no6).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no7)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no7).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no8)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no8).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no9)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no9).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        number = findViewById<TextView>(R.id.no10)
        number.setOnClickListener {
            val nomor = findViewById<TextView>(R.id.no10).text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+nomor)
            startActivity(intent)
        }

        //email - kirim email
        var mail = findViewById<TextView>(R.id.email1)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama1)
            val email = findViewById<TextView>(R.id.email1)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email2)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama2)
            val email = findViewById<TextView>(R.id.email2)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email3)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama3)
            val email = findViewById<TextView>(R.id.email3)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email4)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama4)
            val email = findViewById<TextView>(R.id.email4)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email5)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama5)
            val email = findViewById<TextView>(R.id.email5)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email6)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama6)
            val email = findViewById<TextView>(R.id.email6)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email7)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama7)
            val email = findViewById<TextView>(R.id.email7)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email8)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama8)
            val email = findViewById<TextView>(R.id.email8)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email9)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama9)
            val email = findViewById<TextView>(R.id.email9)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        mail = findViewById<TextView>(R.id.email10)
        mail.setOnClickListener {
            val nama = findViewById<TextView>(R.id.nama10)
            val email = findViewById<TextView>(R.id.email10)

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:" + email.text.toString())
            intent.putExtra(Intent.EXTRA_SUBJECT, "Hi " + nama.text.toString())
            intent.putExtra(Intent.EXTRA_TEXT, "HALOOOO")
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Select your Email app"))
        }

        //ke uji tampilan
        val btn = findViewById<Button>(R.id.uji)
        btn.setOnClickListener {
            val intent = Intent(this@MainActivity, Uji_Tampilan::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        val target = intent.getStringExtra(target)?.toInt()
        val nomor = intent.getStringExtra(nomorBaru)
        val email = intent.getStringExtra(emailBaru)

        if(target === null)
            return

        var textNomor = findViewById<TextView>(R.id.no1)
        var textEmail = findViewById<TextView>(R.id.email1)
        if(target.toInt() == 1)
        {
            textNomor = findViewById<TextView>(R.id.no1)
            textEmail = findViewById<TextView>(R.id.email1)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 2)
        {
            textNomor = findViewById<TextView>(R.id.no2)
            textEmail = findViewById<TextView>(R.id.email2)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 3)
        {
            textNomor = findViewById<TextView>(R.id.no3)
            textEmail = findViewById<TextView>(R.id.email3)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 4)
        {
            textNomor = findViewById<TextView>(R.id.no4)
            textEmail = findViewById<TextView>(R.id.email4)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 5)
        {
            textNomor = findViewById<TextView>(R.id.no5)
            textEmail = findViewById<TextView>(R.id.email5)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 6)
        {
            textNomor = findViewById<TextView>(R.id.no6)
            textEmail = findViewById<TextView>(R.id.email6)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 7)
        {
            textNomor = findViewById<TextView>(R.id.no7)
            textEmail = findViewById<TextView>(R.id.email7)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 8)
        {
            textNomor = findViewById<TextView>(R.id.no8)
            textEmail = findViewById<TextView>(R.id.email8)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 9)
        {
            textNomor = findViewById<TextView>(R.id.no9)
            textEmail = findViewById<TextView>(R.id.email9)
            textNomor.text = nomor
            textEmail.text = email
        }
        else if(target.toInt() == 10)
        {
            textNomor = findViewById<TextView>(R.id.no10)
            textEmail = findViewById<TextView>(R.id.email10)
            textNomor.text = nomor
            textEmail.text = email
        }
    }

    companion object{
        const val target = "GETDATA"
        const val nomorBaru = "GETDATA1"
        const val emailBaru = "GETDATA2"
    }
}