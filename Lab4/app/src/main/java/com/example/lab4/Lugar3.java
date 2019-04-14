package com.example.lab4;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Lugar3 extends Fragment {
    EditText et;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_lugar3, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button boton3=(Button)view.findViewById(R.id.boton3);
        et = (EditText)view.findViewById(R.id.editText3);

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = et.getText().toString();
                et.setText(a);
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, a );
                startActivity(intent.createChooser(intent, "Compartir Comentario"));

            }
        });
    }

}
