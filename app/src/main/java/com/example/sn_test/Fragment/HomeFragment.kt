package com.example.sn_test.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sn_test.AWS_Test_API
import com.example.sn_test.R
import com.example.sn_test.ResultGetScholarshipInformation
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomeFragment : Fragment() {
    private lateinit var tv_Major: TextView
    private lateinit var tv_Title: TextView
    private lateinit var tv_Link: TextView
    private lateinit var tv_Writetime: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView_Home = inflater.inflate(R.layout.fragment_home, container, false)

        tv_Major = rootView_Home.findViewById<TextView>(R.id.tv_Major)
        tv_Title = rootView_Home.findViewById<TextView>(R.id.tv_Title)
        tv_Link = rootView_Home.findViewById<TextView>(R.id.tv_Link)
        tv_Writetime = rootView_Home.findViewById<TextView>(R.id.tv_Writetime)

        val builder: Retrofit.Builder = Retrofit.Builder()
            .baseUrl("http://3.36.171.36:9000/")
            .addConverterFactory(GsonConverterFactory.create())

        val retrofit: Retrofit = builder.build()

        val client: AWS_Test_API = retrofit.create(AWS_Test_API::class.java)

        val call: Call<List<ResultGetScholarshipInformation>> = client.getScholarshipInformation()

        call.enqueue(object : Callback<List<ResultGetScholarshipInformation>> {
            override fun onFailure(call: Call<List<ResultGetScholarshipInformation>>, t: Throwable) {
                Log.e("debugTest", "error:(${t.message})")
            }

            override fun onResponse(
                call: Call<List<ResultGetScholarshipInformation>>,
                response: Response<List<ResultGetScholarshipInformation>>
            ) {
                val repos:List<ResultGetScholarshipInformation>? = response.body()
                Log.e("!!!!!!!!!!!!!!!!!!!!!!!!!!!!LOOK AT ME!!!!!!!!!!!!!!", repos?.toString() ?: "DAMN!!!!")
                var reposStr = ""

                repos?.forEach{ it ->
                    tv_Major.text = "${it.major}\n"
                    tv_Title.text = "${it.title}\n"
                    tv_Link.text = "${it.link}\n"
                    tv_Writetime.text = "${it.writeTime}\n"
                }
            }
        })
        return rootView_Home
    }
}