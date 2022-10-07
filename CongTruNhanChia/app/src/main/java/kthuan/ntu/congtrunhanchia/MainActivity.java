package kthuan.ntu.congtrunhanchia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText so1;
    EditText so2;
    EditText rs;
    Button c;
    Button t;
    Button n;
    Button ch;

    void solieu() {
        so1 = (EditText) findViewById(R.id.s1);
        so2 = (EditText) findViewById(R.id.s2);
        rs = (EditText) findViewById(R.id.kq);
        c = (Button) findViewById(R.id.cong);
        t = (Button) findViewById(R.id.tru);
        n = (Button) findViewById(R.id.nhan);
        ch = (Button) findViewById(R.id.chia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solieu();
        View.OnClickListener tinh = new OnClickListener() {
            @Override
            public void onClick(View view) {
                cong();
            }
        };
        c.setOnClickListener(tinh);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tru();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nhan();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chia();
            }
        });
    }
        void cong () {
            int a = Integer.parseInt(so1.getText().toString());
            int b = Integer.parseInt(so1.getText().toString());
            double t = a + b;

            rs.setText(String.valueOf(t));
        }

        void tru () {
            int a = Integer.parseInt(so1.getText().toString());
            int b = Integer.parseInt(so1.getText().toString());
            double t = a - b;

            rs.setText(String.valueOf(t));
        }

        void nhan () {
            int a = Integer.parseInt(so1.getText().toString());
            int b = Integer.parseInt(so1.getText().toString());
            double t = a * b;

            rs.setText(String.valueOf(t));
        }

        void chia() {
            int a = Integer.parseInt(so1.getText().toString());
            int b = Integer.parseInt(so1.getText().toString());
            double t = a / b;

            rs.setText(String.valueOf(t));
        }

}