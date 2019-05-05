package br.com.etechoracio.exe_login;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class GastoActivity extends AppCompatActivity {

    private Button btndata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto);

        btndata = findViewById(R.id.btndata);
    }
    private DatePickerDialog.OnDateSetListener datagasto = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int ano, int mes, int dia) {

            String datagasto = String.valueOf(dia) + "/" + String.valueOf(mes+1) + "/" + String.valueOf(ano);
            btndata.setText(datagasto);
        }
    };
    protected Dialog oncreateDialog(int id){
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);

        switch (id){
            case R.id.btndata:
                return new DatePickerDialog(this, datagasto, dia, mes, ano);
        }
        return null;
    }
    public void onselecionarData(View v){
        showDialog(v.getId());

    }

}
