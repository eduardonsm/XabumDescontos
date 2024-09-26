package xabum;

import java.util.Comparator;

public class UsuarioNomeComparator implements Comparator<Usuario>{

	@Override
	public int compare(Usuario u1, Usuario u2) {
		return u2.getNome().compareToIgnoreCase(u1.getNome());
	}

}
