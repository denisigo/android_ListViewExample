package com.denisigo.listviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Simple text item. Just have text.
 */
public class ListViewHeaderItem extends ListViewBaseItem {

	// Text for the item
	private String mText;

	public ListViewHeaderItem(String text) {
		super();
		setText(text);
		setLayoutId(R.layout.listview_header_item);
	}

	/**
	 * Setter for the item text.
	 * 
	 * @param text
	 *            String
	 */
	public void setText(String text) {
		mText = text;
	}

	/**
	 * Getter for the item text.
	 * 
	 * @return
	 */
	public String getText() {
		return mText;
	}
	
	/**
	 * Header is non-clickable thing.
	 */
	@Override
	public boolean isEnabled(){
		return false;
	}

	/**
	 * Final implementation of the getView method. It just calls super to prepare
	 * view and then fills it with appropriate data.
	 */
	@Override
	public View getView(LayoutInflater inflater, View convertView,
			ViewGroup root) {
		// Call super class to give us usable view
		convertView = super.getView(inflater, convertView, root);

		// Now we can fill in the layout data
		((TextView) convertView.findViewById(R.id.text)).setText(getText());

		return convertView;
	}

}
