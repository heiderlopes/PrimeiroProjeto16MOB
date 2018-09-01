package br.com.heiderlopes.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Toast
import br.com.heiderlopes.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

        calcularIMC(peso.toDouble(), altura.toDouble())
    }

    private fun calcularIMC(peso: Double, altura: Double) {
        var imc = peso / (altura * altura)
        imc = 22.0

        
    }

    private fun setImagem(resourceId: Int) {
        ivIMC.setImageDrawable(
                ContextCompat.getDrawable(this, resourceId))
    }
}
