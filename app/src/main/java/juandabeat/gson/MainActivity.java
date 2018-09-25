package juandabeat.gson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.gson.Gson;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String data = "{\"nombre\":\"Jos\\u00e9\",\"apellido\":\"Luj\\u00e1n\",\"edad\":27,\"trabajo\":\"desarrollador\",\"pais\":\"M\\u00e9xico\"}";
    Gson gson=new Gson();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String json=data;
        List<Persona> personaList = (List<Persona>)gson.fromJson(json,Persona.class);
        //int i=1;
        personaList.get(1);

    }
}
