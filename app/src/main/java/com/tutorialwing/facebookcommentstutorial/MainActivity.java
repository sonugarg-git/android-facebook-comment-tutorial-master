package com.tutorialwing.facebookcommentstutorial;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

	String postUrl = "http://tutorialwing.com/android-facebook-integration-basic-setup/";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setFloatingActionButton();
		loadPageContent();
	}

	private void setFloatingActionButton() {
		FloatingActionButton fb = (FloatingActionButton) findViewById(R.id.fab);
		fb.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this, CommentActivity.class);
				intent.putExtra("url", postUrl);
				startActivity(intent);
			}
		});
	}

	private void loadPageContent() {
		WebView webView = (WebView) findViewById(R.id.web_view);
		if (webView != null) {
			webView.loadUrl(postUrl);
		}
	}
}
