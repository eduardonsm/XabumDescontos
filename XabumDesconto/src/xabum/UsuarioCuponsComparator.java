package xabum;

import java.util.Comparator;

public class UsuarioCuponsComparator implements Comparator<Usuario>{

	@Override
	public int compare(Usuario o1, Usuario o2) {
		return Integer.compare(o2.getTotalCupons(), o1.getTotalCupons());
	}

}
