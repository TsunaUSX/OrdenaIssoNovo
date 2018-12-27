package com.ordenaisso.gabriel.ordenaisso;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class numerosArrayAdapter extends ArrayAdapter<numeros> {
    private LayoutInflater inflater;


    public numerosArrayAdapter(Activity activity, List<numeros> itens) {
        super(activity, R.layout.lista_numeros, itens);
        this.inflater = (LayoutInflater)
                activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    static class ViewHolder {
        public TextView numPos;
        public TextView num;
    }
}

    public View getView(int position, View row, ViewGroup parent) {
        ViewHolder holder;
        if (row == null) {
            row = inflater.inflate(R.layout.lista_numeros, null);
            holder = new ViewHolder();
            holder.numPos = (TextView) row.findViewById(R.id.idPosicao);
            holder.num = (TextView) row.findViewById(R.id.idNum);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
    }

    public View getView(int position, View row, ViewGroup parent) {
        ViewHolder holder;
        numeros n = getItem(position);
        holder.numPos.setText(n.getPos());
        holder.num.setText(n.getNum());
        return row;
    }



