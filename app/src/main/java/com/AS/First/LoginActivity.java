package com.AS.First;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class LoginActivity extends AppCompatActivity {

   TextView enlaceSup;
    ImageView car;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        enlaceSup = findViewById(R.id.enlaceSup);
        login = findViewById(R.id.login);
        //car= findViewById(R.id.car);
        ImageView car = findViewById(R.id.car);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.fadein);
       car.startAnimation(myanim);
        myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        car.startAnimation(myanim);

        enlaceSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            openSignUp();
            }

        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain();
            }

        });
        ImageView mGirl = findViewById(R.id.girl);

        Glide.with(this).load("https://www.wsupercars.com/wallpapers-phone/Formula-1/Scuderia-Ferrari/2022-Formula1-Ferrari-F1-75-010-2400p.jpg")
                //https://www.acfligue.org/wp-content/uploads/2021/12/custom_showroom_1654840098.png
                .transition(DrawableTransitionOptions.withCrossFade(1000))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
               .centerCrop()
               //.circleCrop()
                .into(mGirl);

    }
    public void openMain() {
        Intent intent = new Intent(LoginActivity.this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
    public void openSignUp(){
        Intent intent = new Intent(this, SignupActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);


        startActivity(intent);


    }




}