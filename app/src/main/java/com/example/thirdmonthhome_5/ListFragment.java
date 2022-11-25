package com.example.thirdmonthhome_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

   RecyclerView chatsRecyclerView;
   ChatAdapter chatAdapter;
   private ArrayList<ChatModel> chats;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        chatsRecyclerView = view.findViewById(R.id.chats_rv);
        chats = new ArrayList<>();
        setChats();
        chatsRecyclerView.setAdapter(chatAdapter = new ChatAdapter(chats));
    }

    private void setChats() {
        chats.add(new ChatModel(R.drawable.jobs,"Geectecth50-3","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"GeekStudents","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"DevKG","Продам PlayStation"));
        chats.add(new ChatModel(R.drawable.jobs,"Java","Java 2022"));
        chats.add(new ChatModel(R.drawable.jobs,"Книги для IT","скачать книгу"));
        chats.add(new ChatModel(R.drawable.jobs,"Geectecth50-3","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"GeekStudents","Timur Moidunov"));
        chats.add(new ChatModel(R.drawable.jobs,"DevKG","Продам PlayStation"));
        chats.add(new ChatModel(R.drawable.jobs,"Java","Java 2022"));
        chats.add(new ChatModel(R.drawable.jobs,"Книги для IT","скачать книгу"));
    }
}