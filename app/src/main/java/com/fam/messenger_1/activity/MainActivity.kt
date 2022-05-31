package com.fam.messenger_1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fam.messenger_1.R
import com.fam.messenger_1.adapter.ChatAdapter
import com.fam.messenger_1.model.Chat
import com.fam.messenger_1.model.Message
import com.fam.messenger_1.model.Room
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
     lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()
        val rooms: ArrayList<Room> = ArrayList<Room>()
        rooms.add(Room(R.drawable.video_call, "Create room",false))
        rooms.add(Room(R.drawable.im_user_1, "Isroilov Javohir",true))
        rooms.add(Room(R.drawable.im_user_2, "Axadjonov Turinali",true))
        rooms.add(Room(R.drawable.im_user_3, "Sheraliyev Mo'mijon",true))
        rooms.add(Room(R.drawable.im_user_1, "Nizomiddinov Diyorbek",true))
        rooms.add(Room(R.drawable.im_user_2, "Isroilov Javohir",true))
        rooms.add(Room(R.drawable.im_user_3, "Axadjonov Turinali",true))
        rooms.add(Room(R.drawable.im_user_1, "Sheraliyev Mo'mijon",true))
        rooms.add(Room(R.drawable.im_user_2, "Nizomiddinov Diyorbek",true))
        rooms.add(Room(R.drawable.im_user_3, "Isroilov Javohir",true))
        // Rooms
        chats.add(Chat(rooms))
        // Messages
        chats.add(Chat(Message(R.drawable.im_user_2, "Javohir", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Turinali", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Mo'mijon", true)))
        chats.add(Chat(Message(R.drawable.im_user_2, "Diyorbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Javohir", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Turinali", true)))
        chats.add(Chat(Message(R.drawable.im_user_2, "Mo'mijon", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Diyorbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Javohir", true)))

        return chats
    }
}
