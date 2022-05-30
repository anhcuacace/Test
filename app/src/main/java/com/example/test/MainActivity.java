package com.example.test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitView();
        initToolbar();

    }
    private void addfile(){
        ImageButton imbtb_add= findViewById(R.id.btn_addfile);
        imbtb_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<DataPdf> arrayList = new ArrayList<>();
                arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
                PdfAdapter pdfAdapter= new PdfAdapter(arrayList);
            }
        });


    }
    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu:
                        Intent intent = new Intent(MainActivity.this, folder.FolderManager.class);
                        startActivity(intent);
                        break;
                    case R.id.search:
                        Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

    }


    public void InitView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_pdf);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<DataPdf> arrayList = new ArrayList<>();
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        arrayList.add(new DataPdf(R.mipmap.pdf,R.drawable.ic_baseline_more_vert_24,"To Kill a Mockingbird "));
        PdfAdapter PdfAdapter = new PdfAdapter(arrayList);
        recyclerView.setAdapter(PdfAdapter);
    }
}