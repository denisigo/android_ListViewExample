package com.denisigo.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Custom ListViewAdapter. This adapter extends BaseAdapter.
 */
public class ListViewAdapter extends BaseAdapter {

	private Context mContext;
	private ArrayList<ListViewItem> mItems;
	LayoutInflater mInflater;
	
	public ListViewAdapter(Context context) {
		mContext = context;
		init();
	}

	public ListViewAdapter(Context context, ArrayList<ListViewItem> items) {
		mContext = context;
		mItems = items;
		init();
	}
	
	/**
	 * Set items.
	 * @param items ArrayList of items implementing ListViewItem interface
	 */
	public void setItems(ArrayList<ListViewItem> items){
		mItems = items;
		notifyDataSetChanged();
	}
	
	/**
	 * Initiate adapter, get layout inflater etc.
	 */
	private void init(){
		mInflater = (LayoutInflater) mContext
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		if (mItems != null)
			return mItems.size();
		return 0;
	}

	@Override
	public Object getItem(int position) {
		if (mItems != null)
			return mItems.get(position);
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}
	
	@Override
	public boolean isEnabled(int position) {
		final ListViewItem item = (ListViewItem) getItem(position);
		if (item != null)
			return item.isEnabled();
		return false;
	}

	/**
	 * Method to generate view for an item at given position.
	 * Adapter delegate view generation to the items themselves.
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup root) {
		return ((ListViewBaseItem) getItem(position)).getView(mInflater, convertView, root);
	}

}
