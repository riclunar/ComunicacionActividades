package mx.edu.tesoem.isc.riclr.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
    }

    public void Pantalla1 (View v){
        Intent intent = new Intent(this, frmUno.class);
        startActivity(intent);
        finish();
    }

    public void Pantalla2 (View v){
        Intent intent = new Intent(this, ParametroActivity.class);
        intent.putExtra("Nombre",txtNombre.getText().toString());
        startActivity(intent);
    }
}
