package mx.mmpp.juegolupa;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.Iterator;
import java.util.LinkedList;

public class LuPaActivity extends AppCompatActivity {


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    LuPa luPa = new LuPa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lu_pa);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        numerosAzar();
    }

    private void checar() {
        if(btn1.getText()==("0") && btn2.getText()==("0") && btn3.getText()==("0") && btn4.getText()==("0") &&
                btn5.getText()==("0") && btn6.getText()==("0") && btn7.getText()==("0")){
            mostrarDialogo("Ganaste");
            numerosAzar();
        }else if(btn1.getText()==("1") && btn2.getText()==("1") && btn3.getText()==("1") && btn4.getText()==("1") &&
                btn5.getText()==("1") && btn6.getText()==("1") && btn7.getText()==("1")){
            mostrarDialogo("Ganaste");
            numerosAzar();
        }
    }

    public void cambiar(View v){
        if(v.getId() == R.id.btn1){
            if(btn1.getText().toString().trim()=="0"){
                btn1.setText("1");
            }else {
                btn1.setText("0");
            }
            if(btn2.getText().toString().trim()=="0"){
                btn2.setText("1");
            }else {
                btn2.setText("0");
            }
        }
        else if(v.getId()==R.id.btn7){
            if(btn7.getText().toString().trim()=="0"){
                btn7.setText("1");
            }else {
                btn7.setText("0");
            }
            if(btn6.getText().toString().trim()=="0"){
                btn6.setText("1");
            }else {
                btn6.setText("0");
            }
        }else {
            if(v.getId()==R.id.btn2) {
                if (btn2.getText().toString().trim() == "0") {
                    btn2.setText("1");
                } else {
                    btn2.setText("0");
                }
                if (btn1.getText().toString().trim() == "0") {
                    btn1.setText("1");
                } else {
                    btn1.setText("0");
                }
                if (btn3.getText().toString().trim() == "0") {
                    btn3.setText("1");
                } else {
                    btn3.setText("0");
                }
            }
            if(v.getId()==R.id.btn3) {
                if (btn3.getText().toString().trim() == "0") {
                    btn3.setText("1");
                } else {
                    btn3.setText("0");
                }
                if (btn2.getText().toString().trim() == "0") {
                    btn2.setText("1");
                } else {
                    btn2.setText("0");
                }
                if (btn4.getText().toString().trim() == "0") {
                    btn4.setText("1");
                } else {
                    btn4.setText("0");
                }
            }
            if(v.getId()==R.id.btn4) {
                if (btn4.getText().toString().trim() == "0") {
                    btn4.setText("1");
                } else {
                    btn4.setText("0");
                }
                if (btn3.getText().toString().trim() == "0") {
                    btn3.setText("1");
                } else {
                    btn3.setText("0");
                }
                if (btn5.getText().toString().trim() == "0") {
                    btn5.setText("1");
                } else {
                    btn5.setText("0");
                }
            }
            if(v.getId()==R.id.btn5) {
                if (btn5.getText().toString().trim() == "0") {
                    btn5.setText("1");
                } else {
                    btn5.setText("0");
                }
                if (btn4.getText().toString().trim() == "0") {
                    btn4.setText("1");
                } else {
                    btn4.setText("0");
                }
                if (btn6.getText().toString().trim() == "0") {
                    btn6.setText("1");
                } else {
                    btn6.setText("0");
                }
            }
            if(v.getId()==R.id.btn6) {
                if (btn6.getText().toString().trim() == "0") {
                    btn6.setText("1");
                } else {
                    btn6.setText("0");
                }
                if (btn5.getText().toString().trim() == "0") {
                    btn5.setText("1");
                } else {
                    btn5.setText("0");
                }
                if (btn7.getText().toString().trim() == "0") {
                    btn7.setText("1");
                } else {
                    btn7.setText("0");
                }
            }

        }
        checar();

    }

    private void mostrarDialogo(String mensaje) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aviso");
        builder.setMessage(mensaje);
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Click
            }
        });
        builder.show();
    }

    private void numerosAzar(){
        btn1.setText(luPa.azar());
        btn2.setText(luPa.azar());
        btn3.setText(luPa.azar());
        btn4.setText(luPa.azar());
        btn5.setText(luPa.azar());
        btn6.setText(luPa.azar());
        btn7.setText(luPa.azar());
    }

    public void reset(View v){
        numerosAzar();
    }





   /* public void cambiarDos(View v){
        if(v.getId() == btns.get(0).getId()){
            if(btn1.getText().toString().trim()=="0"){
                btn1.setText("1");
            }else {
                btn1.setText("0");
            }
            if(btn2.getText().toString().trim()=="0"){
                btn2.setText("1");
            }else {
                btn2.setText("0");
            }
        }else if(v.getId()==btns.get(btns.size()-1).getId()){
            if(btn7.getText().toString().trim()=="0"){
                btn7.setText("1");
            }else {
                btn7.setText("0");
            }
            if(btn6.getText().toString().trim()=="0"){
                btn6.setText("1");
            }else {
                btn6.setText("0");
            }
        }else {

        }

    }
*/



}
