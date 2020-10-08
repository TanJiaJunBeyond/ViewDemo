package com.tanjiajun.viewdemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by TanJiaJun on 2020/10/8.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 创建子线程，并且启动它
        Thread {
            // 让线程睡眠一秒
//            Thread.sleep(1000)
            // 在子线程更新UI
            findViewById<TextView>(R.id.tv_content).text = "谭嘉俊"
        }.start()
    }

}