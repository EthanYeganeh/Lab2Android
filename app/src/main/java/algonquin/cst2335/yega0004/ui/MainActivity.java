package algonquin.cst2335.yega0004.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import algonquin.cst2335.yega0004.data.MainViewModel;
import algonquin.cst2335.yega0004.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding variableBinding;
    private MainViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        model = new ViewModelProvider(this).get(MainViewModel.class);

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        variableBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(variableBinding.getRoot());

        variableBinding.myButton.setOnClickListener(click -> {
                    model.editString.observe(this, s -> {
                        variableBinding.myedittext.setText("Your edit text has " + s);

                    });
                });
//        TextView myText = variableBinding.textView;
//        Button btn = variableBinding.myButton;
//        EditText myedit = variableBinding.myedittext;
//
//         String editString = myedit.getText().toString();
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String editString = myedit.getText().toString();
//                myText.setText("Your edit text has: " + editString);
//
//            }
//
//        });

//        btn.setOnClickListener(   vw  ->  myText.setText("Your edit text has: " + editString)    );
    }
    }
