package aplicacioncontroles.chefmaster2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class SplashScreen extends Activity {

    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            Intent iLogin = new Intent( SplashScreen.this,Login.class);
            startActivity(iLogin);
            SplashScreen.this.finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    h.sendMessage(h.obtainMessage());
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }

            }
        });

        t.start();
    }
}
