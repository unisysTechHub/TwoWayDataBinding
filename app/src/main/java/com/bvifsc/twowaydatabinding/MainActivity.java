package com.bvifsc.twowaydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.bvifsc.twowaydatabinding.databinding.ContentMainBinding;

public class MainActivity extends AppCompatActivity {
        User user;
        int i=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContentMainBinding contentMainBinding=DataBindingUtil.setContentView(this, R.layout.content_main);
        user=new User();
        contentMainBinding.setUser(user);
        user.setFirstName("Update first Name");
        user.setLastName("updated Last Name");

                Button updateName=findViewById(R.id.update_name);

                                updateName.setOnClickListener( view -> {
                                    i++;
                                    Log.d("Ramesh", "buttonpressed"  );

                                        user.setFirstName("Update first Name" +i);
                                        user.setLastName("updated Last Name");

                                });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
