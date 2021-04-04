package com.example.lenovo.demo1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

//�Լ�д�ķ�����
//RecyclerView.Adapter�ǳ����ࡣ
public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.MyViewHolder> {//ע������ʹ���˷��͡�ViewHolder�����ֳ����ߡ�
    private List<Msg> mMsgList;

    static class MyViewHolder extends RecyclerView.ViewHolder {//ʹ���Լ������ViewHolder����RecyclerView.Adapter<MsgAdapter.MyViewHolder>�������Ӧ��
        LinearLayout leftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;

        public MyViewHolder(View itemView) {//itemViewָR.layout.msg_item��
            super(itemView);
            leftLayout = itemView.findViewById(R.id.left_layout);
            rightLayout = itemView.findViewById(R.id.right_layout);
            leftMsg = itemView.findViewById(R.id.left_msg);
            rightMsg = itemView.findViewById(R.id.right_msg);
        }
    }

    public MsgAdapter(List<Msg> msgList) {//���췽����
        this.mMsgList = msgList;
    }

    //�˷���������ȡ��Ϣ�Ĳ��֡�
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.msg_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    //On Bind View Holder����ͼ��������ÿ��������Ϣ����ʱ����ô˷�����
    // �˷������������Ƿ���ʾ������Ϣ���Լ�������Ϣ����ʾ������
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {//��i���±�������·�������Ϣ���±ꡣ
        Msg msg = mMsgList.get(i);
        if (msg.getType() == Msg.TYPE_RECEIVED) {
            //������յ�����Ϣ������ʾ��ߵ���Ϣ���֣����ұߵ���Ϣ�������ء�
            myViewHolder.leftLayout.setVisibility(View.VISIBLE);
            myViewHolder.rightLayout.setVisibility(View.GONE);
            myViewHolder.leftMsg.setText((msg.getContent()));
        } else if (msg.getType() == Msg.TYPE_SEND) {
            //����Ƿ�������Ϣ������ʾ�ұߵ���Ϣ���֣�����ߵ���Ϣ�������ء�
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
���ϵķ�����
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
            //������յ�����Ϣ������ʾ��ߵ���Ϣ���֣����ұߵ���Ϣ�������ء�
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText((msg.getContent()));
        } else if (msg.getType() == Msg.TYPE_SEND) {
            //����Ƿ�������Ϣ������ʾ�ұߵ���Ϣ���֣�����ߵ���Ϣ�������ء�
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