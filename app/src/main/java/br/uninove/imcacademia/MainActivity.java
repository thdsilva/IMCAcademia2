package br.uninove.imcacademia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtAltura;
    private EditText txtIdade;
    private TextView txtResultado;
    private ImageView imgResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtIdade = findViewById(R.id.txtIdade);
        this.txtAltura = findViewById(R.id.txtAltura);
        this.txtPeso = findViewById(R.id.txtPeso);
        this.txtResultado = findViewById(R.id.txtResultado);
        this.imgResultado = findViewById(R.id.imgResultado);

  /*  }
    public void btnVerificarOnClick(View view){
        EditText txtPeso = (EditText)findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText)findViewById(R.id.txtAltura);
        EditText txtIdade = (EditText)findViewById(R.id.txtIdade);
        TextView lblResultado = (TextView)findViewById(R.id.txtResultado);
    */}

    public void calcIMC (View view){
        double peso = 0.0;
        double altura = 0.0;
        double resultado = 0.0;
        peso = Double.parseDouble(txtPeso.getText().toString());
        altura = Double.parseDouble(txtAltura.getText().toString());
        resultado = peso / (altura * altura);
        if (resultado < 18.5) {
            this.txtResultado.setText("Magro");
            imgResultado.setImageResource(R.drawable.magro);
        } else if (resultado > 18.5 && resultado < 24.9){
          this.txtResultado.setText("Normal");
          imgResultado.setImageResource(R.drawable.normal);
        }else if (resultado >= 24.9 && resultado < 29.9){
            this.txtResultado.setText("Acima do peso");
            imgResultado.setImageResource(R.drawable.acimadopeso);
        }else {
            this.txtResultado.setText("Obeso");
            imgResultado.setImageResource(R.drawable.obeso);
        }
    }
}
