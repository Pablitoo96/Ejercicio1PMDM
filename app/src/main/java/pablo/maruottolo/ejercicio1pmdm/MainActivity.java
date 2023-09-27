package pablo.maruottolo.ejercicio1pmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnCarateres;
    private Button btnPalabras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();
    btnPalabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String frase = txtFrase.getText().toString();
            String[] palabras = frase.split(" ");
            int num = palabras.length;

            enviarResultado(num,"PALABRAS","Caracteres");
        }
    });
    btnCarateres.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
    btnPalabras.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });
    }


    private  void enviarResultado(int num , String PALABRAS, String palabras ) {
        if(num == 0){
            Toast.makeText(MainActivity.this,"EL CAMPO ESTA VACIO",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(MainActivity.this, ContarPalabrasYLetrasActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("PALABRAS",String.valueOf(num));
            bundle.putString("OPERACION","Caracteres");
            intent.putExtras(bundle);
        }
    }


    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtEscribe);
        btnCarateres = findViewById(R.id.btnContarLetras);
        btnPalabras = findViewById(R.id.btnContarPalabras);
    }
}