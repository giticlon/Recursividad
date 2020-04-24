import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecursividadItem {
/* Este método funciona. Utilizado en la PED de EPED
	/*
	 * 
     * Método que completa a getDoctor(int id) para realizar la búsqueda de
     * un doctor en la academia
     *
     * @param id identificador del Doctor a buscar
     * @param doctor de la academia cuyo id se compara con el id recibido por
     * parámetro hasta que se produce la coincidencia
     * @param s va desde el tamaño de la academia hasta 0 para saber si hemos
     * revisado todos los doctores de la acdemia
     * @return el doctor de la academia que coincide con el id recibido por
     * parámetro

	private DoctorIF getDoctor(int id, DoctorIF doctor, int s) {

        if (s <= 0 || doctor.getID() == id) {
            return doctor;
        }

        ListIF<DoctorIF> children = (List<DoctorIF>) doctor.getStudents();
        IteratorIF<DoctorIF> it = children.iterator();
        while (it.hasNext()) {
            DoctorIF d = it.getNext();
            s--;
            d = getDoctor(id, d, s);
            if (d != null) {
                return d;
            }
        }
        return null;
    }
*/
}
