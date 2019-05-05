package br.com.etechoracio.exe_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


   public void onSelecionarGasto(View view){
       Intent intent1 = new Intent(this, GastoActivity.class);
       startActivity(intent1);
   }

   public void onSelecionarViagem(View view) {
       Intent intent2 = new Intent(this, ViagemActivity.class);
       startActivity(intent2);
   }
    public void onSelecionarOperacao(View view){
        switch (view.getId()){
            case R.id.activity_gasto:
                Intent intent1 = new Intent(this, GastoActivity.class);
                startActivity(intent1);
                break;

            case R.id.activity_viagem:
                Intent intent2 = new Intent(this, ViagemActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
