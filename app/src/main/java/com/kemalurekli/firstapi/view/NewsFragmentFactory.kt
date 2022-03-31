package com.kemalurekli.firstapi.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.bumptech.glide.RequestManager
import com.kemalurekli.firstapi.adapter.NewsRecyclerAdapter
import javax.inject.Inject

class NewsFragmentFactory@Inject constructor(
    private val glide : RequestManager,
    private val newsRecyclerAdapter: NewsRecyclerAdapter
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            HomeFragment::class.java.name -> HomeFragment(glide,newsRecyclerAdapter)
            else -> super.instantiate(classLoader, className)
        }
    }
}