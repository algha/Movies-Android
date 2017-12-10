package com.yousef.movies.Layout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import com.yousef.movies.R;

/**
 * Created by yousef on 4/26/2017.
 */

public class BottomLineTextView extends android.support.v7.widget.AppCompatTextView {
    public BottomLineTextView(Context context) {
        super(context);
    }

    public BottomLineTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BottomLineTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#000"));
        paint.setStrokeWidth(getResources().getDimension(R.dimen.dp1));
        canvas.drawLine(0, getHeight(), getWidth(), getHeight(), paint);
    }


}