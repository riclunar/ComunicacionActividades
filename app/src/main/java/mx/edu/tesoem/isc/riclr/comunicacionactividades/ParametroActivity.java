package mx.edu.tesoem.isc.riclr.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParametroActivity extends AppCompatActivity {

    TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro);
        lblSaludo = findViewById(R.id.lblSaludo);
        Bundle parametro = getIntent().getExtras();
        lblSaludo.setText("Bienvenido " + parametro.getString("Nombre"));
    }
}
