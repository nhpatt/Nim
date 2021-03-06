package com.gusycorp.nim;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class TipoPartidaAdapter extends ArrayAdapter<TipoPartida> {

	public TipoPartidaAdapter(final Partidas context, final int resource,
			final List<TipoPartida> tipoPartidas) {
		super(context, resource, tipoPartidas);
	}

	@Override
	public View getView(final int position, View row,
			final ViewGroup parent) {
		if (row == null) {
			final LayoutInflater vi = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = vi.inflate(R.layout.row_partida, null);
		}

		final TipoPartida tipoPartida = getItem(position);
		final TextView oponente = (TextView) row
				.findViewById(R.id.nombre_rival);
		oponente.setText(tipoPartida.getOponent());
		final TextView row1 = (TextView) row.findViewById(R.id.row1);
		row1.setText(tipoPartida.getRow1());
		final TextView row2 = (TextView) row.findViewById(R.id.row2);
		row2.setText(tipoPartida.getRow2());
		final TextView row3 = (TextView) row.findViewById(R.id.row3);
		row3.setText(tipoPartida.getRow3());
		final CheckBox modoMiseria = (CheckBox) row
				.findViewById(R.id.modo_miseria);
		modoMiseria.setChecked(tipoPartida.isMisereGame());
		return row;
	}
}
