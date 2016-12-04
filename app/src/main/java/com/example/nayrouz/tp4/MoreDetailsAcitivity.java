package com.example.nayrouz.tp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MoreDetailsAcitivity extends AppCompatActivity {
        WebView myweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details_acitivity);
        myweb=(WebView)findViewById(R.id.myWeb);
        Bundle extras = getIntent().getExtras();
        String url=extras.getString("url");
      //  Log.i("url",url);
        myweb.getSettings().setJavaScriptEnabled(true);
        myweb.setWebViewClient(new MyBrowser());
        myweb.loadUrl(url);
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

