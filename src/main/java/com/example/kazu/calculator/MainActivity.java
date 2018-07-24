package com.example.kazu.calculator;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
// Autor Carol Johana Meneses Pineda
//Calculadora Notación Polaca

public class MainActivity extends AppCompatActivity {
    public double op1, op2,res;
   LinkedList<Double> numeros= new LinkedList<>();
    public boolean point=false;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonmult,buttonmas,buttonPoint,buttonMasMenos,buttonSin,buttonCos,buttonTan,buttonmenos,buttonAc;
    private TextView text;
    private boolean unidad=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text=(TextView)findViewById(R.id.textView) ;
        Button b0=(Button)findViewById(R.id.button0);
         ;
    }


  public void onClickDouble(View miView){

    point=true;

  }
    public void onClickNumber0(View miView) {
        double num1=0;
    if(!point &&!unidad) {
        numeros.add((double) 0);
        text.setText("0");
    } else evaluarDecimal(0);
    if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber1(View miView) {
        double num1=0;
        if(!point &&unidad==false) {
            numeros.add((double) 1);
            text.setText("1");
        } else evaluarDecimal(1);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }

    public void onClickNumber2(View miView) {
        double num1=0;
        if(!point &&unidad==false) {
            numeros.add((double) 2);
            text.setText("2");
        } else evaluarDecimal(2);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber3(View miView) {
        double num1=0;
        if(!point && unidad==false) {
            numeros.add((double) 3);
            text.setText("0");

        } else evaluarDecimal(3);

        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }


    public void onClickNumber4(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double) 4);
            text.setText("4");

        } else evaluarDecimal(4);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber5(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double)5);
            text.setText("5");

        } else evaluarDecimal(5);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber6(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double) 6);
            text.setText("6");

        } else evaluarDecimal(6);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber7(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double) 7);
            text.setText("7");

        } else evaluarDecimal(7);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber8(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double) 8);
            text.setText("8");

        } else evaluarDecimal(8);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickNumber9(View miView) {
        double num1=0;
        if(!point &&!unidad) {
            numeros.add((double) 9);
            text.setText("9");

        } else evaluarDecimal(9);
        if(!point&&unidad&&numeros.size()>=1) evaluarUnidades();
    }
    public void onClickSign(View miView) {
        double num=0.0;
    //    text.setText(String.valueOf(numeros.get(numeros.size()-1)));
        if(numeros.size()>0) {
            num = (numeros.get(numeros.size() - 1))* -1.0;
            numeros.set(numeros.size() - 1, num);
        }
        String text1=String.valueOf(num);
       text.setText(text1);

    }
    private void evaluarDecimal(double num) {
        double num1=0;
        if(numeros.size()>0)
            num1=numeros.get(numeros.size()-1);
        num1=num1+(num/10);
        numeros.set(numeros.size()-1,num1);
        text.setText(String.valueOf(numeros.get(numeros.size()-1)));
        point=false;
    }
    public void onClickSum(View miView){
        double sum=0;
        if(numeros.size()==2){
            sum=numeros.get(numeros.size()-2)+numeros.get(numeros.size()-1);
        }else {
            if (numeros.size() == 1) sum = numeros.get(numeros.size() - 1);
        }
        text.setText(String.valueOf(sum));
        numeros.clear();
        numeros.add(sum);
    }
    public void onClickRest(View miView){
        double rest=0;
        if(numeros.size()==2){
            rest=numeros.get(numeros.size()-2)-numeros.get(numeros.size()-1);
        }else {
            if (numeros.size() == 1) rest = numeros.get(numeros.size() - 1);
        }
        text.setText(String.valueOf(rest));
        numeros.clear();
        numeros.add(rest);
    }
    public void onClickMult(View miView){
        double mult=0;
        if(numeros.size()==2){
            mult=(numeros.get(numeros.size()-2))*(numeros.get(numeros.size()-1));
        }
        text.setText(String.valueOf(mult));
        numeros.clear();
        numeros.add(mult);
    }
    public void onClickDiv(View miView){
        double divd=0;
        if(numeros.size()==2){
            if((numeros.get(numeros.size()-1))!=0)
                divd=(numeros.get(numeros.size()-2))/(numeros.get(numeros.size()-1));
        }
        text.setText(String.valueOf(divd));
        numeros.clear();
        numeros.add(divd);
    }
    public void onClickSin(View miView){
        double angulo=0;

        if(numeros.size()>=1) {
            angulo = (numeros.get(numeros.size() - 1)) * 2.0 * Math.PI / 360.0;
            angulo = Math.sin(angulo);
        }
        text.setText(String.valueOf(angulo));
        numeros.clear();
        numeros.add(angulo);
    }
    public void onClickCos(View miView){
        double angulo=0;

        if(numeros.size()>=1) {
            angulo = (numeros.get(numeros.size() - 1)) * 2.0 * Math.PI / 360.0;
            angulo = Math.cos(angulo);
        }
        text.setText(String.valueOf(angulo));
        numeros.clear();
        numeros.add(angulo);
    }
    // Permite calcular la potencia cuadrada de una cifra
    public void onClickPow(View miView){
        double pow=0;

        if(numeros.size()>=1) {
            pow = (numeros.get(numeros.size() - 1)) * (numeros.get(numeros.size() - 1));

        }
        text.setText(String.valueOf(pow));
        numeros.clear();
        numeros.add(pow);
    }
    // Permite calcular el porcentaje de una cifra
    public void onClickPorc(View miView){
        double porc=0;
        if(numeros.size()==2){
            porc=(numeros.get(numeros.size()-2)*numeros.get(numeros.size()-1))/100;
        }
        text.setText(String.valueOf(porc));
        numeros.clear();
        numeros.add(porc);
    }
    public void onClickClear(View miView){
        numeros.clear();
        text.setText("0");
    }
    public void onClickUnidad(View miView){
        unidad=true;

    }
//Permite afregar más unidades al lado derecho de la cifra
    private void evaluarUnidades() {
        double num1=0;
        num1=numeros.get(numeros.size()-1)*10;
        numeros.set(numeros.size()-1,num1);
        text.setText(String.valueOf(num1));
        unidad=false;
    }

}
