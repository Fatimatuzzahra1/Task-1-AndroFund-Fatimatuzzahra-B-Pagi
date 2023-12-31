package com.example.latihanfatima

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv:TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView2)

        val usernamee = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password
        tv.text = "Username: $usernamee dan Password: $password"

        val btnImplicit: Button = findViewById(R.id.btn_Implicit)
        btnImplicit.setOnClickListener(this)

        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Implicit -> {
 //               val message = "Hallo tes"
 //               val intent = Intent()
 //               intent.action = Intent.ACTION_SEND
 //               intent.putExtra(Intent.EXTRA_TEXT, message)
 //               intent.type = "text/plain"
 //               startActivity(intent)

                val intent = Intent()
                intent.putExtra("history", "Berhasil Login")
                setResult(RESULT_OK, intent)
                finish()
            }
            R.id.btn_fragment -> {
                val intent = Intent(this@MainActivity, TestActivity::class.java)
                startActivity(intent)
            }
        }
    }
}