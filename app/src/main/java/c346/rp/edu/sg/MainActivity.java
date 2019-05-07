package c346.rp.edu.sg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAmt;
    EditText etPax;
    CheckBox cbGST;
    CheckBox cbSVC;
    Button btnCalc;
    TextView tvResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAmt = findViewById(R.id.etAmt);
        etPax = findViewById(R.id.etPax);
        cbGST = findViewById(R.id.cbGST);
        cbSVC = findViewById(R.id.cbSVC);
        btnCalc = findViewById(R.id.btnCalc);
        tvResult = findViewById(R.id.tvResult);

        cbGST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbGST.isChecked()){
                    cbGST.setEnabled(true);
                }
                else {
                    cbGST.setEnabled(true);
                }
            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = etAmt.getText().toString();

                Double Amt = Double.parseDouble(data);
                int Pax = Integer.parseInt(etPax.getText().toString());

                if (cbGST.isChecked() == true){
                    Amt = Amt * 1.07;
                }
                if (cbSVC.isChecked() == true){
                    Amt = Amt * 1.10;
                }

                double average = Amt / Pax;
                tvResult.setText("Each person pays "+average);
            }
        });

    }
}
