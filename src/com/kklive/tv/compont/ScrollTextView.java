package com.kklive.tv.compont;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.widget.TextView;

public class ScrollTextView extends TextView{

	public ScrollTextView(Context context) {
		super(context);
	}
	
	public ScrollTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	
	@Override
	@ExportedProperty(category = "focus")
	public boolean isFocused() {
		return true;
	}
	
}
