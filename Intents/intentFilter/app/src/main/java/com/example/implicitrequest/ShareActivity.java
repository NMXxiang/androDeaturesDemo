package com.example.implicitrequest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        init();

    }


    private void init(){
        // 需要在 AndroidManifest.xml 中配置 intent 过滤器 才能接收到信息
        textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        if (intent != null){
            textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }


}