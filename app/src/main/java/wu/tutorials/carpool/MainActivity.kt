package wu.tutorials.carpool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import wu.tutorials.carpool.ui.theme.CarpoolTheme
import wu.tutorials.carpool.ui.theme.FirstSecond
import wu.tutorials.carpool.ui.theme.FirstThird

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            First()
        }
    }
}

@Composable
fun First() {
    Column {
        FirstPage()
        FirstSecond()
        FirstThird()
    }


}
