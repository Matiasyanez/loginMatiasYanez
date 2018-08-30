package com.example.alumnoicin.loginmatiasyanez;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alumno ICIN on 30-08-2018.
 */

public class MyAdapter extends BaseAdapter {
    private List<Alumno> list;
    private int layout;
    private Context context;

    public MyAdapter(List<Alumno> list, int layout, Context context){
        this.list = list;
        this.layout = layout;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder vh;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout, null);
            vh = new ViewHolder();
            vh.rut = (TextView) convertView.findViewById(R.id.textViewRut);
            vh.nombre = (TextView) convertView.findViewById(R.id.textViewNombre);
            vh.edad = (TextView) convertView.findViewById(R.id.textViewEdad);
            vh.direccion = (TextView) convertView.findViewById(R.id.textViewDireccion);
            vh.sueldo = (TextView) convertView.findViewById(R.id.textViewSueldo);
            vh.cargo = (TextView) convertView.findViewById(R.id.textViewCargo);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        Alumno a = list.get(position);
        vh.rut.setText(a.getRut() + "");
        vh.nombre.setText(a.getNombre());
        vh.edad.setText(a.getEdad() + "");
        vh.direccion.setText(a.getDireccion());
        vh.sueldo.setText(a.getSueldo() + "");
        vh.cargo.setText(a.getCargo());
        return convertView;
    }

    private class ViewHolder {
        TextView rut;
        TextView nombre;
        TextView edad;
        TextView direccion;
        TextView sueldo;
        TextView cargo;
    }
}
