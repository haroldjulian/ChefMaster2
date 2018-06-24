package aplicacioncontroles.chefmaster2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {
    EditText txtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
    }
    public void iniciarSesion(View v){
        Intent iMain = new Intent (this, MainActivity.class);
        iMain.putExtra("usuario",txtUsuario.getText().toString());
        startActivity(iMain);
    }


}
