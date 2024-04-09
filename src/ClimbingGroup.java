package climbinggroup;

import alpinist.Alpinist;
import mountain.Mountain;

import java.util.ArrayList;
import java.util.List;

public class ClimbingGroup {
    private boolean isRecruitmentOpen;
    private List<Alpinist> alpinists;
    private Mountain mountain;

    public ClimbingGroup(boolean isRecruitmentOpen, Mountain mountain) {
        this.isRecruitmentOpen = isRecruitmentOpen;
        this.alpinists = new ArrayList<>();
        this.mountain = mountain;
    }

    // Геттеры и сеттеры
    public boolean isRecruitmentOpen() {
        return isRecruitmentOpen;
    }

    public void setRecruitmentOpen(boolean recruitmentOpen) {
        isRecruitmentOpen = recruitmentOpen;
    }

    public List<Alpinist> getAlpinists() {
        return alpinists;
    }

    public void setAlpinists(List<Alpinist> alpinists) {
        this.alpinists = alpinists;
    }

    public Mountain getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

    public void addAlpinist(Alpinist alpinist) {
        if (isRecruitmentOpen) {
            alpinists.add(alpinist);
            System.out.println(alpinist.getName() + " добавлен в группу для восхождения на гору " + mountain.getName());
        } else {
            System.out.println("Набор в группу для восхождения на гору " + mountain.getName() + " закрыт");
        }
    }
}
