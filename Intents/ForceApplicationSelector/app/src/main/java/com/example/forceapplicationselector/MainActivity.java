package com.example.forceapplicationselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "text");
                sendIntent.setType("text/plain");
                // 获取资源的字符串
                String title = getResources().getString(R.string.app_name);

                // 创建意图
                Intent chooser = Intent.createChooser(sendIntent, title);
                try {
                    startActivity(chooser);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}