package com.example.dllo.carhome.fragmentbutton.recommend;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by dllo on 16/10/31.
 */
public class Point extends View {
    private int r = 10;
    private boolean isSelected = false;
    public Point(Context context) {
        super(context);
    }

    public Point(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Point(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setSelected(boolean selected) {
        this.isSelected = selected;
        invalidate();
    }

    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (isSelected){
            paint.setColor(0xFFFF1744);
        } else {
            paint.setColor(0xFFFFFFFF);
        }
        canvas.drawCircle(getWidth()/2,getHeight()/2,r,paint);
    }
}
