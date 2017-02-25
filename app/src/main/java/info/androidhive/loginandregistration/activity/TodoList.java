package info.androidhive.loginandregistration.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import info.androidhive.loginandregistration.R;

public class TodoList extends AppCompatActivity {

    EditText text;
    Button save;
    ListView list_item;
    List<String> mytasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        save = (Button) findViewById(R.id.save);
        text = (EditText) findViewById(R.id.text);
        list_item = (ListView) findViewById(R.id.mylist);
        /**
         * Read all the tasks from the orm
         * Read about the other method[Sugar orm website]
         */


        //Set onclick
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When someone click the button, we get the text from the edittext field and save it locally.
                if (!text.getText().toString().isEmpty()) {

                    mytasks.add(text.getText().toString());
                    Toast.makeText(TodoList.this, "Task saved to orm", Toast.LENGTH_LONG);


                }
            }
        });
    }

}
