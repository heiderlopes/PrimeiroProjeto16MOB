package br.com.heiderlopes.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        carregar()
    }

    private fun carregar() {
        Handler().postDelayed({
            chamarProximaTela()
        }, 2000L)
    }

    private fun chamarProximaTela() {
        val proximaTelaIntent = Intent(this,
                FormularioActivity::class.java)
        startActivity(proximaTelaIntent)
        finish()
    }
}
