package com.example.pizzarecips.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzarecips.R;
import com.example.pizzarecips.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits ;
    private LayoutInflater inflater ;

    public PizzaAdapter(List<Produit> produits , Activity activity){
        this.produits = produits ;
        inflater =(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null ){
            convertView = inflater.inflate(R.layout.item,null);
        }

        ImageView photo = convertView.findViewById(R.id.photo);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbr = convertView.findViewById(R.id.nbr);
        TextView duree = convertView.findViewById(R.id.duree);

        photo.setImageResource(produits.get(position).getPhoto());
        nom.setText(produits.get(position).getNom()+"");
        nbr.setText(produits.get(position).getNbrIngredients()+"");
        duree.setText(produits.get(position).getDuree()+"");

        return convertView;
    }
}
