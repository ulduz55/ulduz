import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seyahatMeksi = editText.getText().toString();
                Toast.makeText(MainActivity.this, "Səyahət məqsədi: " + seyahatMeksi, Toast.LENGTH_SHORT).show();
                // Bura bilet alınması, səyahət saatlarının göstərilməsi və s. funksiyalar əlavə edilə bilər
            }
        });
    }
}