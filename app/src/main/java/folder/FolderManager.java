package folder;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

import java.util.ArrayList;

public class FolderManager extends AppCompatActivity {
            ArrayList<DataFolder> dataFolders = new ArrayList<>();
            FolderAdapter folderAdapter ;
            ImageButton back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foldermanager);
        InitView();
        initToolbar();
        back =findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.inflateMenu(R.menu.menu_folder);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menufolder:
                        Toast.makeText(FolderManager.this, "pluss", Toast.LENGTH_SHORT).show();
                        break;

                }
                return false;
            }
        });

    }
    private void InitView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle2);

        dataFolders.add(new DataFolder(R.drawable.folder,"Tun anh",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Adroid",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"DCIM",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Documents",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Download",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"pictures",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Music",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Movies",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Notifications",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Audiobook",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Alarms",R.drawable.pecil,R.drawable.xoa));
        dataFolders.add(new DataFolder(R.drawable.folder,"Video",R.drawable.pecil,R.drawable.xoa));

        folderAdapter = new FolderAdapter(dataFolders,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setAdapter(folderAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
