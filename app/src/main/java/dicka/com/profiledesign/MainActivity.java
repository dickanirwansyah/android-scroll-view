package dicka.com.profiledesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnEdit2;
    private Button btnEdit3;
    private TextView txtNama2, txtNama3;
    private TextView txtTelepon2, txtTelepon3;
    private TextView txtKelamin2, txtKelamin3;
    private ImageView image2, image3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEdit2 = (Button) findViewById(R.id.btnEdit2);
        btnEdit3 = (Button) findViewById(R.id.btnEdit3);
        txtNama2 = (TextView) findViewById(R.id.txtNama2);
        txtNama3 = (TextView) findViewById(R.id.txtNama3);
        txtTelepon3 = (TextView) findViewById(R.id.txtTelepon3);
        txtTelepon2 = (TextView) findViewById(R.id.txtTelepon2);
        txtKelamin3 = (TextView) findViewById(R.id.txtKelamin3);
        txtKelamin2 = (TextView) findViewById(R.id.txtKelamin2);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);

        btnEdit2.setVisibility(View.GONE);
        btnEdit3.setVisibility(View.GONE);
        txtNama2.setVisibility(View.GONE);
        txtNama3.setVisibility(View.GONE);
        txtKelamin2.setVisibility(View.GONE);
        txtKelamin3.setVisibility(View.GONE);
        txtTelepon2.setVisibility(View.GONE);
        txtTelepon3.setVisibility(View.GONE);
        image2.setVisibility(View.GONE);
        image3.setVisibility(View.GONE);

    }
}
