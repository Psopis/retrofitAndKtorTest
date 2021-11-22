package com.example.ktorappservice
import retrofit2.http.GET
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.w3c.dom.Text
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.2.131:8010")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val reference = retrofit.create(PhotosApi::class.java)
  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var texter = findViewById<TextView>(R.id.TEXT)
   texter.text = reference.getCoordintes().execute().toString()

  }





}