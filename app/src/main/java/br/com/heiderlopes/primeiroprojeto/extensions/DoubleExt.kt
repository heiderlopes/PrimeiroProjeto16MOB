package br.com.heiderlopes.primeiroprojeto.extensions

fun Double.format(digitos: Int) = String.format("%.${digitos}f", this)