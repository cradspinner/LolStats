package com.example.inclass7;




import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	DataManager dm;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dm = new DataManager(this);
		Log.d("demo", "here");
		Photo photo1 = new Photo();
		photo1.set_id(1);
		photo1.setTitle("Title1");
		photo1.setOwner_name("owner_name1");
		photo1.setUrl("someurl");
		dm.save(photo1);
		Photo photo2 = new Photo();
		photo2.set_id(2);
		photo2.setTitle("Title2");
		photo2.setOwner_name("owner_name2");
		photo2.setUrl("someurl");
		dm.save(photo2);
		
		List<Photo> photos = dm.getAll();
		Log.d("demo", photos.toString());
		
		dm.delete(photo2);
		photos = dm.getAll();
		Log.d("demo", photos.toString());
		
		
 		
		Button submit = (Button) findViewById(R.id.button1);
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText et = (EditText) findViewById(R.id.editText1);
				String temp = et.getText().toString();
				//Log.d("test",temp);
				if(temp == null || temp.equals("")){
					Toast.makeText(MainActivity.this, "search field is empy", Toast.LENGTH_LONG).show();
				}
				else{
	
				Intent in = new Intent(MainActivity.this,GallaryActivity.class);
				in.putExtra("SEARCH", et.getText().toString());
				startActivity(in);
				}
			}
		});
	}

	@Override
	protected void onDestroy() {
		dm.close();
		super.onDestroy();
	}
}
