package com.jlixerkun.singleapp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by jlixerkun on 12/11/16.
 */

public class TextoPersonalizado extends TextView {
    public TextoPersonalizado(Context context, AttributeSet attrs) {
        super(context, attrs);
//        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/DeliusUnicase-Regular.ttf"));
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/Lobster-Regular.ttf"));
    }
}
