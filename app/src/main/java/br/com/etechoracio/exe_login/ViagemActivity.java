package br.com.etechoracio.exe_login;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class ViagemActivity extends AppCompatActivity {

    private Button dataChegada;
    private Button dataSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);
        dataChegada = findViewById(R.id.dataChegada);
        dataSaida = findViewById(R.id.dataSaida);
    }

    private DatePickerDialog.OnDateSetListener datachegada = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int ano, int mes, int dia) {

            String data = String.valueOf(dia) + "/" + String.valueOf(mes + 1) + "/" + String.valueOf(ano);
            dataChegada.setText(data);
        }
    };
    private DatePickerDialog.OnDateSetListener datasaida = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int ano, int mes, int dia) {

            String data1 = String.valueOf(dia) + "/" + String.valueOf(mes+1) + "/" + String.valueOf(ano);
            dataSaida.setText(data1);

        }
    };
    protected Dialog onCreateDialog(int id){
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);



        switch (id) {
            case R.id.dataChegada:
                return new DatePickerDialog(this, datachegada, dia, mes, ano);
        }

        switch (id){
            case R.id.dataSaida:
                return new DatePickerDialog(this,datasaida,dia,mes,ano);
        }
        return null;
    }
    public void onSelecionarData(View view){
        showDialog(view.getId());
    }

}


