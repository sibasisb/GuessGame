
package com.example.guessgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText pname;
    public ImageView img;
    public ImageButton play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.playbutton);
        pname = findViewById(R.id.name);
        img=findViewById(R.id.fimage);
    }
    public void onFade(View view){
        img.animate().alpha(0f).setDuration(2000);
    }
    public void onPlayClick(View view){

       Intent intent=new Intent(this,GameActivity.class);
       String name=pname.getText().toString();
       intent.putExtra("playerName",name);
       startActivity(intent);
    }

}
