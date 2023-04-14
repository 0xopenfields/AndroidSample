package com.hogehoge.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.hogehgoe.ktlibrary.KtLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        {
            // Primary constructorで_title = null
            KtLibrary kt = new KtLibrary();
            String title = kt.get_title() == null ? "Null!!!!!!!!!" : kt.get_title();
            Log.d("Android Sample", title);
        }
        {
            // Secondary constructorで_title = title
            // _titleはprivate setなのでアプリケーション側からは変更不可
            KtLibrary kt = new KtLibrary("AAAAAAAAAAAAAAAAAAAAAAAAA");
            String title = kt.get_title() == null ? "Null!!!!!!!!!" : kt.get_title();
            Log.d("Android Sample", title);

            // _statusはvar宣言なのでR/W OK
            kt.set_status(10);
            Log.d("Android Sample", String.valueOf(kt.get_status()));

            // kotlinのcompanion objectは@JvmStaticを付けないとJavaからは見えない
            KtLibrary.set_staticTitle("BBBBBBBBBBBBBBBBB");
            Log.d("Android Sample", KtLibrary.get_staticTitle());

            // @JvmFieldを付けるとgetter/setterではなくダイレクトアクセス
            KtLibrary.staticField = "CCCCCCCCCCCCCCCCCC";
            Log.d("Android Sample", KtLibrary.staticField);

            // JavaのStatic関数と同義
            Log.d("Android Sample", String.valueOf(KtLibrary.add(10, 20)));
        }
    }
}