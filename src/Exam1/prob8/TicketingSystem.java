package exam1.prob8;

import java.util.ArrayList;
import java.util.List;

public class TicketingSystem {
    
    List<Reservation> listReservation = new ArrayList<Reservation>();
    
    public void addReservation(int movie_id, String customer_name) {
        Reservation r = new Reservation(movie_id, customer_name);
        listReservation.add(r);
    }
    
    public boolean cancelReservation(String customer_name) {
        /* 예약 취소 기능 구현 코드를 작성합니다. */
        for (int i = 0; i < listReservation.size(); i++) {
            Reservation r = listReservation.get(i);
            if (r.getCustomerName().equals(customer_name)) {
                listReservation.remove(i);
                return true;
            }
        }
        return false;
    }

    public int reservedCount(int movie_id) {
        int count = 0;
        for (Reservation item : listReservation) {
            if (item.getMovieID() == movie_id) {
                count++;
            }
        }

        return count;
    }
}
