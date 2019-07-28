package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.os.PersistableBundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text);
        textView.setText("Hello Meder D!");

        Button button = findViewById(R.id.botton);
        button.setTag(1);

        final EditText editText =  findViewById(R.id.edit_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int status =(Integer) v.getTag();
                if (status == 1) {
                    //textView.setText("Button clicked");
                    String content1 = editText.getText().toString();
                    textView.setText(content1);
                    v.setTag(0);


                } else {
                    //textView.setText("Button clicked");
                    String content2 = editText.getText().toString();
                    textView.setText(content2);
                    v.setTag(1);

                }
            }
        });
    }
}
// Ввести первый текст, по нажатию на кнопку сохранить, отобразить.
// Ввести второй текст, по нажатию на кнопку сохранить, отобразить.
// На следующие нажатия на кнопку переключаться между первым и вторым текстом.
// Экран должен выглядеть так же, как на видео.
// Используйте дополнительные переменные для выполнения домашки.}