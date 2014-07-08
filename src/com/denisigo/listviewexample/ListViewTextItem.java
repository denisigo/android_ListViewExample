package com.denisigo.listviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Simple text item. Just have text.
 */
public class ListViewTextItem extends ListViewBaseItem {

	// Text for the item
	private String mText;

	public ListViewTextItem(String text) {
		super();
		setText(text);
		setLayoutId(R.layout.listview_text_item);
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
	 * @return String text
	 */
	public String getText() {
		return mText;
	}

	/**
	 * Final implementation of the getView method. I just calls super to prepare
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
