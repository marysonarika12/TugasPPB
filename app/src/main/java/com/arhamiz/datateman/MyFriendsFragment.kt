package com.arhamiz.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Indah Kurniani", "Perempuan", "indah_20310004@stimata.ac.id",
            "082232829301", "Singosari"))
        listTeman.add(MyFriend("Muhammad Muhajirin", "Laki-Laki", "muhammad_20310009@stimata.ac.id",
            "085748351734", "Kediri"))
        listTeman.add(MyFriend("Fahrul Tovan Malik", "Laki-Laki", "fahrul_20310015@stimata.ac.id",
        "083894940897", "-"))
        listTeman.add(MyFriend("Veti Ningrum", "Perempuan", "veti_20510010@stimata ac.id",
        "083830265245", "Blimbing"))
        listTeman.add(MyFriend("Feri Efendi", "Laki-Laki", "feri_20520003@stimata.ac.id",
            "083857906912", "-"))
        listTeman.add(MyFriend("Ira Kestina Damayanti", "Perempuan", "ira_20510011@stimata.ac.id",
            "082132052229", "Kediri"))
        listTeman.add(MyFriend("Engga Ananda Pratama", "Laki-Laki", "engga_20520011@stimata.ac.id",
            "082140657188", "-"))
        listTeman.add(MyFriend("Mochammad Khafid", "Laki-Laki", "mochammad_20520005@stimata.ac.id",
            "0895359629199", "Batu"))
        listTeman.add(MyFriend("Kharisma Dharma Putra", "Laki-Laki", "kharisma_20520012@stimata.ac.id",
            "085733101621", "-"))
        listTeman.add(MyFriend("Rosyid Muarif", "Laki-Laki", "rosyid_20510009@stimata.ac.id",
            "085336334695", "-"))
        listTeman.add(MyFriend("Muhammad Idzam Syaroni", "Laki-Laki", "muhammad_20520007@stimata.ac.id",
            "088228258622", "-"))
        listTeman.add(MyFriend("Malinda Mahanani", "Perempuan", "malinda_20510008@stimata.ac.id",
            "082132716827", "-"))
        listTeman.add(MyFriend("Erni Septiani", "Perempuan", "erni_20510006@stimata.ac.id",
            "085784011532", "-"))
        listTeman.add(MyFriend("Aprillian Putra Pratama", "Laki-Laki", "aprillian_20510001@stimata.ac.id",
            "088217784280", "-"))
        listTeman.add(MyFriend("Dwi Kusdiana Trisnawati", "Perempuan", "dwi_20510004@stimata.ac.id",
            "085714361146", "-"))
        listTeman.add(MyFriend("Dina Nuraska", "Perempuan", "dina_20510002@stimata.ac.id",
            "083845627879", "-"))
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}