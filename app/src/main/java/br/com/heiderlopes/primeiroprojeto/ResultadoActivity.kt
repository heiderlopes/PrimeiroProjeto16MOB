package br.com.heiderlopes.primeiroprojeto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import br.com.heiderlopes.primeiroprojeto.extensions.format
import br.com.heiderlopes.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val peso = intent.extras.getString(ConstantesExtra.KEY_PESO)
        val altura = intent.extras.getString(ConstantesExtra.KEY_ALTURA)

        calcularIMC(peso.toDouble(), altura.toDouble())
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun calcularIMC(peso: Double, altura: Double) {
        var imc = peso / (altura * altura)
        tvIMC.text = imc.format(0)
        if(imc < 17) {

            setImagem(R.drawable.magreza)
            tvIMCDescricao.text = getString(R.string.label_magreza)
        } else if (imc < 18.5){
            setImagem(R.drawable.abaixo)
            tvIMCDescricao.text = getString(R.string.label_abaixo_peso)
        } else if(imc < 24.9) {
            setImagem(R.drawable.ideal)
            tvIMCDescricao.text = getString(R.string.label_peso_ideal)
        } else if (imc < 29.9) {
            setImagem(R.drawable.sobre)
            tvIMCDescricao.text = getString(R.string.label_sobrepeso)
        } else if(imc < 34.9) {
            setImagem(R.drawable.obesidade)
            tvIMCDescricao.text = getString(R.string.label_obsidade1)
        } else if (imc < 39.9) {
            setImagem(R.drawable.obesidade)
            tvIMCDescricao.text = getString(R.string.label_obsidade2)
        } else {
            setImagem(R.drawable.obesidade)
            tvIMCDescricao.text = getString(R.string.label_obsidade3)
        }
    }

    private fun setImagem(resourceId: Int) {
        ivIMC.setImageDrawable(
                ContextCompat.getDrawable(this, resourceId))
    }
}
