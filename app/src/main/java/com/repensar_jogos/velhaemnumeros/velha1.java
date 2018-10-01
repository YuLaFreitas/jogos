package com.repensar_jogos.velhaemnumeros;

import android.support.constraint.solver.Cache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.repensar_jogos.velhaemnumeros.R.id.texto;

public class velha1 extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velha1);

    }

    int valorUnitario;

    int a1 = 0, a2 = 0, a3 = 0;

    int b1 = 0, b2 = 0, b3 = 0;

    int c1 = 0, c2 = 0, c3 = 0;

    TextView txt = findViewById(R.id.texto);

    @Override
    public void onClick(View v) {

        EditText ia1 = findViewById(R.id.a1);
        EditText ia2 = findViewById(R.id.a2);
        EditText ia3 = findViewById(R.id.a3);

        EditText ib1 = findViewById(R.id.b1);
        EditText ib2 = findViewById(R.id.b2);
        EditText ib3 = findViewById(R.id.b3);

        EditText ic1 = findViewById(R.id.c1);
        EditText ic2 = findViewById(R.id.c2);
        EditText ic3 = findViewById(R.id.c3);

        a1 = Integer.valueOf(String.valueOf(ia1));
        a2 = Integer.valueOf(String.valueOf(ia2));
        a3 = Integer.valueOf(String.valueOf(ia3));

        b1 = Integer.valueOf(String.valueOf(ib1));
        b2 = Integer.valueOf(String.valueOf(ib2));
        b3 = Integer.valueOf(String.valueOf(ib3));

        c1 = Integer.valueOf(String.valueOf(ic1));
        c2 = Integer.valueOf(String.valueOf(ic2));
        c3 = Integer.valueOf(String.valueOf(ic3));

        //Valor capitado pelo metodo soma()
        if (v.getId() == R.id.btn){

           int soma = seq();


                txt.setText("" + soma);
        }
    }

    //se atender o critério de 3 casa seuenciais retorna a soma
    public int seq(){
        int solver;
        if(seqLog()) {
            solver = valorUnitario;
        }else{
            solver=0;
        }


        return solver;
    }




