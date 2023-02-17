package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;//контекст приложения
    private CharSequence text;//текст для пользователя
    private int duration = Toast.LENGTH_SHORT;//время
    private static final String TAG = "MyTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        CharSequence text = "Create!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onCreate");//добавляем логи
        Log.i(TAG,"OnCreate");//добавляем логи
    }

    @Override
    protected void onStart() {
        super.onStart();
        context = getApplicationContext();
        CharSequence text = "Start!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onStart");//добавляем логи
        Log.e(TAG,"OnStart");//добавляем логи

    }
    @Override
    protected void onStop() {
        super.onStop();
        context = getApplicationContext();
        CharSequence text = "Stop!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onStop");//добавляем логи
        Log.v(TAG,"onStop");//добавляем логи
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        context = getApplicationContext();
        CharSequence text = "Destroy!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onDestroy");//добавляем логи
        Log.w(TAG,"OnDestroy");//добавляем логи
    }
    @Override
    protected void onPause() {
        super.onPause();
        context = getApplicationContext();
        CharSequence text = "Pause!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onPause");//добавляем логи
    }
    @Override
    protected void onResume() {
        super.onResume();
        context = getApplicationContext();
        CharSequence text = "Resume!";
        Toast.makeText(context, text, duration).show();//отображаем Toast

        Log.d(TAG,"onResume");//добавляем логи
    }
}