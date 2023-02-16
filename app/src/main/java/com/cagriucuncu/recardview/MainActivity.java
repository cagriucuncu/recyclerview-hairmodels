package com.cagriucuncu.recardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cagriucuncu.recardview.adapters.HairModelAdapter;
import com.cagriucuncu.recardview.services.HairModelService;
import com.cagriucuncu.recardview.R;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_UI();


    }

    private void init_UI() {
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        HairModelAdapter adapter = new HairModelAdapter(HairModelService.getItems(), this);
        rv.setAdapter(adapter);
    }
}