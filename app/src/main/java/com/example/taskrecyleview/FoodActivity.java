package com.example.taskrecyleview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    private TextView tv_name;
    private TextView tv_description;
    private TextView tv_price;
    private ImageView iv_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_description = (TextView) findViewById(R.id.tv_description);
        tv_price = (TextView) findViewById(R.id.tv_price);
        iv_photo = (ImageView) findViewById(R.id.iv_photo);

        tv_name.setText(getIntent().getStringExtra("name"));
        tv_price.setText(getIntent().getStringExtra("price"));
        tv_description.setText(getIntent().getStringExtra("description"));
        iv_photo.setImageAlpha(getIntent().getIntExtra("photo",0));
    }
}
