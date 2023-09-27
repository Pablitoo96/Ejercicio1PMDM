package pablo.maruottolo.ejercicio1pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContarPalabrasYLetrasActivity extends AppCompatActivity {

    private TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contar_palabras_yletras);

        txtResultado = findViewById(R.id.txtResultadoContador);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null){
            if(bundle.getString("OPERACION").equalsIgnoreCase("Palabras")){
                String palabras = bundle.getString("PALABRAS");
            }
            String caracteres = bundle.getString("CARACTERES");
            Toast.makeText(this,"La frase tiene " + caracteres + "caracteres",Toast.LENGTH_SHORT).show();
        }
    }
}