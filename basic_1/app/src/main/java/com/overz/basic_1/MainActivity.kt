package com.overz.basic_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

/**
 * 【码上开学】Kotlin 的变量、函数和类型    练习题
 * 练习题
 * 1、使用 Android Studio 创建一个基于 Kotlin 的新项目（Empty Activity），添加一个新的属性（类型是非空的 View），在 onCreate 函数中初始化它。
 * 2、声明一个参数为 View? 类型的方法，传入刚才的 View 类型属性，并在该方法中打印出该 View? 的 id。
 * Created by Over Owen
 * 2021.06.09 10:15
 */
class MainActivity : AppCompatActivity() {
    lateinit var basicView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        basicView = findViewById(R.id.basicView)
        running(basicView)
    }
    fun running(basic:View?){
        var test = basic
        Log.e("66666666666666666666666666666", test?.id.toString())
    }
}