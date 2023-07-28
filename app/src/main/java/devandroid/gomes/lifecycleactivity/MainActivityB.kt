package devandroid.gomes.lifecycleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import devandroid.gomes.lifecycleactivity.databinding.ActivityMainBBinding

class MainActivityB : AppCompatActivity() {

    // Configuração do root e da binding.
    private lateinit var binding: ActivityMainBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Instanciando o binding
        binding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Chamando a função getExtra para que assim que actitivty for carregada, ja tenha as infos
        getExtra()
    }


    // Função para recuperar todas as informações que estão vindo de outra activity
    private fun getExtra() {
        // Verificando se existe alguma coisa no putExtra com a chave que vou passar
        if (intent.hasExtra("User")) {
            // Fazendo o intent para pegar os dados que são serializable e informando que é do tipo User
            // O parametro USER informado, é o mesmo informado na exportação da informação na ActivityA
            val user = intent.getSerializableExtra("user") as User
            Log.i("INFOTESTE", "getExtra: ${user.name}")
            Log.i("INFOTESTE", "getExtra: ${user.age}")
        }

    }
}