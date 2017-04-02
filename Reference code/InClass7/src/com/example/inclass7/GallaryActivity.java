package com.example.inclass7;



import java.util.ArrayList;



import java.util.List;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GallaryActivity extends Activity {
	ArrayList<Photo> photoList = new ArrayList<Photo>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallary);
	}
	private class  myListAdapter extends ArrayAdapter<Photo> {
		// TODO Auto-generated method stub
		public myListAdapter(){
			super(GallaryActivity.this, R.layout.gallary_list_layout,photoList);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View itemView = convertView;
			if (itemView == null){
				itemView = getLayoutInflater().inflate(R.layout.gallary_list_layout, parent,false);
			}
			Photo currentPhoto = photoList.get(position);
			
			//TextView title  = (TextView) itemView.findViewById(android.R.id.));
			

			
			return itemView;
		}
	}
}
