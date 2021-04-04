package com.example.lenovo.demo1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

//自己写的方法：
//RecyclerView.Adapter是抽象类。
public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.MyViewHolder> {//注意这里使用了泛型。ViewHolder：布局持有者。
    private List<Msg> mMsgList;

    static class MyViewHolder extends RecyclerView.ViewHolder {//使用自己定义的ViewHolder，与RecyclerView.Adapter<MsgAdapter.MyViewHolder>泛型相对应。
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;

        public MyViewHolder(View itemView) {//itemView指R.layout.msg_item。
            super(itemView);
            leftLayout = itemView.findViewById(R.id.left_layout);
            rightLayout = itemView.findViewById(R.id.right_layout);
            leftMsg = itemView.findViewById(R.id.left_msg);
            rightMsg = itemView.findViewById(R.id.right_msg);
        }
    }

    public MsgAdapter(List<Msg> msgList) {//构造方法。
        this.mMsgList = msgList;
    }

    //此方法用来获取消息的布局。
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msg_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    //On Bind View Holder绑定视图保持器，每次有新消息发出时会调用此方法。
    // 此方法用来控制是否显示最新消息，以及最新消息的显示方法。
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {//第i个下标就是最新发出的消息的下标。
        Msg msg = mMsgList.get(i);
        if (msg.getType() == Msg.TYPE_RECEIVED) {
            //如果是收到的消息，则显示左边的消息布局，将右边的消息布局隐藏。
            myViewHolder.leftLayout.setVisibility(View.VISIBLE);
            myViewHolder.rightLayout.setVisibility(View.GONE);
            myViewHolder.leftMsg.setText((msg.getContent()));
        } else if (msg.getType() == Msg.TYPE_SEND) {
            //如果是发出的消息，则显示右边的消息布局，将左边的消息布局隐藏。
            myViewHolder.rightLayout.setVisibility(View.VISIBLE);
            myViewHolder.leftLayout.setVisibility(View.GONE);
            myViewHolder.rightMsg.setText((msg.getContent()));
        }
    }

    @Override
    public int getItemCount() {
//        return 0;
        return mMsgList.size();
    }
}
/*
书上的方法：
public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder> {
    private List<Msg> mMsgList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;

        public ViewHolder(View itemView) {
            super(itemView);
            leftLayout = itemView.findViewById(R.id.left_layout);
            rightLayout = itemView.findViewById(R.id.right_layout);
            leftMsg = itemView.findViewById(R.id.left_msg);
            rightMsg = itemView.findViewById(R.id.right_msg);
        }
    }

    public MsgAdapter(List<Msg> msgList) {
        this.mMsgList = msgList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        return null;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msg_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Msg msg = mMsgList.get(i);
        if (msg.getType() == Msg.TYPE_RECEIVED) {
            //如果是收到的消息，则显示左边的消息布局，将右边的消息布局隐藏。
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText((msg.getContent()));
        } else if (msg.getType() == Msg.TYPE_SEND) {
            //如果是发出的消息，则显示右边的消息布局，将左边的消息布局隐藏。
            viewHolder.rightLayout.setVisibility(View.VISIBLE);
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightMsg.setText((msg.getContent()));
        }
    }

    @Override
    public int getItemCount() {
//        return 0;
        return mMsgList.size();
    }
}
*/