package com.bsewamods.cuadricula_cursos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bsewamods.cuadricula_cursos.datos.DataSource
import com.bsewamods.cuadricula_cursos.modelos.Topic
import com.bsewamods.cuadricula_cursos.ui.theme.Cuadricula_CursosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cuadricula_CursosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Grid(modifier: Modifier){
    LazyVerticalGrid(GridCells.Fixed(2), )
    {
        items(DataSource.topics){
            topic -> cartaTopic(topic)
        }
    }
}

@Composable
fun cartaTopic(topic: Topic){

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cuadricula_CursosTheme {
        //
    }
}