package com.example.recview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> items = new ArrayList<Item>();
    Boolean Chislitel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycleview);

        GetData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Chislitel == true)
                    Chislitel = false;
                else if(Chislitel == false)
                    Chislitel = true;

                items.clear();
                GetData();

                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));
            }
        });
    }

    private void GetData()
    {
        Button btn = findViewById(R.id.btn);
        if(Chislitel == true) {
            btn.setBackgroundColor(0xFFFF0000);
            items.add(new Item("Понедельник",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color2,
                    "Пара 4: Англиский", R.drawable.color2,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Вторник",
                    "Пара 1: Математика", R.drawable.color2,
                    "Пара 2: Русский", R.drawable.color2,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: Литература", R.drawable.color1
            ));
            items.add(new Item("Среда",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Четверг",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Пятница",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));
        }
        else {
           btn.setBackgroundColor(0xFF3F51B5);

            items.add(new Item("Понедельник",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: ОПД", R.drawable.color3,
                    "Пара 4: -", R.drawable.color3,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Вторник",
                    "Пара 1: -", R.drawable.color3,
                    "Пара 2: -", R.drawable.color3,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: Литература", R.drawable.color1
            ));
            items.add(new Item("Среда",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Четверг",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));
            items.add(new Item("Пятница",
                    "Пара 1: Математика", R.drawable.color1,
                    "Пара 2: Русский", R.drawable.color1,
                    "Пара 3: Информатика", R.drawable.color1,
                    "Пара 4: Англиский", R.drawable.color1,
                    "Пара 5: -", R.drawable.color1
            ));

        }

    }
}