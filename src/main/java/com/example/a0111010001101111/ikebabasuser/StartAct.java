package com.example.a0111010001101111.ikebabasuser;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.AnimationListener;
import com.easyandroidanimations.library.ScaleInAnimation;
import com.easyandroidanimations.library.ScaleOutAnimation;

public class StartAct extends AppCompatActivity {

    private TextView startTxt;
    private ImageView uzsakymoBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        init();
        setFactorys();
        setLisiners();
    }

    public void init(){
        startTxt = (TextView) findViewById(R.id.startText);
        uzsakymoBTN = (ImageView) findViewById(R.id.uzsakytiBTN);
    }

    public void setFactorys(){
        Typeface leaveTxt = Typeface.DEFAULT.createFromAsset(getAssets(),"mark.ttf");
        startTxt.setTypeface(leaveTxt);
    }

    public void setLisiners(){
        uzsakymoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new ScaleOutAnimation(uzsakymoBTN).setDuration(380).setListener(new AnimationListener() {
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent toMain = new Intent(StartAct.this,MainActivity.class);
                        startActivity(toMain);
                    }
                }).animate();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        new ScaleInAnimation(startTxt).setDuration(500).animate();
        new ScaleInAnimation(uzsakymoBTN).setDuration(900).animate();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View decorView = getWindow().getDecorView();
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }
}
