package com.test720.grasshoppercollege.module.danCiTingXie;

import android.content.Intent;
import android.view.View;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.test720.grasshoppercollege.Adapter.MyBookAdapter;
import com.test720.grasshoppercollege.HttpBean.JiangJieShouYeData;
import com.test720.grasshoppercollege.MyApplication;
import com.test720.grasshoppercollege.PublickMyBooksActivity;
import com.test720.grasshoppercollege.untils.HttpUntil;

import java.util.ArrayList;
import java.util.List;

import okhttp3.FormBody;

public class DanCiTingXieShouYeActivity extends PublickMyBooksActivity {
    public List<JiangJieShouYeData.DataBean.ListBean> list = new ArrayList<>();
    private MyBookAdapter adapter;

    @Override
    public void wanCheng() {
        if (adapter != null) {
            adapter.setSet(false);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public String Booktitle() {
        return "单词听写";
    }

    @Override
    public void setBook() {
        if (adapter != null) {
            adapter.setSet(true);
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void add() {
        jumpToActivity(DanCiAddBookActivity.class, false);
    }

    @Override
    public String url() {
        return HttpUntil.GetIntent().WordmyBookList();
    }

    @Override
    public void shuaXin(String str) {
        JiangJieShouYeData data = new Gson().fromJson(str, JiangJieShouYeData.class);
        if (data.getCode() == 1) {
            list.clear();
            list.addAll(data.getData().getList());
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public void gengDuo(String str) {
        JiangJieShouYeData data = new Gson().fromJson(str, JiangJieShouYeData.class);
        if (data.getCode() == 1) {
            list.addAll(data.getData().getList());
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public FormBody.Builder formBuilder() {
        FormBody.Builder formBuilder = new FormBody.Builder();
        formBuilder.add("p", page + "");//请求参数一
        formBuilder.add("type", "23");//请求参数一
        formBuilder.add("class", MyApplication.getmInstance().nianji);
        formBuilder.add("uid", MyApplication.getmInstance().getUid() + "");//请求参数二
        return formBuilder;
    }


    @Override
    protected void initData() {
        adapter = new MyBookAdapter<JiangJieShouYeData.DataBean.ListBean>(list, this) {
            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                super.onBindViewHolder(holder, position);
                final int pos = position * 2;
                Glide.with(mcontext).load(list.get(pos).getPic()).into(holder.one);
                holder.oneUp.setText(list.get(pos).getBook_version());
                String one = list.get(pos).getClassX() + " " + list.get(pos).getStatus();
                holder.oneDown.setText(one);
                holder.one_sc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        delBook(list.get(pos).getBook_id());
                        list.remove(pos);
                        adapter.notifyDataSetChanged();
                    }
                });
                if (list.size() > (pos + 1)) {
                    Glide.with(mcontext).load(list.get(pos + 1).getPic()).into(holder.two);
                    holder.twoUp.setText(list.get(pos + 1).getBook_version());
                    String two = list.get(pos + 1).getClassX() + " " + list.get(pos + 1).getStatus();
                    holder.twoDown.setText(two);
                    holder.two_sc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            delBook(list.get(pos + 1).getBook_id());
                            list.remove(pos + 1);
                            adapter.notifyDataSetChanged();
                        }
                    });
                }
            }

            @Override
            public void bookClick(int position) {
                Intent in = new Intent(mcontext, DanCiUnitActivity.class);
                in.putExtra("book_id", list.get(position).getBook_id());
                jumpToActivity(in, false);
            }
        };
        recyclerView.setAdapter(adapter);
    }

    /*删除课本*/
    public void delBook(String id) {
        FormBody.Builder formBuilder = new FormBody.Builder();
        formBuilder.add("book_id", id + "");//请求参数一
        formBuilder.add("uid", MyApplication.getmInstance().getUid());//请求参数二
        Post(HttpUntil.GetIntent().WorddelBook(), formBuilder, 5, false);
    }

    @Override
    public void GetHttpBackStr(String str, int what) {
        super.GetHttpBackStr(str, what);
        if (what == 5) {
            if (!codeIsOne(str)) {
                ShuaXin();
            }
        }
    }
}

