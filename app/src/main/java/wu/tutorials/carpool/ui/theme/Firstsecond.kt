package wu.tutorials.carpool.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstSecond() {
    Column (modifier = Modifier
        .fillMaxWidth()
        .padding(top = 150.dp, bottom = 30.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "CarPoolin ", fontSize = 42.sp, fontWeight = FontWeight.Bold)
        Text(text = "Drive & Save Money", fontSize = 24.sp, fontWeight = FontWeight.Bold)

    }

}