package devandroid.gomes.lifecycleactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import devandroid.gomes.lifecycleactivity.databinding.ActivityMainABinding

class MainActivityA : AppCompatActivity() {

    private lateinit var binding : ActivityMainABinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainABinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Assim que a activity é iniciada com o OnCreate, a função ja está
        // sendo executada, e ''ouvindo'' ao clique do botão de proxima tela.

        initListeners()
    }

    // Funcao que escut
    private fun initListeners() {
        binding.btnNextScreen.setOnClickListener {
            // Fazendo a navegação de telas usando Intents
            // Variável que guarda a intenção de navegar de tela.
            val intentNextScreen = Intent(this, MainActivityB::class.java)
            // Para transitar dados da Actitivty A para a Acitivy B usamos o putExtra
            // Ex: Enviando um objeto a partir do obj User, arquivo criado.
            // Enviando os dados de user para a actitivtyB, "user" é a chave que usaremos.
            // Defina o obj User como serializable.
            intentNextScreen.putExtra("user", User("Luciano Gomes", 25))
            startActivity(intentNextScreen)
        }
    }


}