package bit.batch3.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button btnShowPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowPopup=findViewById(R.id.btnShowPopup);
        btnShowPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,v);
                MenuInflater inflater=popupMenu.getMenuInflater();
                popupMenu.inflate(R.menu.my_menu);
                popupMenu.setOnMenuItemClickListener(MainActivity.this);
                popupMenu.show();

            }
        });

    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()){

            case R.id.menuOption1:
                //action
                Toast.makeText(MainActivity.this,"Option1",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuOption2:
                Toast.makeText(MainActivity.this,"Option2",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuOption3:
                Toast.makeText(MainActivity.this,"Option3",Toast.LENGTH_LONG).show();
                break;
            case R.id.menuOption4:
                Toast.makeText(MainActivity.this,"Option4",Toast.LENGTH_LONG).show();
                break;
        }

        return false;
    }
}
