package br.com.etechoracio.exe_login;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;

import br.com.etechoracio.boaviagem.R;

public class ViagemActivity extends AppCompatActivity {
    private Button btnDataSaida;
    private Button btnDataChegada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
        this.btnDataChegada = findViewById(R.id.btnDataChegada);
        this.btnDataSaida = findViewById(R.id.btnDataSaida);

    }
    private DatePickerDialog.OnDateSetListener dateList = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int ano, int mes, int dia) {
            String data = String.valueOf(dia) + "/" + String.valueOf(mes + 1) + "/" + String.valueOf(ano);
            btnDataSaida.setText(data);
        }
    }
}
