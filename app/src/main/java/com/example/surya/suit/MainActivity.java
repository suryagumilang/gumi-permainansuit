package com.example.surya.suit;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView iv_PlayerTurn, iv_AiTurn;
    Button btn_rock, btn_scissors, btn_paper;
    TextView tv_PlayerTurn, tv_AiTurn, tv_scorehuman, tv_ishumanscore, tv_aiscore, tv_isaiscore;

    int rock = 1;
    int scissors = 3;
    int paper= 2;

    int playerscore, aiscore;

    Random rnd = new Random();

    int reset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hat = (ImageView) findViewById(R.id.potato_hat);
        btn_rock = (Button) findViewById(R.id.btn_rock);
        btn_scissors = (Button)findViewById(R.id.btn_scissors);
        btn_paper = (Button) findViewById(R.id.btn_paper);

        tv_PlayerTurn = (TextView)findViewById(R.id.tv_PlayerTurn);
        tv_AiTurn = (TextView)findViewById(R.id.tv_AiTurn);
        tv_scorehuman = (TextView)findViewById(R.id.tv_scorehuman);
        tv_ishumanscore = (TextView)findViewById(R.id.tv_ishumanscore);
        tv_aiscore = (TextView)findViewById(R.id.tv_aiscore);
        tv_isaiscore = (TextView)findViewById(R.id.tv_isaiscore);

        iv_PlayerTurn = (ImageView)findViewById(R.id.iv_PlayerTurn);
        iv_AiTurn = (ImageView)findViewById(R.id.iv_AiTurn);


//        chat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(hat.getVisibility()==v.VISIBLE){
//                    hat.setVisibility(v.INVISIBLE);
//                }else{
//                    hat.setVisibility(v.VISIBLE);
//                }
//            }
//        });

        btn_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv_ishumanscore.setText(String.valueOf(reset));

                Resources res = getResources();
                Drawable drawablePlayer = res.getDrawable(R.drawable.rock);
                iv_PlayerTurn.setImageDrawable(drawablePlayer);

                int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

                if (randomNumber == rock){
                    Drawable drawableAi = res.getDrawable(R.drawable.rock);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("1");
                }

                if (randomNumber == paper){
                    Drawable drawableAi = res.getDrawable(R.drawable.paper);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("0");
                    tv_isaiscore.setText("1");
                }

                if (randomNumber == scissors){
                    Drawable drawableAi = res.getDrawable(R.drawable.scissor);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("0");
                }


            }
        });

//player paper
        btn_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv_ishumanscore.setText(String.valueOf(reset));

                Resources res = getResources();
                Drawable drawablePlayer = res.getDrawable(R.drawable.paper);
                iv_PlayerTurn.setImageDrawable(drawablePlayer);

                int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

                if (randomNumber == rock){
                    Drawable drawableAi = res.getDrawable(R.drawable.rock);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("0");
                }

                if (randomNumber == paper){
                    Drawable drawableAi = res.getDrawable(R.drawable.paper);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("1");
                }

                if (randomNumber == scissors){
                    Drawable drawableAi = res.getDrawable(R.drawable.scissor);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("0");
                    tv_isaiscore.setText("1");
                }


            }
        });



        btn_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv_ishumanscore.setText(String.valueOf(reset));

                Resources res = getResources();
                Drawable drawablePlayer = res.getDrawable(R.drawable.scissor);
                iv_PlayerTurn.setImageDrawable(drawablePlayer);

                int randomNumber = rnd.nextInt(3 - 1 + 1) + 1;

                if (randomNumber == rock){
                    Drawable drawableAi = res.getDrawable(R.drawable.rock);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("0");
                    tv_isaiscore.setText("1");
                }

                if (randomNumber == paper){
                    Drawable drawableAi = res.getDrawable(R.drawable.paper);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("0");
                }

                if (randomNumber == scissors){
                    Drawable drawableAi = res.getDrawable(R.drawable.scissor);
                    iv_AiTurn.setImageDrawable(drawableAi);

                    tv_ishumanscore.setText("1");
                    tv_isaiscore.setText("1");
                }


            }
        });



    }
}
