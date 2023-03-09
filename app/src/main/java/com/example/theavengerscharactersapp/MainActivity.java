package com.example.theavengerscharactersapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "The Avengers Characters";
    private RecyclerView rvCharacters;
    private ArrayList<Characters> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvCharacters = findViewById(R.id.rv_characters);
        rvCharacters.setHasFixedSize(true);

        list.addAll(CharactersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCharacters.setLayoutManager(new LinearLayoutManager(this));
        ListCharactersAdapter listCharactersAdapter = new ListCharactersAdapter(list);
        rvCharacters.setAdapter(listCharactersAdapter);

        listCharactersAdapter.setOnItemClickCallback(new ListCharactersAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Characters data) {
                showSelectedCharacters(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvCharacters.setLayoutManager(new GridLayoutManager(this, 2));
        GridCharactersAdapter gridCharactersAdapter = new GridCharactersAdapter(list);
        rvCharacters.setAdapter(gridCharactersAdapter);

        gridCharactersAdapter.setOnItemClickCallback(new GridCharactersAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Characters data) {
                showSelectedCharacters(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvCharacters.setLayoutManager(new LinearLayoutManager(this));
        CardViewCharactersAdapter cardViewCharactersAdapter = new CardViewCharactersAdapter(list);
        rvCharacters.setAdapter(cardViewCharactersAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "The Avengers Characters";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "All Characters Image";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "The Avengers Characters Card";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedCharacters(Characters characters) {
        Toast.makeText(this, "Kamu memilih " + characters.getName(), Toast.LENGTH_SHORT).show();
    }
}