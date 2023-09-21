package com.bsewamods.cuadricula_cursos.modelos

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nombre: Int,
    val cursosdisponibles: Int,
    @DrawableRes val resImagen: Int
)