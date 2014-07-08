package com.denisigo.listviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Interface for ListViewItem item.
 */
public interface ListViewItem {
	/**
	 * Whether item is enabled or not.
	 * @return true if enabled false otherwise.
	 */
	public boolean isEnabled();

	/**
	 * Each item is responsible for inflating its own view.
	 * 
	 * @param inflater
	 *            Inflater service provided by adapter.
	 * @param convertView
	 *            Previously created view which might be reused. Implementors
	 *            MUST check for view.getId() to match id of layout they use.
	 * @param root
	 *            Root view to inflate.
	 * @return View instance.
	 */
	public View getView(LayoutInflater inflater, View convertView,
			ViewGroup root);
}
