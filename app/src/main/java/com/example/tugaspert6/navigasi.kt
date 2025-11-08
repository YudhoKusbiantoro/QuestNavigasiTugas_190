import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugaspert6.view.Formpendaftarann
import com.example.tugaspert6.view.Fromlist
import com.example.tugaspert6.view.formhome


// Enum untuk mendefinisikan semua route
enum class Navigasi {
    home,
    list,
    form
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
