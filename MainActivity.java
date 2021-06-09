package com.example.imageonclick;
import android.content.Context;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity
{
    ImageView imageView;
    Button button;
    String link = "https://ichef.bbci.co.uk/news/976/cpsprodpb/7727/production/_103330503_musk3.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final Context context = v.getContext();
                Glide.with(context).load(link).into(imageView);
            }
        });

    }
}