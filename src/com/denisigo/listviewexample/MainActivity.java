package com.denisigo.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity implements ListView.OnItemClickListener{
	
	// Our custom adapter
	private ListViewAdapter mListViewAdapter;
	// ListView to display our items
	private ListView mListView;
	// ArrayList to store items
	private ArrayList<ListViewItem> mListViewItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mListView = (ListView) findViewById(R.id.list);
		
		// Create array list for items
		mListViewItems = new ArrayList<ListViewItem>(0);
		
		// Populate our list with items
		mListViewItems.add(new ListViewHeaderItem("Header one"));
		mListViewItems.add(new ListViewTextItem("Simple text item 1"));
		mListViewItems.add(new ListViewTextItem("Simple text item 2"));
		mListViewItems.add(new ListViewTextIconItem("Icon & text item 1", R.drawable.ic_action_computer));
		mListViewItems.add(new ListViewTextIconItem("Icon & text item 2", R.drawable.ic_action_bluetooth));
		mListViewItems.add(new ListViewHeaderItem("Header two"));
		mListViewItems.add(new ListViewTextItem("Simple text item 3"));
		mListViewItems.add(new ListViewTextItem("Simple text item 4"));
		mListViewItems.add(new ListViewTextIconItem("Icon & text item 3", R.drawable.ic_action_computer));
		mListViewItems.add(new ListViewTextIconItem("Icon & text item 4", R.drawable.ic_action_bluetooth));
		
		// Create our custom adapter
		mListViewAdapter = new ListViewAdapter(getApplicationContext(), mListViewItems);
		
		// Set up ListView to our adapter and item click listener
		mListView.setAdapter(mListViewAdapter);
		mListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
		// Place your click handler code here 
	}
}
