package com.example.customexitbutton

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.Button

@SuppressLint("AppCompatCustomView")
class CustomExit(context: Context, attributeSet: AttributeSet):Button(context,attributeSet) {

    init {
        setOnClickListener(View.OnClickListener {
            System.exit(0)
        })
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.strokeWidth=25f
        canvas?.drawLine(50f,0f,50f,height.toFloat(),paint)
        canvas?.drawLine(100f,0f,100f,height.toFloat(),paint)
        canvas?.drawLine(1350f,0f,1350f,height.toFloat(),paint)
        canvas?.drawLine(1400f,0f,1400f,height.toFloat(),paint)
    }
}