package com.example.animationsplash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MapAcitivity extends AppCompatActivity {
    private WebView W;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_acitivity);

        W=findViewById(R.id.w);
       W.loadUrl("");
        // W.loadUrl("https://www.youtube.com/");
        // W.loadUrl("https://www.google.com/");
        // W.loadUrl("https://www.olacabs.com/");
        //W.loadUrl("https://www.mmumullana.org/");
        // W.loadUrl("https://www.google.com/maps/place/Maharishi+Markandeshwar+(Deemed+to+be+University)/@50.9436591,53.9964953,2z/data=!4m5!3m4!1s0x390fad2d69058e33:0xc7d016db25112762!8m2!3d30.251223!4d77.047538");
        WebSettings wb=W.getSettings();
        // wb.setJavaScriptCanOpenWindowsAutomatically(true);
        wb.setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(W.canGoBack()){
            W.goBack();}
        else
        {
            super.onBackPressed();
        }
    }}


