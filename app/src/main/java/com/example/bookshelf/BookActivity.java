package com.example.bookshelf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import org.w3c.dom.Text;

public class BookActivity extends AppCompatActivity {
private TextView tvtitle,tvdescription,tvcategory;
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        SlidrInterface slidr= Slidr.attach(this);

        tvtitle=findViewById(R.id.txttitle);
        tvdescription=findViewById(R.id.txtdesc);
        tvcategory=findViewById(R.id.txtcateg);
        img=findViewById(R.id.bookthumbnail);



        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String categorybook =intent.getExtras().getString("Category");
        String Description=intent.getExtras().getString("Description");
        int image=intent.getExtras().getInt("Thumbnail");


        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
        tvcategory.setText(categorybook);



    }
}
