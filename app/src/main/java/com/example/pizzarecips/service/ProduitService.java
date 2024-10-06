package com.example.pizzarecips.service;

import com.example.pizzarecips.classes.Produit;
import com.example.pizzarecips.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    List<Produit> produits ;

    public ProduitService() {
         produits = new ArrayList<>() ;
    }
    @Override
    public boolean create(Produit o) {
         return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits ;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : produits) {
            if(p.getId()==id) {
                return p ;
            }
        }
        return null;
    }
}
