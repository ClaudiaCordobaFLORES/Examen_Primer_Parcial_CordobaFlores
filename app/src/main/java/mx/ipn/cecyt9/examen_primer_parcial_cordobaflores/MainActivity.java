package mx.ipn.cecyt9.examen_primer_parcial_cordobaflores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String Usuario = "Claudia";
    String Password = " 123";
    String UsuarioObtenido = "";
    String PasswordObtenido = "";
    EditText tv, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (EditText) findViewById(R.id.editText);
        tv2 = (EditText) findViewById(R.id.editText2);



    }
    public void validación(View v){
        UsuarioObtenido = tv.getText().toString();
        PasswordObtenido = tv2.getText().toString();
        if(Usuario.equals(UsuarioObtenido) && Password.equals(PasswordObtenido)){
            //mandar a llamar la actividad correcta
            Toast toast1=
                    Toast.makeText(getApplicationContext(),

                             "Usuario Correcto",Toast.LENGTH_SHORT);
            toast1.show();

        }
        else{
            //si los valores no coinciden mandar a llamar la actividad de error
            Toast toast2=
                    Toast.makeText(getApplicationContext(),
                            "Usuario Correcto",Toast.LENGTH_SHORT);
            toast2.show();
        }

    }
}

