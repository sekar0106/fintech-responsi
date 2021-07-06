package io.github.sekar0106.responsifintech.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import io.github.sekar0106.responsifintech.Home.HomeActivity
import io.github.sekar0106.responsifintech.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var tv_forgotPass : TextView
    private lateinit var regis : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_pswd)
        btnLogin = findViewById(R.id.btn_login)
        regis = findViewById(R.id.tv_regis)
        tv_forgotPass = findViewById(R.id.tv_forgotPass)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()
            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else{
                val intentDashboardActivity: Intent = Intent(this, HomeActivity::class.java).apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intentDashboardActivity)
        }
    }
        regis.setOnClickListener{
            val intentRegisPelangganActivity = Intent(this, RegisterActivity::class.java).apply {
                //              addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intentRegisPelangganActivity)
}
        tv_forgotPass.setOnClickListener{
            val intentRegisPelangganActivity = Intent(this, RecoveryActivity::class.java).apply {
                //              addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intentRegisPelangganActivity)
        }
}
}