 package id.go.diskominfosamarinda

 import android.os.Bundle
 import androidx.activity.ComponentActivity
 import androidx.activity.compose.setContent
 import androidx.activity.enableEdgeToEdge
 import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.foundation.layout.padding
 import androidx.compose.material3.Scaffold
 import androidx.compose.ui.Modifier
 import com.ramcosta.composedestinations.DestinationsNavHost
 import dagger.hilt.android.AndroidEntryPoint
 import id.go.diskominfosamarinda.ui.ui.theme.ProjectUjiKompetensiTheme

 @AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjectUjiKompetensiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DestinationsNavHost(
                        navGraph = NavGraphs.root,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}