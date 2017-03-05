package lords91.raspy.domotic;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button on = (Button) findViewById(R.id.buttonOn);
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Async on = new Async();
                on.setUrl("http://192.168.1.9/?LightON=");
                on.execute();
            }
        });

        Button off = (Button) findViewById(R.id.buttonOff);
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Async off = new Async();
                off.setUrl("http://192.168.1.9/?LightOFF=");
                off.execute();
            }
        });
    }
}
