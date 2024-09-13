package br.com.aula.numerosortido;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // executa em btn Jogar - Sorteia um numero
    public void sortearNumero(View view){
        TextView textoResultado1 = findViewById(R.id.textoResultado1);
        TextView textoResultado2 = findViewById(R.id.textoResultado2);

        int num1 = new Random().nextInt(6) +1;
        String res1 = Integer.toString(num1);
        int num2 = new Random().nextInt(6) +1;
        String res2 = Integer.toString(num2);

        textoResultado1.setText(res1);
        textoResultado2.setText(res2);
    }

    public void reiniciarNumero(View view){
        TextView textoResultado1 = findViewById(R.id.textoResultado1);
        TextView textoResultado2 = findViewById(R.id.textoResultado2);
        textoResultado1.setText("----");
        textoResultado2.setText("----");
    }
}