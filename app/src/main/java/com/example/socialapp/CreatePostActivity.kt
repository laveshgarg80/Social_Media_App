package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.socialapp.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        postDao = PostDao()

        postButton.setOnClickListener{
           // Toast.makeText(this,"button clicked",Toast.LENGTH_LONG).show()
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                Toast.makeText(this,"button clicked",Toast.LENGTH_LONG).show()
                finish()
            }

        }

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

    }
}