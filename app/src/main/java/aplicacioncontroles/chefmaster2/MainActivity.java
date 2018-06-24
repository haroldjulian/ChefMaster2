package aplicacioncontroles.chefmaster2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static String usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getIntent().hasExtra("usuario")){
            usuario = getIntent().getStringExtra("usuario");
        }
        Toast.makeText(this,usuario,Toast.LENGTH_LONG).show();
    }
}
