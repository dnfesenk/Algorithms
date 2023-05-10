package com.denisfesenko;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * From testdome.com
 */
public class CarRental {
    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        List<RentalTime> sortedRentalTimes = new ArrayList<>(rentalTimes);
        sortedRentalTimes.sort(Comparator.comparing(RentalTime::getStart));

        for (int i = 0; i < sortedRentalTimes.size() - 1; i++) {
            RentalTime current = sortedRentalTimes.get(i);
            RentalTime next = sortedRentalTimes.get(i + 1);

            if (current.getEnd().after(next.getStart())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));
    }
}

class RentalTime {
    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
