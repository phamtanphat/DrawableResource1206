package com.ptp.phamtanphat.drawableresource1206;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgClip;
    Button btnClip;
    ClipDrawable clipDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgClip = findViewById(R.id.imageviewDrawableClip);
        btnClip = findViewById(R.id.buttonDrawableClip);

        clipDrawable = (ClipDrawable) imgClip.getDrawable();
        clipDrawable.setLevel(1000);
        btnClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgClip.setImageLevel(clipDrawable.getLevel() + 1000);
            }
        });
    }
}
