//Matheus Almeida N00739768
//Alenric Apostol N01031550

package robotv.srp.robotv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Operation extends AppCompatActivity {
    Button ManualBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation);
        ManualBtn = (Button)findViewById(R.id.button2);

        ManualBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Operation.this, Manual.class);
                startActivity(intent);
            }
        });

    }

}
