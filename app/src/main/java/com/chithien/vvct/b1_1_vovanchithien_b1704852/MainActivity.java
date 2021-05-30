package com.chithien.vvct.b1_1_vovanchithien_b1704852;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Khai báo các View
        Button btnTest = (Button)findViewById(R.id.Test_btn);
        Button btnExit = (Button)findViewById(R.id.Exit_btn);
        ToggleButton btnToggle = (ToggleButton)findViewById(R.id.OFF_tggbtn);
        ImageButton imgbtn = (ImageButton)findViewById(R.id.Star_imgbtn);
        RadioGroup rdg = (RadioGroup)findViewById(R.id.rg);
        RadioButton rb1 = (RadioButton)findViewById(R.id.Opt1_rbtn);
        RadioButton rb2 = (RadioButton)findViewById(R.id.Opt2_rbtn);
        ImageView img1 = (ImageView)findViewById(R.id.imageView);
        ImageView img2 = (ImageView)findViewById(R.id.imageView2);
        CheckBox autosave = (CheckBox)findViewById(R.id.Autosave_chb);
        CheckBox star = (CheckBox)findViewById(R.id.Starstyle_chb);

        // Xử lý sự kiện

        // Btn Test
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have checked TEST Button", Toast.LENGTH_SHORT).show();
            }
        });

        // Btn Exit
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have checked EXIT Button", Toast.LENGTH_SHORT).show();
                //System.exit(0);
            }
        });

        // Img btn
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You have checked IMAGEButton", Toast.LENGTH_SHORT).show();
            }
        });

        // Btn Toggle: nếu nút được check sẽ set text cho text view ngược lại set text rỗng
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edttxt = (EditText)findViewById(R.id.editTxt);
                String text = edttxt.getText().toString();
                TextView textView = (TextView)findViewById(R.id.txtView);
                if(btnToggle.isChecked()){
                    textView.setText(text);
                }
                else textView.setText("");
            }
        });

        // Radio Group
        rdg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // Nếu radio btn 1 được check thì img1 hiển thị
                if(rb1.isChecked()){
                    img1.setVisibility(ImageView.VISIBLE);
                    img2.setVisibility(ImageView.INVISIBLE);
                }
                // Nếu radio btn 1 được check thì img2 hiển thị
                if(rb2.isChecked()){
                    img2.setVisibility(ImageView.VISIBLE);
                    img1.setVisibility(ImageView.INVISIBLE);
                }
            }
        });

        // Checkbox AutoSave
        autosave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autosave.isChecked()){
                    Toast.makeText(MainActivity.this, "AutoSave CheckBox have checked", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this, "AutoSave CheckBox have unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        // Checkbox StarStyle
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (autosave.isChecked()){
                    Toast.makeText(MainActivity.this, "StarStyle CheckBox have checked", Toast.LENGTH_SHORT).show();
                }
                else Toast.makeText(MainActivity.this, "StarStyle CheckBox have unchecked", Toast.LENGTH_SHORT).show();
            }
        });

    }


}