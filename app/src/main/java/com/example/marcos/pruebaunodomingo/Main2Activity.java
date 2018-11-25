package com.example.marcos.pruebaunodomingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    private String  madre;
    private String padre;
    private  String direccion;
    int dni;

    public Main2Activity(String madre, String padre, String direccion, int dni) {
        this.madre = madre;
        this.padre = padre;
        this.direccion = direccion;
        this.dni = dni;
    }
}
