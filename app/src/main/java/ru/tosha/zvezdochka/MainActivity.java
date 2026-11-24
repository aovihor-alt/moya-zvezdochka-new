package ru.tosha.zvezdochka;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.setBackgroundColor(0xFFFFF1F5);
        web.loadUrl("file:///android_asset/index.html");
        setContentView(web);
    }
}