//testa todos as celulas da tabela
public boolean seqLog() {

    EditText ia1 = findViewById(R.id.a1);
    EditText ia2 = findViewById(R.id.a2);
    EditText ia3 = findViewById(R.id.a3);

    EditText ib1 = findViewById(R.id.b1);
    EditText ib2 = findViewById(R.id.b2);
    EditText ib3 = findViewById(R.id.b3);

    EditText ic1 = findViewById(R.id.c1);
    EditText ic2 = findViewById(R.id.c2);
    EditText ic3 = findViewById(R.id.c3);

        Boolean laUm;
        Boolean laDois;
        Boolean laTres;

        Boolean lbUm;
        Boolean lbDois;
        Boolean lbTres;

        Boolean lcUm;
        Boolean lcDois;
        Boolean lcTres;

        Boolean logica= false;

        if (ia1.getText().equals(null)) { laUm = false;   } else {laUm = true;}
        if (ia2.getText().equals(null)) { laDois = false;   }else {laDois = true;}
        if (ia3.getText().equals(null)) { laTres = false;   }else {laTres = true;}

        if (ib1.getText().equals(null)) { lbUm = false;   } else {lbUm = true;}
        if (ib2.getText().equals(null)) { lbDois = false;   }else {lbDois = true;}
        if (ib3.getText().equals(null)) { lbTres = false;   }else {lbTres = true;}

        if (ic1.getText().equals(null)) { lcUm = false;   } else {lcUm = true;}
        if (ic2.getText().equals(null)) { lcDois = false;   }else {lcDois = true;}
        if (ic3.getText().equals(null)) { lcTres= false;   }else {lcTres = true;}

        //Linha 1
        if(laUm && laDois && laTres) {
            logica = true;

            a1 = Integer.valueOf(String.valueOf(ia1));
            a2 = Integer.valueOf(String.valueOf(ia2));
            a3 = Integer.valueOf(String.valueOf(ia3));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(0));
            b3 = Integer.valueOf(String.valueOf(0));

            c1 = Integer.valueOf(String.valueOf(0));
            c2 = Integer.valueOf(String.valueOf(0));
            c3 = Integer.valueOf(String.valueOf(0));



            valorUnitario = soma(a1, a2, a3);

        }

        //Linha 2
         if(lbUm && lbDois && lbTres){
            logica = true;
            b1 = Integer.valueOf(String.valueOf(ib1));
            b2 = Integer.valueOf(String.valueOf(ib2));
            b3 = Integer.valueOf(String.valueOf(ib3));

             a1 = Integer.valueOf(String.valueOf(0));
             a2 = Integer.valueOf(String.valueOf(0));
             a3 = Integer.valueOf(String.valueOf(0));

             c1 = Integer.valueOf(String.valueOf(0));
             c2 = Integer.valueOf(String.valueOf(0));
             c3 = Integer.valueOf(String.valueOf(0));

            valorUnitario = soma(b1, b2, b3);


        }

        //Linha 3
        if (lcUm && lcDois && lcTres){
            logica = true;

            c1 = Integer.valueOf(String.valueOf(ic1));
            c2 = Integer.valueOf(String.valueOf(ic2));
            c3 = Integer.valueOf(String.valueOf(ic3));

            a1 = Integer.valueOf(String.valueOf(0));
            a2 = Integer.valueOf(String.valueOf(0));
            a3 = Integer.valueOf(String.valueOf(0));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(0));
            b3 = Integer.valueOf(String.valueOf(0));


            valorUnitario = soma(c1, c2, c3);

        }

        //Coluna 1
        if (laUm && lbUm && lcUm){
            logica = true;

            a1 = Integer.valueOf(String.valueOf(ia1));
            a2 = Integer.valueOf(String.valueOf(0));
            a3 = Integer.valueOf(String.valueOf(0));

            b1 = Integer.valueOf(String.valueOf(ib1));
            b2 = Integer.valueOf(String.valueOf(0));
            b3 = Integer.valueOf(String.valueOf(0));

            c1 = Integer.valueOf(String.valueOf(ic1));
            c2 = Integer.valueOf(String.valueOf(0));
            c3 = Integer.valueOf(String.valueOf(0));


            valorUnitario = soma(a1, b1, c1);

        }

        //Coluna 2
        if (laDois && lbDois && lcDois){
            logica = true;

            a1 = Integer.valueOf(String.valueOf(0));
            a2 = Integer.valueOf(String.valueOf(ia2));
            a3 = Integer.valueOf(String.valueOf(0));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(ib2));
            b3 = Integer.valueOf(String.valueOf(0));

            c1 = Integer.valueOf(String.valueOf(0));
            c2 = Integer.valueOf(String.valueOf(ic2));
            c3 = Integer.valueOf(String.valueOf(0));

            valorUnitario = soma(a2, b2, c2);

        }

        //Coluna 3
        if (laTres && lbTres && lcTres){
            logica = true;

            a1 = Integer.valueOf(String.valueOf(0));
            a2 = Integer.valueOf(String.valueOf(0));
            a3 = Integer.valueOf(String.valueOf(ia3));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(0));
            b3 = Integer.valueOf(String.valueOf(ib3));

            c1 = Integer.valueOf(String.valueOf(0));
            c2 = Integer.valueOf(String.valueOf(0));
            c3 = Integer.valueOf(String.valueOf(ic3));

            valorUnitario = soma(a3, b3, c3);

        }

        //Diagonal 1
        if (laUm && lbDois && lcTres){
            logica = true;

            a1 = Integer.valueOf(String.valueOf(ia1));
            a2 = Integer.valueOf(String.valueOf(0));
            a3 = Integer.valueOf(String.valueOf(0));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(ib2));
            b3 = Integer.valueOf(String.valueOf(0));

            c1 = Integer.valueOf(String.valueOf(0));
            c2 = Integer.valueOf(String.valueOf(0));
            c3 = Integer.valueOf(String.valueOf(ic3));


            valorUnitario = soma(a1, b2, c3);

        }

        //Diagonal 2
        if (lcUm && lbDois && laTres){
            logica = true;

            a1 = Integer.valueOf(String.valueOf(0));
            a2 = Integer.valueOf(String.valueOf(0));
            a3 = Integer.valueOf(String.valueOf(ia3));

            b1 = Integer.valueOf(String.valueOf(0));
            b2 = Integer.valueOf(String.valueOf(ib2));
            b3 = Integer.valueOf(String.valueOf(0));

            c1 = Integer.valueOf(String.valueOf(ic1));
            c2 = Integer.valueOf(String.valueOf(0));
            c3 = Integer.valueOf(String.valueOf(0));


            valorUnitario = soma(c1, b2, a3);

        }


        return logica;
    }


    //usado para somar os dados
    public Integer soma(int a, int b, int c) {
        return a + b + c;
    }
}

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
        /*EditText aUm =findViewById(R.id.a1);


        //if (aUm == null){aUm.setText(0);}
        EditText aDois=findViewById(R.id.a2);

        //if (aDois == null){aDois.setText(0);}
        EditText aTres=findViewById(R.id.a3);

        //if (aTres == null){aTres.setText(0);}
        EditText bUm =findViewById(R.id.b1);

        //if (bUm == null){bUm.setText(0);}
        EditText bDois=findViewById(R.id.b2);

        //if (bDois == null){bDois.setText(0);}
        EditText bTres =findViewById(R.id.b3);

        //if (bTres == null){bTres.setText(0);}
        EditText cUm = findViewById(R.id.c1);

        //if (cUm == null){cUm.setText(0);}
        EditText cDois=findViewById(R.id.c2);

        //if (cDois == null){cDois.setText(0);}
        EditText cTres=findViewById(R.id.c3);

        //if (cTres == null){cTres.setText(0);}*/


//EditText txt = findViewById(R.id.texto);

//Button btn = findViewById(R.id.btn);

//String b1 = bUm.getText().toString();