package com.example.pizzarecips;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PizzaDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pizza_details);

        Intent i = getIntent() ;
        String nom = i.getStringExtra("nom");
        String description = i.getStringExtra("description");
        String preparation = i.getStringExtra("preparation");
        String detailsIngred = i.getStringExtra("detailsIngred");
        int photo = i.getIntExtra("photo",-1);


        ImageView photoPizza = findViewById(R.id.photoPizza);
        TextView nomPizza = findViewById(R.id.nomPizza);
        TextView descriptionPizza = findViewById(R.id.descriptionText);
        TextView detailsIngredPizza = findViewById(R.id.ingredientstext);
        TextView preparationPizza = findViewById(R.id.preparationtext);

        photoPizza.setImageResource(photo);
        nomPizza.setText(nom);
        descriptionPizza.setText(description);
        detailsIngredPizza.setText(detailsIngred);
        preparationPizza.setText(preparation);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}