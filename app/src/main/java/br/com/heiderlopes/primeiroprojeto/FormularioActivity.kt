package br.com.heiderlopes.primeiroprojeto

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.primeiroprojeto.extensions.meuclear
import br.com.heiderlopes.primeiroprojeto.extensions.value
import br.com.heiderlopes.primeiroprojeto.utils.ConstantesExtra
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btLimpar.setOnClickListener {
            inputPeso.meuclear()
            inputAltura.meuclear()
        }

        btCalcular.setOnClickListener {
            chamarTelaResultado()
        }
    }

    private fun chamarTelaResultado() {
        val telaResultadoIntent = Intent(this,
                ResultadoActivity::class.java)
        telaResultadoIntent.putExtra(ConstantesExtra.KEY_PESO, inputPeso.value())
        telaResultadoIntent.putExtra(ConstantesExtra.KEY_ALTURA, inputAltura.value())
        startActivity(telaResultadoIntent)
    }

}














