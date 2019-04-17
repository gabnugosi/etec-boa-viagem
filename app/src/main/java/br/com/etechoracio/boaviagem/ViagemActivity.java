package br.com.etechoracio.boaviagem;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class ViagemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viagem);

    }
    private DatePickerDialog.OnDateSetListener dateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker  view , int ano, int mes , int dia) {
            String data=String.valueOf(dia) + "/" + String.valueOf(mes+1 )+ "/"+ String.valueOf(ano);
            btnData.setText(data);

        }
    }
    protected  void onCreateDialog(int id ){
        Calendar cal =  Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        


        return new  DatePickerDialog(this,dateListener,ano,mes,dia);
    }
}
