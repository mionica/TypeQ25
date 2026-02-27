package ro.pastiera.typeq25

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import ro.pastiera.typeq25.ui.theme.TypeQ25Theme

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TypeQ25Theme {
                SettingsScreen(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

