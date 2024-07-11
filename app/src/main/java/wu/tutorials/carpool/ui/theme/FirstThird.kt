package wu.tutorials.carpool.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import wu.tutorials.carpool.R

@Composable
fun FirstThird() {
    Column (modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        IconButton(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.homescreenarrow), contentDescription ="Arrow Button" )

        }
    }

}